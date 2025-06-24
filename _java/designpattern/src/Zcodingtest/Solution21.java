package Zcodingtest;

import java.util.*;


class Solution21 {
    static int answer;
    static Set<String> visited;
    static String nums;

    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        System.out.println(sol.solution("17")); // 3
        System.out.println(sol.solution("011")); // 2
        System.out.println(sol.solution("123456789")); // 0
    }

    public int solution(String numbers) {

        nums = numbers;
        visited = new HashSet<>();

        dfs("");


        return answer;
    }


    static void dfs(String prev) {
        if (prev.length() > nums.length()) return;
        if(prev.isEmpty()) return;
        if (visited.contains(prev)) return;
        if (isPrime(Integer.parseInt(prev)))
            answer++;


        for (int i = 0; i < nums.length(); i++) {
            dfs(prev + nums.charAt(i));
        }


    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


}