package Zcodingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 14501번 퇴사
 * https://www.acmicpc.net/problem/14501
 * 시간복잡도: O(N^2)
 * 공간복잡도: O(N)
 */
public class Main10 {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Work> works = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            Work temp = new Work(sc.nextInt(), sc.nextInt());
            works.add(temp);
        }

        int[] dp = new int[N + 1];
        System.out.println(works);
        for(int i = 0; i < N; i++) {
            Work curr = works.get(i);
            for(int j = i + curr.time; j < N + 1; j++){
                if(dp[j] < dp[i] + curr.price){
                    dp[j] = dp[i]+ curr.price;
                }
            }

        }
        System.out.println(dp[dp.length-1]);


    }

    static class Work{
        int time;
        int price;
        Work(int time, int price){
            this.time = time;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Work{" +
                    "time=" + time +'\'' +
                    ", price='" + price +
                    '}';
        }
    }


}
