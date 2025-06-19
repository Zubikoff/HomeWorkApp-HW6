public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3, b = 5;
        if ((a+b) >= 0)
            System.out.println("The sum is positive");
        else
            System.out.println("The sum is negative");
    }

    public static void printColor() {
        int c = 300;
        if (c <= 0)
            System.out.println("Red");
        else if (c > 0 && c <= 100)
            System.out.println("Yellow");
        else
            System.out.println("Green");
    }

    public static void compareNumbers() {
        int a = 15, b = 5;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
