package Zcodingtest;

import java.util.*;

public class baekjoon_19238 {
    static int N, M, fuel; //영역 NxN, 승객 수, 초기 연료
    static int[][] map;
    static Taxi taxi;
    static Map<Point, Point> passengers = new HashMap<>(); // 승객 1명의 출발점(key), 도착점(value)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1,};

    static class Point {
        int row, col;

        Point(int row, int col) {
            this.row = row;
            this.col = col;
        }


        @Override
        public boolean equals(Object o) {
            // 현재 객체와 비교 대상이 같은 주소라면
            if (this == o) return true;
            // 비교 대상이 null이거나 Point 클래스가 아니면
            if (o == null || getClass() != o.getClass()) return false;
            // 형 변환 후
            Point point = (Point) o;
            // row, col과 point.row, point.col이 값으로 같은지 비교
            return row == point.row && col == point.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }

    static class Taxi {
        int row, col;

        Taxi(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static class PassengerWithDistance implements Comparable<PassengerWithDistance> {
        @Override
        public int compareTo(PassengerWithDistance o) {
            // 거리 오름차순, 행 오름차순, 열 오름차순
            if (this.dist != o.dist) return Integer.compare(this.dist, o.dist);
            if (this.row != o.row) return Integer.compare(this.row, o.row);
            return Integer.compare(this.col, o.col);
        }

        int row, col, dist;

        PassengerWithDistance(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
		    /////////////////// 값 입력받기 //////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        fuel = sc.nextInt();

        map = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                map[i][j] = sc.nextInt();

        taxi = new Taxi(sc.nextInt() - 1, sc.nextInt() - 1);

        for (int i = 0; i < M; i++) {
            int startr = sc.nextInt() - 1;
            int startc_ = sc.nextInt() - 1;
            int endr = sc.nextInt() - 1;
            int endc = sc.nextInt() - 1;
            passengers.put(new Point(startr, startc_), new Point(endr, endc));
        }

        for (int i = 0; i < M; i++) {
        
            PassengerWithDistance customer = findNearestCustomer();
            // 승객이 없는지 or 현재 연료로 갈 수 있는지
            if (customer == null || customer.dist > fuel) {
                System.out.println(-1);
                return;
            }
            fuel -= customer.dist;
            taxi.row = customer.row;
            taxi.col = customer.col;
            

            Point destination = passengers.get(new Point(customer.row, customer.col));
            int toDest = bfs(taxi.row, taxi.col, destination.row, destination.col);
            if (toDest == -1 || toDest > fuel) {
                System.out.println(-1);
                return;
            }
            fuel -= toDest;
            fuel += toDest * 2;
            taxi.row = destination.row;
            taxi.col = destination.col;
            // 
            passengers.remove(new Point(customer.row, customer.col));
        }
        System.out.println(fuel);
    }
    ///////////////////////////////////////////////////////////////////////////////

    static PassengerWithDistance findNearestCustomer() {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        q.offer(new int[]{taxi.row, taxi.col, 0});
        visited[taxi.row][taxi.col] = true;

        List<PassengerWithDistance> candidates = new ArrayList<>();

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], dist = cur[2];
            Point p = new Point(r, c);
            
            // 택시의 위치가 승객들의 출발지와 일치할 때
            if (passengers.containsKey(p)) {
                candidates.add(new PassengerWithDistance(r, c, dist));
            }
            
            for (int d = 0; d < 4; d++) {
                int nr = r + dx[d];
                int nc = c + dy[d];
                if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc] && map[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc, dist + 1});
                }
            }
        }

        if (candidates.isEmpty()) return null;
        candidates.sort((o1, o2) -> {
            if (o1.dist != o2.dist) return Integer.compare(o1.dist, o2.dist);
            if (o1.row != o2.row) return Integer.compare(o1.row, o2.row);
            return Integer.compare(o1.col, o2.col);
        });
        // 대상에 맞는 승객 1명만 반환
        return candidates.get(0);
    }

    static int bfs(int startr, int startc, int endr, int endc) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        q.offer(new int[]{startr, startc, 0});
        visited[startr][startc] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], dist = cur[2];
            if (r == endr && c == endc) return dist;

            for (int d = 0; d < 4; d++) {
                int nr = r + dx[d];
                int nc = c + dy[d];
                if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc] && map[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc, dist + 1});
                }
            }
        }

        return -1;
    }
}