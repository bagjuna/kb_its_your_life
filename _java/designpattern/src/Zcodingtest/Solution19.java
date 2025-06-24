package Zcodingtest;

import java.util.*;

class Solution19 {

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution19.permute(nums);
        System.out.println(result);
    }

    static List<List<Integer>> answer;
    static int size;
    static int[] numbers;

    public List<List<Integer>> permute(int[] nums) {
        answer = new ArrayList<>();
        size = nums.length;
        numbers = nums;
        dfs(new ArrayList());
        return answer;
    }

    static void dfs(ArrayList<Integer> prev_list) {
        if (prev_list.size() == size) {
            answer.add(prev_list);
            return;
        }
        for (int curr : numbers) {
            if (prev_list.contains(curr)) {
                continue;
            }
            ArrayList<Integer> curr_list = new ArrayList<>(prev_list);
            curr_list.add(curr);
            dfs(curr_list);
        }


    }
}