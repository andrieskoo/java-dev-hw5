package org.example;

/**
 * Рекурсивний авріант:
 * Часова складність: O(2^n)
 * Просторова складність: O(n)
 */
public class RecursiveFibonacci {
    public static long recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
}
