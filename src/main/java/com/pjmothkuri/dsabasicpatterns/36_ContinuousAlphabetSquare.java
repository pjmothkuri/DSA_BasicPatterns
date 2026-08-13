public class ContinuousAlphabetSquare {

    public static void charContinuousSquare(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        System.out.print(ch++);
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        charContinuousSquare(5);
    }
}
