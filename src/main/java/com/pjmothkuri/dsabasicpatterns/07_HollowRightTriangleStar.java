package com.pjmothkuri.dsabasicpatterns;

public class HollowRightTriangleStar {

    public static void hollowRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i || i == n) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRightTriangle(5);
    }
}
