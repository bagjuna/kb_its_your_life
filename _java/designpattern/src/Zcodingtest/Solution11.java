package Zcodingtest;

import java.util.*;

class Solution11 {

    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = solution11.solution(id_list, report, k);
        System.out.println(Arrays.toString(result)); // Expected output: [2, 1, 1, 0]

        // ["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        int[] result2 = solution11.solution(id_list2, report2, k2);
        System.out.println(Arrays.toString(result2)); // Expected output: [0, 0]
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        int size = id_list.length;
        int[] answer = new int[size];
        int[] reports = new int[size];
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        HashSet<String> visited = new HashSet<>();

        HashMap<String, Integer> reportCount = new HashMap<>();
        HashMap<String, List<String>> reportPerson = new HashMap<>();

        // 신고 받은 횟수 기억하기
        // 중복되는 신고 없에기

        for (String s : reportSet) {
            String[] split = s.split(" ");
            String from = split[0];
            String to = split[1];
            // 중복되는 신고 없애기
            if (visited.contains(split)) continue;
            visited.add(s);
            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);

            if (!reportPerson.containsKey(from)) {
                reportPerson.put(from, new ArrayList<String>());
            }

            reportPerson.get(from).add(to);

        }


        // k번 이상 신고 받은 사람들 찾기  
        for (int i = 0; i < id_list.length; i++) {
            String reporter = id_list[i];
            for (String reportee : reportPerson.getOrDefault(reporter, new ArrayList<>())) {
                if (reportCount.getOrDefault(reportee, 0) >= k) {
                    // 재재 받은 사람들 신호한 사람한테 알림주기 answer[i]++
                    answer[i] += 1;
                }

            }
        }

        return answer;
    }
}
