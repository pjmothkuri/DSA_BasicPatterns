public class InvertedCharacterTriangleRepeatingRowwise {

    public static void invertedCharTriangle(int n) {
        for (int i = n - 1; i >= 0; i--) {
        char ch = (char) ('A' + i);
        for (int j = 0; j <= i; j++) {
        System.out.print(ch);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedCharTriangle(5);
    }
}
