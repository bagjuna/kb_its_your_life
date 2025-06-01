package Zcodingtest;
import java.util.*;

class Solution5 {
    public String solution(String[][] folders, String p, String q) {
        Map<String, String> parentMap = new HashMap<>();

        for (String[] folder : folders) {
            String parent = folder[0];
            String child = folder[1];
            parentMap.put(child, parent);
        }


        // p의 모든 조상 경로 저장
        Set<String> pAncestors = new HashSet<>();

        while (p != null) {
            pAncestors.add(p);
            p = parentMap.get(p);
        }

        // q의 조상 중 p 경로에 있는 것 중 가장 가까운 것 찾기
        while (q != null) {
            if (pAncestors.contains(q)) {
                return q;
            }
            q = parentMap.get(q);
        }

        return "root"; // fallback, 이론상 도달하지 않음
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();

        String[][] folders1 = {{"root", "apps"}, {"apps", "chrome"}, {"apps", "vscode"}};
        System.out.println(s.solution(folders1, "chrome", "vscode")); // apps

        String[][] folders2 = {{"root", "usr"}, {"usr", "bin"}, {"usr", "local"}, {"bin", "tools"}};
        System.out.println(s.solution(folders2, "bin", "tools")); // bin

        String[][] folders3 = {
                {"root", "media"}, {"media", "images"}, {"media", "videos"},
                {"images", "holiday"}, {"videos", "concert"}};
        System.out.println(s.solution(folders3, "holiday", "concert")); // media
    }
}