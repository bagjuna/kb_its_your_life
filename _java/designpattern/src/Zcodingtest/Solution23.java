package Zcodingtest;

import java.util.*;

class Solution23 {
    static int M, N;
    final static int[] dx = {0, 1};
    final static int[] dy = {1, 0};
    static int[][] map;

    public static void main(String[] args) {
        // Input: m = 3, n = 2
        //Output: 3
        // Example usage
        Solution23 solution23 = new Solution23();
        int m = 3, n = 2;
        int result = solution23.uniquePaths(m, n);
        System.out.println(Arrays.deepToString(map));
        System.out.println("Number of unique paths: " + result);
    }

    public int uniquePaths(int m, int n) {
        M = m;
        N = n;
        map = new int[m][n];
//        map[0][0] = 1;
        for (int i = 0; i < m; i++) {
            Arrays.fill(map[i], -1);
        }

        System.out.println(Arrays.deepToString(map));
        return dfs(0, 0, 1);
    }

    static int dfs(int m, int n, int num) {
        int sum = 0;
        if (m == M - 1 && n == N - 1) {
            return num;
        }
        for (int i = 0; i < 2; i++) {
            int x = dx[i] + m;
            int y = dy[i] + n;

            if (valid(x, y) && map[x][y] == -1) {
                map[x][y] = num;
                sum += dfs(x, y, map[m][n]);
            }
        }
        return sum;
    }

    int a = Integer.max(1, 2);

    static boolean valid(int i, int j) {
        return i >= 0 && j >= 0 && M > i && N > j;
    }
}