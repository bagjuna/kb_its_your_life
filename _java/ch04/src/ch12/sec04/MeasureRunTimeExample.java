package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int sum = 0;
        long sum2 = 0;

        for (int i = 1; i < 1000000; i++) {
            sum += i;
            sum2 += i;
        }
        long end = System.nanoTime();
        System.out.println("1~1000000까지의 합: " + sum);
        System.out.println("1~1000000까지의 합: " + sum2);
        System.out.println(end - start);
    }
}