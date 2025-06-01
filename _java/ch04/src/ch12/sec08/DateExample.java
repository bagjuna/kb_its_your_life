package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        // 현재 날짜 데이터를 "2024.06.15 15:22:20"와 같은 포맷으로 출력하세요.
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String strNow2 = dtf.format(now);
        System.out.println("현재 날짜: " + strNow2);
    }
}