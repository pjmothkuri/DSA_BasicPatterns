package com.pjmothkuri.dsabasicpatterns;

public class HollowCharacterSquare {

    public static void hollowCharSquare(int n) {
        for (int i = 0; i < n; i++) {
        char ch = (char) ('A' + i);
        for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
        System.out.print(ch);
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowCharSquare(5);
    }
}
