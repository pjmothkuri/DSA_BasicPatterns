public class DiagonalAlphabetCrossXrepresentation {

    public static void diagonalCharCross(int n) {
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        if (i == j || i + j == n - 1) {
        System.out.print((char) ('A' + i));
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        diagonalCharCross(5);
    }
}
