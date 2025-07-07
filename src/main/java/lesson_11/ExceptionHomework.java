package lesson_11;

import java.util.Random;

public class ExceptionHomework {
    public static void main(String[] args) {
        Random x = new Random();
        String[][] arr1 = new String[4][4];
        String[][] arr2 = new String[5][4];
        String[][] arr3 = new String[4][];
        arr3[0] = new String[4];
        arr3[1] = new String[4];
        arr3[2] = new String[5];
        arr3[3] = new String[4];
        String[][] arr4 = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr1[i][j] = String.valueOf(x.nextInt(10));
                arr2[i][j] = String.valueOf(x.nextInt(10));
                arr3[i][j] = String.valueOf(x.nextInt(10));
                arr4[i][j] = String.valueOf(x.nextInt(10));
            }
            arr2[4][i] = String.valueOf(x.nextInt(10)); //filling the extra row
        }
        arr3[2][4] = String.valueOf(x.nextInt(10)); //filling the extra cell
        arr4[x.nextInt(4)][x.nextInt(4)] = "A"; //making an invalid value in a random cell

        System.out.print("First array sum: ");
        try { System.out.println(convertStringMatrixToInt(arr1)); }
        catch (Exception e) { System.out.println(e.getMessage()); }

        System.out.print("Second array sum: ");
        try { System.out.println(convertStringMatrixToInt(arr2)); }
        catch (Exception e) { System.out.println(e.getMessage()); }

        System.out.print("Third array sum: ");
        try { System.out.println(convertStringMatrixToInt(arr3)); }
        catch (Exception e) { System.out.println(e.getMessage()); }

        System.out.print("Fourth array sum: ");
        try { System.out.println(convertStringMatrixToInt(arr4)); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }

    private static int convertStringMatrixToInt(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) { throw new MyArraySizeException(); }
        else {
            for (String[] s: arr) {
                if (s.length != 4) { throw new MyArraySizeException(); }
            }
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return sum;
        }
    }

    public static class MyArraySizeException extends Exception{
        public MyArraySizeException() {
            super("Received array has invalid size");
        }
    }

    public static class MyArrayDataException extends Exception{
        public MyArrayDataException(int row, int col) {
            super("Failed processing the array cell on row " + row + " and column " + col);
        }
    }
}
