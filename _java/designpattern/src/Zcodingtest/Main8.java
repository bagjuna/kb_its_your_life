package Zcodingtest;

import java.util.*;

public class Main8 {
    static int N, M, fuel;
    static int[][] map;
    static int tx, ty;
    static Passenger[] passengers;
    static int[] dx = {-1, 0, 0, 1}; // 상좌우하 순서
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        fuel = sc.nextInt();
        map = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                map[i][j] = sc.nextInt();

        tx = sc.nextInt() - 1;
        ty = sc.nextInt() - 1;

        passengers = new Passenger[M];
        for (int i = 0; i < M; i++) {
            int sx = sc.nextInt() - 1;
            int sy = sc.nextInt() - 1;
            int ex = sc.nextInt() - 1;
            int ey = sc.nextInt() - 1;
            passengers[i] = new Passenger(sx, sy, ex, ey);
        }

        for (int i = 0; i < M; i++) {
            int[] result = findPassenger(); // [거리, 승객 인덱스, 승객x, 승객y]
            int distToPassenger = result[0];
            int index = result[1];

            if (distToPassenger == -1 || fuel < distToPassenger) {
                System.out.println(-1);
                return;
            }

            fuel -= distToPassenger;
            tx = passengers[index].sx;
            ty = passengers[index].sy;

            int distToDest = bfs(tx, ty, passengers[index].ex, passengers[index].ey);
            if (distToDest == -1 || fuel < distToDest) {
                System.out.println(-1);
                return;
            }

            fuel += distToDest; // 갔다온 거리의 2배 얻음 -> 연료 회복량 = 소비한 distToDest
            tx = passengers[index].ex;
            ty = passengers[index].ey;
            passengers[index].served = true;
        }

        System.out.println(fuel);
    }

    static int[] findPassenger() {
        // 현재 택시 위치에서 각 승객까지의 "최단 거리"를 알아내는 것이 핵심.
        // 그리고 그 중 가장 가까운 승객을 우선순위에 따라 선택.

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{tx, ty, 0}); // x, y, distance

        boolean[][] visited = new boolean[N][N];
        visited[tx][ty] = true;

        // 찾은 후보 승객들을 임시 저장 (같은 최단 거리에 여러 명 있을 수 있음)
        List<PassengerInfo> candidates = new ArrayList<>();
        int shortestDistFound = Integer.MAX_VALUE; // 발견된 가장 짧은 승객까지의 거리

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            // 이미 찾은 최단 거리보다 현재 탐색 거리가 멀다면 더 이상 탐색 불필요
            if (dist > shortestDistFound) {
                break;
            }

            // 현재 위치(x, y)에 아직 서비스받지 않은 승객이 있는지 확인
            for (int i = 0; i < M; i++) {
                if (!passengers[i].served && passengers[i].sx == x && passengers[i].sy == y) {
                    // 승객을 찾았고, 이 승객까지의 거리가 현재까지 찾은 최단 거리와 같거나 더 짧으면 후보에 추가
                    if (dist <= shortestDistFound) {
                        shortestDistFound = dist; // 최단 거리 갱신
                        candidates.add(new PassengerInfo(dist, x, y, i));
                    }
                }
            }

            // 다음 위치 탐색 (현재 찾은 최단 거리보다 멀어지지 않는 선에서만 진행)
            // 또는, candidates가 비어있을 때만 진행 (아직 아무 승객도 못 찾았거나, 현재 거리에서 더 찾아야 할 때)
            if (candidates.isEmpty() || dist < shortestDistFound) {
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny, dist + 1});
                    }
                }
            }
        }

        if (candidates.isEmpty()) {
            return new int[]{-1, -1, -1, -1}; // 도달 가능한 승객 없음
        }

        // 후보 승객들을 문제의 우선순위에 따라 정렬
        // 1. 거리, 2. 행 번호, 3. 열 번호
        candidates.sort((p1, p2) -> {
            if (p1.dist != p2.dist) {
                return Integer.compare(p1.dist, p2.dist);
            }
            if (p1.x != p2.x) {
                return Integer.compare(p1.x, p2.x);
            }
            return Integer.compare(p1.y, p2.y);
        });

        PassengerInfo bestPassenger = candidates.get(0);
        return new int[]{bestPassenger.dist, bestPassenger.index, bestPassenger.x, bestPassenger.y};
    }

    static int bfs(int sx, int sy, int ex, int ey) {
        boolean[][] visited = new boolean[N][N];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy, 0});
        visited[sx][sy] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], dist = cur[2];

            if (x == ex && y == ey) return dist;

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (0 <= nx && nx < N && 0 <= ny && ny < N && !visited[nx][ny] && map[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }

        return -1;
    }

    static class Passenger {
        int sx, sy, ex, ey;
        boolean served = false;

        Passenger(int sx, int sy, int ex, int ey) {
            this.sx = sx;
            this.sy = sy;
            this.ex = ex;
            this.ey = ey;
        }
    }

    // 승객 정보를 담을 간단한 내부 클래스 (정렬 및 관리에 용이)
    static class PassengerInfo {
        int dist;
        int x; // 승객의 출발 x (행)
        int y; // 승객의 출발 y (열)
        int index; // passengers 배열에서의 인덱스

        PassengerInfo(int dist, int x, int y, int index) {
            this.dist = dist;
            this.x = x;
            this.y = y;
            this.index = index;
        }
    }
}