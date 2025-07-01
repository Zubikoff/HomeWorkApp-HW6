package lesson_10;

import java.util.Arrays;

public class Testing {
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

        System.out.println("=================================");

        Box<Apple> b1 = new Box<>();
        for (int i = 0; i < 6; i++) {
            b1.addFruit(new Apple());
        }
        Box<Apple> b2 = new Box<>();
        for (int i = 0; i < 6; i++) {
            b2.addFruit(new Apple());
        }
        Box<Orange> b3 = new Box<>();
        for (int i = 0; i < 4; i++) {
            b3.addFruit(new Orange());
        }
        Box<Orange> b4 = new Box<>();
        for (int i = 0; i < 5; i++) {
            b4.addFruit(new Orange());
        }

        System.out.println("Box 1 and 2 weight is equal? " + b1.compare(b2));
        System.out.println("Box 1 and 3 weight is equal? " + b1.compare(b3));
        System.out.println("Box 1 and 4 weight is equal? " + b1.compare(b4));

        System.out.println("=================================");
        System.out.println("Box 1 weights " + b1.getWeight());
        System.out.println("Box 2 weights " + b2.getWeight());
        b1.transferFruits(b2);
        System.out.println("Box 1 weights " + b1.getWeight());
        System.out.println("Box 2 weights " + b2.getWeight());

        System.out.println("=================================");
        System.out.println("Box 3 weights " + b3.getWeight());
        System.out.println("Box 4 weights " + b4.getWeight());
        b3.transferFruits(b4);
        System.out.println("Box 3 weights " + b3.getWeight());
        System.out.println("Box 4 weights " + b4.getWeight());
    }
}
