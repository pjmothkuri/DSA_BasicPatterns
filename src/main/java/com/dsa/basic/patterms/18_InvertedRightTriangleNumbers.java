package com.dsa.basic.patterms;

public class InvertedRightTriangleNumbers {

    public static void invertedNumberTriangle(int n) {
        for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
        System.out.print(j);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedNumberTriangle(5);
    }
}
