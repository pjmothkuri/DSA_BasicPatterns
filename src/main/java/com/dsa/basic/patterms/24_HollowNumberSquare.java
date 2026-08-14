package com.dsa.basic.patterms;

public class HollowNumberSquare {

    public static void hollowNumberSquare(int n) {
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
        System.out.print(j);
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowNumberSquare(5);
    }
}
