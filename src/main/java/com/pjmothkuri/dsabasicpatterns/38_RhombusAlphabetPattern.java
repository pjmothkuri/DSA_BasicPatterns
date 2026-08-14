package com.pjmothkuri.dsabasicpatterns;

public class RhombusAlphabetPattern {

    public static void rhombusAlphabet(int n) {
        for (int i = 0; i < n; i++) {
        for (int j = 1; j < n - i; j++) System.out.print(" ");
        for (int k = 0; k < n; k++) {
        System.out.print((char) ('A' + k));
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombusAlphabet(5);
    }
}
