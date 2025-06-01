package ch00;

import java.util.Scanner;

class SwitchValueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();

        //Java 11 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A" -> score1 = 100;
            case "B" -> score1 = 100 - 20;
            default -> score1 = 60;
        }

        System.out.println("score1: " + score1);
    }


}