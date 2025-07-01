package lesson_10;

import java.util.Arrays;

public class ArrayElementsSwap {
    public static <T> void Swap(T[] array, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex >= array.length || secondIndex >= array.length) {
            System.out.println("Cannot swap array elements. Given index is out of bounds of the array");
        }
        else {
            T buffer = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = buffer;
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "zero";
        arr[1] = "one";
        arr[2] = "two";
        arr[3] = "three";
        arr[4] = "four";
        arr[5] = "five";
        arr[6] = "six";

        System.out.println(Arrays.toString(arr));
        ArrayElementsSwap.<String>Swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
        ArrayElementsSwap.<String>Swap(arr, 1, 5);
        System.out.println(Arrays.toString(arr));
    }
}
