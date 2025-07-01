package lesson_10;

import java.sql.SQLOutput;
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
}
