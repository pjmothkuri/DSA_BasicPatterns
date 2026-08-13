public class HollowInvertedRightTriangleStar {

    public static void hollowInvertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
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
        hollowInvertedRightTriangle(5);
    }
}
