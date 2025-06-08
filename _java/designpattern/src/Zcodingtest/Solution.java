package Zcodingtest;
//
//import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        String temp;
//        HashMap<String,Integer> set = new HashMap<>(
//                new Comparator<>()
//        );
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                temp = s.substring(j, s.length());
//                set.add(temp);
//            }
//
//        }
//
//
//
//        for (String word : set) {
//            System.out.println(word);
//        }
//
//        System.out.println("문자열 : " + s);
//        return answer;
//    }
//}