public class LeftArrowStarPattern {

    public static void leftArrow(int n) {
        // Upper
        for (int i = n; i >= 1; i--) {
        for (int j = 1; j < i; j++) System.out.print(" ");
        for (int k = i; k <= n; k++) System.out.print("*");
        System.out.println();
        }
        // Lower
        for (int i = 2; i <= n; i++) {
        for (int j = 1; j < i; j++) System.out.print(" ");
        for (int k = i; k <= n; k++) System.out.print("*");
        System.out.println();
        }
    }

    public static void main(String[] args) {
        leftArrow(5);
    }
}
