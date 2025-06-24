package Zcodingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution20 {

    public static void main(String[] args) {
        // Test the combine method
        Solution20 solution = new Solution20();
        List<List<Integer>> result = solution.combine(4, 2);
        System.out.println(result); // Expected output: [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
    }

    static Set<List<Integer>> answer;
    static int N, K;

    public List<List<Integer>> combine(int n, int k) {
        answer = new HashSet<>();
        N = n;
        K = k;
        dfs(1, new ArrayList());
        // Convert the Set to a List before returning
        List<List<Integer>> result = new ArrayList<>(answer);
        return result;

    }

    static void dfs(int start, List<Integer> prev_list) {
        if (prev_list.size() == K) {
            answer.add(new ArrayList<>(prev_list));
            return;
        }

        for (int i = start; i < N + 1; i++) {
            prev_list.add(i);
            dfs(i + 1, prev_list);
            prev_list.remove(prev_list.size() - 1);
        }


    }


}