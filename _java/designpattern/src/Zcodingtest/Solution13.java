package Zcodingtest;

import java.util.*;
class Solution13 {
    public int solution(int[] queue1, int[] queue2) {
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<Integer> q2 = new ArrayDeque<>();

        long q1Sum = 0;
        long q2Sum = 0;
        for(int i: queue1){
            q1Sum += i;
            q1.add(i);
        }
         for(int i: queue2){
            q2Sum += i;
            q2.add(i);
        }

        for (int i = 0; i < queue1.length * 3; i++) {
            if (q1Sum == q2Sum) {
                return i;
            } else if (q1Sum > q2Sum) {
                Integer value = q1.poll();
                q2.add(value);
                q1Sum -= value;
                q2Sum += value;
            }else {
                Integer value = q2.poll();
                q1.add(value);
                q2Sum -= value;
                q1Sum += value;
            }

        }

        return -1;
    }
   

}