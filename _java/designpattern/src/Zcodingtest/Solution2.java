package Zcodingtest;

import java.util.*;

class Solution2 {

    static int startA, startB;
    static int RA, RB;
    static int EndA, EndB;
    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};


    public Solution2() {
    }

    public int solution(String[] maps) {
        int answer = 0;
        N = maps.length;
        M = maps[0].length();
        map = new int[N][M];
        for (int i = 0; i < maps.length; i++) {
            String temp1 = maps[i];
            for (int j = 0; j < temp1.length(); j++) {
                char temp2 = temp1.charAt(j);
                if (temp2 == 'S') {
                    startA = i;
                    startB = j;
                } else if (temp2 == 'L') {
                    RA = i;
                    RB = j;
                } else if (temp2 == 'E') {
                    EndA = i;
                    EndB = j;
                }

                if (temp2 == 'X') {
                    map[i][j] = -1;
                } else {
                    map[i][j] = 1;
                }

            }
        }
        int temp = bfs(startA, startB, RA, RB);
        if (temp == -1) return -1;
        else answer = temp;

        temp = bfs(RA, RB, EndA, EndB);
        if (temp == -1) return -1;
        else answer += temp;

        return answer;
    }

    static int bfs(int A, int B, int toA, int toB) {
        visited = new boolean[N][M];
        visited[A][B] = true;
        Queue<Node> q = new ArrayDeque();
        q.add(new Node(A, B, 0));
        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.x == toA && curr.y == toB) {
                return curr.num++;
            }

            for (int i = 0; i < 4; i++) {
                int a = dx[i] + curr.x;
                int b = dy[i] + curr.y;
                int tmpCnt = curr.num + 1;
                if (NoValid(a, b) || visited[a][b]) continue;
                if (map[a][b] != -1) {
                    q.add(new Node(a, b, tmpCnt));
                    visited[a][b] = true;
                }
            }

        }
        return -1;
    }

    static boolean NoValid(int a, int b) {
        return a < 0 || b < 0 || a >= N || b >= M;

    }

    static class Node implements Comparable<Node> {
        int x;
        int y;
        int num;

        Node(int x, int y, int n) {
            this.x = x;
            this.y = y;
            num = n;
        }

        @Override
        public int compareTo(Node o) {
            if(this.num > o.num) {
                return 1;
            } else if (this.num < o.num) {
                return -1;
            } else {
                return 0;
            }
        }

    }
}