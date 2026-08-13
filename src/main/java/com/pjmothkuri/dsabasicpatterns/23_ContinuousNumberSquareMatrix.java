public class ContinuousNumberSquareMatrix {

    public static void continuousSquare(int rows, int cols) {
        int val = 1;
        for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= cols; j++) {
        System.out.printf("%2d ", val++);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        continuousSquare(5, 5);
    }
}
