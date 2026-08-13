public class RowCountingSquareGrid {

    public static void rowCountingGrid(int n) {
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        System.out.print(i);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        rowCountingGrid(5);
    }
}
