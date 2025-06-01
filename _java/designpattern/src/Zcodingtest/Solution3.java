package Zcodingtest;

import java.util.*;

public class Solution3 {
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] result = solution3.solution(new String[][]{
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        });

        System.out.println(Arrays.toString(result)); // [1, 0, 1, 1, 1]
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            map = new char[5][5];
            List<int[]> people = new ArrayList<>();

            for (int j = 0; j < 5; j++) {
                map[j] = places[i][j].toCharArray();
                for (int k = 0; k < 5; k++) {
                    if (map[j][k] == 'P') {
                        people.add(new int[]{j, k});
                    }
                }
            }

            boolean valid = true;
            for (int[] person : people) {
                if (!bfs(person[0], person[1])) {
                    valid = false;
                    break;
                }
            }

            answer[i] = valid ? 1 : 0;
        }

        return answer;
    }

    static boolean bfs(int x, int y) {
        boolean[][] visited = new boolean[5][5];
        Queue<Person> q = new ArrayDeque<>();
        q.offer(new Person(x, y, 0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Person cur = q.poll();
            int cx = cur.x, cy = cur.y, dist = cur.dist;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                int nd = dist + 1;

                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5)
                    continue;
                if (visited[nx][ny] || map[nx][ny] == 'X')
                    continue;
                if (nd <= 2) {
                    if (map[nx][ny] == 'P') {
                        return false; // 거리두기 위반
                    }
                    q.offer(new Person(nx, ny, nd));
                    visited[nx][ny] = true;
                }
            }
        }
        return true;
    }

    static class Person {
        int x, y, dist;

        Person(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}