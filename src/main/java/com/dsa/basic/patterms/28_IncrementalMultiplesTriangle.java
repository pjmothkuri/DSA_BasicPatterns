package com.dsa.basic.patterms;

public class IncrementalMultiplesTriangle {

    public static void incrementalMultiples(int n, int multiplier) {
        int val = multiplier;
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print(val + " ");
        val += multiplier;
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        incrementalMultiples(4, 2);
    }
}
