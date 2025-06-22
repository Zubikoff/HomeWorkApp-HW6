package lesson_7;

public class _10_ArrElementsShift {

    //first variant
    public static int[] method10(int[] arr, int n) {
        int newPos, mem1,  mem2, step = 0;
        boolean direction = true; //which direction we shift the array
        if (n < 0) {
            direction = false;
            n = -n;
        }
        while (step < n) {
            if (direction) {
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

    //another variant
    public static int[] method10_2(int[] arr, int n) {
        int newPos, mem1,  mem2, step = 0;
        n = n % arr.length; //every arr.length shifts we will see the same array as the initial
        if (n < 0) {
            n = arr.length + n; //shifting n times to the left means shifting arr.length-n times to the right
        }
        while (step < n) {
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
}


