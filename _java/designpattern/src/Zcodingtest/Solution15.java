package Zcodingtest;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/92341
class Solution15 {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = new int[records.length/2+1];
        int standTime = fees[0];
        int standFee = fees[1];
        int perTime = fees[2];
        int perMoney = fees[3];

        int cnt = 0;
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,Integer> time = new HashMap<>();

        for(String str :records){
            String[] token = str.split(" ");

            String curr_time = token[0];
            String curr_num = token[1];
            String curr_state = token[2];
            if(curr_state.equals("OUT")){
                String in_time = map.get(curr_num);
                String[] in = in_time.split(":");
                String[] out = curr_time.split(":");
                int hour = Integer.parseInt(out[0]) - Integer.parseInt(in[0]);
                int min = Integer.parseInt(out[1]) - Integer.parseInt(in[1]);
                int curr =  hour * 60 + min;
                if(curr <= standTime){
                    
                }
                answer[cnt++] = hour*60 + min;
            }else{
                map.put(curr_num,curr_time);
            }
        }
        return answer;
    }
}