package lesson_7;

public class _8_Diagonals {
    public static void method6() {
        int n = 15;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }
}
