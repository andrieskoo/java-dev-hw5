package org.example;

public class IterativeFibonacci {
    public static long iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fib = 0;
        long prev = 1;
        long temp;

        for (int i = 2; i <= n; i++) {
            temp = fib;
            fib = fib + prev;
            prev = temp;
        }
        return fib;
    }
}
