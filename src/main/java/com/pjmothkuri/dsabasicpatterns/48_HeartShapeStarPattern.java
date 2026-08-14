package com.pjmothkuri.dsabasicpatterns;

public class HeartShapeStarPattern {

    public static void heartShape() {
        // Upper arches
        for (int i = 3; i < 6; i += 2) {
        for (int j = 1; j < 6 - i; j += 2) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        for (int j = 1; j <= 6 - i; j++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
        }
        // Lower pointing inverted triangle
        for (int i = 9; i >= 1; i -= 2) {
        for (int j = 1; j <= 9 - i; j += 2) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
        }
    }

    public static void main(String[] args) {
        heartShape();
    }
}
