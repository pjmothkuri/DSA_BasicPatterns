public class PlusSymbolPattern {

    public static void plusSymbol(int n) {
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        if (i == mid || j == mid) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        plusSymbol(5);
    }
}
