package com.pjmothkuri.dsabasicpatterns;

public class SineWavePatternofStars {

    public static void sineWave(int cycles, int height) {
        for (int i = 0; i < height; i++) {
        for (int j = 0; j < cycles * 4; j++) {
        int wavePos = j % 4;
        if (wavePos == i || (wavePos == 4 - i)) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        sineWave(4, 3);
    }
}
