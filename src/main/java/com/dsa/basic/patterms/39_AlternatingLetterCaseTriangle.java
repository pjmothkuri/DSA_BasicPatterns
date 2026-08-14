package com.dsa.basic.patterms;

public class AlternatingLetterCaseTriangle {

    public static void alternatingCaseTriangle(int n) {
        for (int i = 0; i < n; i++) {
        char lower = (char) ('a' + i);
        char upper = (char) ('A' + i);
        for (int j = 0; j <= i; j++) {
        System.out.print((j % 2 == 0 ? lower : upper) + " ");
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        alternatingCaseTriangle(5);
    }
}
