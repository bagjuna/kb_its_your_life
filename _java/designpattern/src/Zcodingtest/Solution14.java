package Zcodingtest;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42586
class Solution14 {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = sol.solution(progresses, speeds);
        System.out.println(Arrays.toString(result)); // [2, 1]
        progresses = new int[]{95, 90, 99, 99, 80, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        result = sol.solution(progresses, speeds);
        System.out.println(Arrays.toString(result)); // [1, 3, 2]
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int N = progresses.length;
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            int progres = progresses[i];
            int time = 0;
            while (progres < 100) {
                time++;
                progres += speeds[i];
            }
            answer[i] = time;
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : answer) {
            q.add(i);
        }

        int cnt = 0;
        while (!q.isEmpty()) {
            int cnt_temp = 0;
            int temp = q.peek();
            if (temp <= cnt) {
                while (temp <= cnt && !q.isEmpty() && q.peek() <= cnt) {
                    cnt_temp++;
                    q.poll();
                }
            }
            if (cnt_temp > 0) {
                list2.add(cnt_temp);
            }

            cnt++;

        }


        int [] result = new int[list2.size()];
        if (list2.isEmpty()) {
            return result;
        }
        for (int i = 0; i < list2.size(); i++) {
            result[i] = list2.get(i);
        }

        return result;
    }
}