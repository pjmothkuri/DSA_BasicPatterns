package com.pjmothkuri.dsabasicpatterns;

public class RightTriangleIncrementalCharacters {

    public static void charIncrementalTriangle(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print(ch++);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        charIncrementalTriangle(5);
    }
}
