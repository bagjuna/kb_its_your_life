package Zcodingtest;

import java.util.*;

class Solution4 {
    static Map<Integer, List<Integer>> tree;
    static int minVal = Integer.MAX_VALUE;
    static int N;
    static boolean[] visited;
    static int num;

    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int n = 7;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {6, 5}, {7, 6}};
        System.out.println(sol.solution(n, wires));
    }

    public int solution(int n, int[][] wires) {
        tree = new HashMap<>();
        N = n;
        int answer = -1;


        for (int i = 1; i < n + 1; i++) {

            tree.put(i, new ArrayList<>());
        }
        for (int i = 0; i < wires.length; i++) {

            tree.get(wires[i][0]).add(wires[i][1]);
            tree.get(wires[i][1]).add(wires[i][0]);

        }

        for (int i = 1; i < n + 1; i++) {
            List<Integer> list = tree.get(i);
            if (list.size() != 2) continue;
            visited = new boolean[n + 1];
            visited[i] = true;
            System.out.println("i = " + i);
            int num1 = dfs(list.get(0), 0);
            int num2 = dfs(list.get(1), 0);
            System.out.println(num1 + " " + num2);

            minVal = Math.min(Math.abs(num1 - num2), minVal);
        }

        return minVal;
    }

    static int dfs(int start, int cnt) {

        List<Integer> list = tree.get(start);
        if (list.isEmpty()) return 0;

        for (int i : list) {
            if (!visited[i]) {
                visited[i] = true;
                cnt = dfs(i, cnt + 1);
            }

        }
        return cnt;

    }

}