package lesson_7;

public class _10_ArrElementsShift {
    public static int[] method10(int[] arr, int n) {
        int newPos, mem1,  mem2, step = 0;
        boolean direction = true;
        if (n < 0) {
            direction = false;
            n = -n;
        }
        while (step < n) {
            if (direction) {
                mem1 = arr[0];
                mem2 = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (i < (arr.length - 1))
                        newPos = i + 1;
                    else
                        newPos = 0;
                    mem1 = arr[newPos];
                    arr[newPos] = mem2;
                    mem2 = mem1;
                }
            }
            else {
                mem1 = arr[arr.length - 1];
                mem2 = arr[arr.length - 1];
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (i > 0)
                        newPos = i - 1;
                    else
                        newPos = arr.length - 1;
                    mem1 = arr[newPos];
                    arr[newPos] = mem2;
                    mem2 = mem1;
                }
            }
            step++;
        }
        return arr;
    }

    public static int[] method10_2(int[] arr, int n) {
        int newPos, mem1,  mem2, step = 0;
        n = n % arr.length;
        if (n < 0) {
            n = arr.length + n;
        }
        while (step < n) {
            mem1 = arr[0];
            mem2 = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (i < (arr.length - 1))
                    newPos = i + 1;
                else
                    newPos = 0;
                mem1 = arr[newPos];
                arr[newPos] = mem2;
                mem2 = mem1;
            }
            step++;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        printArr(arr);
        printArr(method10(arr, 4));

        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("==================================");
        printArr(arr);
        printArr(method10(arr, -6));

        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("==================================");
        printArr(arr);
        printArr(method10_2(arr, 4));

        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("==================================");
        printArr(arr);
        printArr(method10_2(arr, -6));
    }
}


