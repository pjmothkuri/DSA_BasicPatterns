public class SnakePatternNumbers {

    public static void snakePattern(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
        if (i % 2 == 0) {
        int start = i * cols + 1;
        for (int j = 0; j < cols; j++) System.out.printf("%2d ", start++);
        } else {
        int start = (i + 1) * cols;
        for (int j = 0; j < cols; j++) System.out.printf("%2d ", start--);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        snakePattern(5, 5);
    }
}
