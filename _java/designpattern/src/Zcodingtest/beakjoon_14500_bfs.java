package Zcodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 14500번 테트로미노
public class beakjoon_14500_bfs {
    static int N, M;
    static int[][] map;
    static int max = 0;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x, y, sum, count;
        boolean[][] visited;

        Node(int x, int y, int sum, int count, boolean[][] visited) {
            this.x = x;
            this.y = y;
            this.sum = sum;
            this.count = count;
            this.visited = visited;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bfs(i, j);
                checkT(i, j);
            }
        }

        System.out.println(max);
    }

    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        visited[x][y] = true;
        q.add(new Node(x, y, map[x][y], 1, visited));

        while (!q.isEmpty()) {
            Node node = q.poll();

            if (node.count == 4) {
                max = Math.max(max, node.sum);
                continue;
            }

            for (int d = 0; d < 4; d++) {
                int nx = node.x + dx[d];
                int ny = node.y + dy[d];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (node.visited[nx][ny]) continue;

                // 새 visited 복사
                boolean[][] newVisited = new boolean[N][M];
                for (int i = 0; i < N; i++) {
                    System.arraycopy(node.visited[i], 0, newVisited[i], 0, M);
                }
                newVisited[nx][ny] = true;

                q.add(new Node(nx, ny, node.sum + map[nx][ny], node.count + 1, newVisited));
            }
        }
    }

    static void checkT(int x, int y) {
        int wing = 0;
        int sum = map[x][y];
        int min = Integer.MAX_VALUE;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

            wing++;
            sum += map[nx][ny];
            min = Math.min(min, map[nx][ny]);
        }

        if (wing < 3) return;
        if (wing == 4) sum -= min;

        max = Math.max(max, sum);
    }
}