package com.pjmothkuri.dsabasicpatterns;

public class DiamondNumbers {

    public static void diamondNumbers(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) System.out.print(" ");
        for (int k = i; k >= 1; k--) System.out.print(k);
        for (int m = 2; m <= i; m++) System.out.print(m);
        System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
        for (int j = 1; j <= n - i; j++) System.out.print(" ");
        for (int k = i; k >= 1; k--) System.out.print(k);
        for (int m = 2; m <= i; m++) System.out.print(m);
        System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondNumbers(5);
    }
}
