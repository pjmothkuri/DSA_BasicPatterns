package com.pjmothkuri.dsabasicpatterns;

public class ButterflyStar {

    public static void butterfly(int n) {
        // Upper wing halves
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) System.out.print("*");
        for (int k = 1; k <= 2 * (n - i); k++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
        }
        // Lower wing halves
        for (int i = n - 1; i >= 1; i--) {
        for (int j = 1; j <= i; j++) System.out.print("*");
        for (int k = 1; k <= 2 * (n - i); k++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }
}
