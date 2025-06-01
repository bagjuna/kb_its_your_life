package Zcodingtest;

import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Set<Integer>[] arr = new HashSet[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new HashSet();
        }
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[0].length; j++) {
                if (i == j) continue;

                if (computers[i][j] == 0) {
                    if (!arr[i].contains(j) && !arr[j].contains(i)) {
                        answer++;
                        arr[i].add(j);
                        arr[j].add(i);
                    }

                }
            }
        }
        return answer;
    }
}