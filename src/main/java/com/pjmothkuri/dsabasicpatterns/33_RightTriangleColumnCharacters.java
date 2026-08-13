public class RightTriangleColumnCharacters {

    public static void charColTriangle(int n) {
        for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + j));
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        charColTriangle(5);
    }
}
