package ch12.sec08;

import java.util.Calendar;
import java.util.Locale;

//Calendar 클래스를 이용하여 현재 날짜, 시간기준으로 다음과 같이 출력하세요.
public class CalendarExampleV2 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더함
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);

        String weekday = now.getDisplayName(
                Calendar.DAY_OF_WEEK,
                Calendar.LONG,
                Locale.KOREAN);

        String amPm = now.getDisplayName(
                Calendar.AM_PM,
                Calendar.SHORT,
                Locale.KOREAN);

        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        System.out.println("현재 날짜: " + year + "년" + month + "월" + day + "일");
        System.out.println(weekday + " "+amPm);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");

    }


}