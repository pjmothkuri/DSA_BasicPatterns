package com.pjmothkuri.dsabasicpatterns;

public class ConcentricSquarePattern {

    public static void concentricSquare(int n) {
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
        // Value at coordinate matches distance to closest wall boundary
        int val = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
        System.out.print(val);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        concentricSquare(5);
    }
}
