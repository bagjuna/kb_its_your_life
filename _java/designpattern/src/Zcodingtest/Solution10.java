package Zcodingtest;

import java.util.*;

class Solution10 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int size = id_list.length;
        int[] answer = new int[size];
        int[] reports = new int[size];
        HashSet<String> visited = new HashSet<>();

        HashMap<String, Integer> reportCount = new HashMap<>();
        HashMap<String, List<String>> reportPerson = new HashMap<>();

        // 신고 받은 횟수 기억하기
        // 중복되는 신고 없에기
        // k번 이상 신고 받은 사람들 찾기
        
        for (String s : report) {
            String[] splited = s.split("");
            String from = splited[0];
            String to = splited[1];
            // 중복되는 신고 없애기
            if (visited.contains(splited)) continue;
            visited.add(s);
            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);
        }

        for (String s : reportPerson.keySet()) {

        }


        return answer;
    }
}