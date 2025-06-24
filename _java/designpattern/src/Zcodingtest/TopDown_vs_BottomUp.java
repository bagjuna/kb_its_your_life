package Zcodingtest;

import java.util.HashMap;
import java.util.Map;

public class TopDown_vs_BottomUp {

    static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        long n = 40; // Change this value to test different Fibonacci numbers
        long resultTopDown = fibonacci(n);
//        long resultTopDown = fibonacci_top_down(n);
        long endTimeMillis = System.currentTimeMillis();
        System.out.println("Top-Down Fibonacci(" + n + ") = " + resultTopDown);
        System.out.println("Top-Down Time: " + (endTimeMillis - currentTimeMillis) + " ms");
    }

    static long fibonacci_top_down(long n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, fibonacci_top_down(n - 1) + fibonacci_top_down(n - 2));
        }
        return memo.get(n);
    }

    static long fibonacci_for(long n) {
        long[] fib = new long[(int) (n + 1)];
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[(int) n];
    }

    static long fibonacci(long n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
