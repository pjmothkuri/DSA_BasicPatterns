package com.pjmothkuri.dsabasicpatterns;

public class InvertedRightTriangle {

    public static void invertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedRightTriangle(5);
    }
}
