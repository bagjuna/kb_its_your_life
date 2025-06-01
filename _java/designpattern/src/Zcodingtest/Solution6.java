package Zcodingtest;

import java.util.*;

class Solution6 {
    public int solution(int[][] maps) {
        // bfs 최단거리 구하기
        // 시작점 예약 (0,0 거리 1)
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});

        int dist = 1;
        // 시작점 예약 (0,0 거리 0)
        while (!queue.isEmpty()) {
            int size = queue.size();  // 현재 거리의 노드 수

            for (int i = 0; i < size; i++) {
                int[] curr = queue.remove();

                int r = curr[0], c = curr[1];
                // if 도착지 도달하면 return dist;
                if (r == n - 1 && c == m - 1) return dist;
                // 다음 노드 예약
                for (int j = 0; j < 4; j++) {
                    int nr = r + dr[j], nc = c + dc[j];
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr][nc] == 1) {
                        queue.offer(new int[]{nr, nc});
                        maps[nr][nc] = 0;


                    }
                }

            }
            dist += 1;
        }

        return -1;
    }


}