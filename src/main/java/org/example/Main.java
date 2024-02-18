package org.example;

import static org.example.DynamicProgrammingFibonacci.dynamicProgrammingFibonacci;
import static org.example.IterativeFibonacci.iterativeFibonacci;
import static org.example.RecursiveFibonacci.recursiveFibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci version implementation");
        int n = 20;
        long starTime1 = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci(" + n + "): " + iterativeFibonacci(n));
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time = " + (endTime1-starTime1));
        long starTime2 = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci(" + n + "): " + recursiveFibonacci(n));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time = " + (endTime2-starTime2));
        long starTime3 = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci(" + n + "): " + dynamicProgrammingFibonacci(n));
        long endTime3 = System.currentTimeMillis();
        System.out.println("Time = " + (endTime3-starTime3));


    }
}
