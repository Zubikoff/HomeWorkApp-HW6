package lesson_7;

public class _5_Swap1and0 {
    public static void method5() {
        int[] binar = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < binar.length; i++) {
            if (binar[i] == 1) binar[i] = 0;
            else binar[i] = 1;
        }
    }
}
