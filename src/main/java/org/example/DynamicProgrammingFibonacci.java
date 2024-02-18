package org.example;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgrammingFibonacci {
    private static final Map<Integer, Long> memoizMap = new HashMap<>();

    public static long dynamicProgrammingFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memoizMap.containsKey(n)) {
            return memoizMap.get(n);
        }

        long fib = dynamicProgrammingFibonacci(n - 1) + dynamicProgrammingFibonacci(n - 2);
        memoizMap.put(n, fib);

        return fib;
    }
}
