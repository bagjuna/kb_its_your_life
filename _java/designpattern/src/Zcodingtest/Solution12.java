package Zcodingtest;

import java.util.*;

class Solution12 {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            // Rotate the string
            int[] queue1 = new int[]{1, 2, 3, 4, 5};
            Deque<Integer> q1 = new ArrayDeque<>(Arrays.stream(queue1).boxed().toList());
            // q에있는값 다 더하기
            q1.stream().mapToInt(Integer::intValue).sum();
            String rotated = sb.substring(i) + sb.substring(0, i);
            if (Valid(rotated)) {
                answer++;
            }
        }


        return answer;
    }

    static boolean Valid(String str) {
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char curr = array[i];
            if (stack.isEmpty()) {
                stack.push(curr);
                continue;
            }
            char prev = stack.peek();


            if (prev == '(' && curr == ')')
                stack.pop();
            else if (prev == '{' && curr == '}')
                stack.pop();
            else if (prev == '[' && curr == ']')
                stack.pop();
            else {
                stack.push(curr);
            }
        }


        return stack.isEmpty();
    }
}