package com.dsa.basic.patterms;

public class PalindromicAlphabetTriangle {

    public static void palindromicCharTriangle(int n) {
        for (int i = 0; i < n; i++) {
        for (int j = 1; j < n - i; j++) System.out.print(" ");
        for (int k = i; k >= 0; k--) System.out.print((char) ('A' + k));
        for (int m = 1; m <= i; m++) System.out.print((char) ('A' + m));
        System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromicCharTriangle(5);
    }
}
