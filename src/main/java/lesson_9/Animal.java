package lesson_9;

public class Animal {
    private final String name;
    private static int animalCount = 0; //for task #4

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Gena");
        cats[2] = new Cat("Ginger");

        Bowl bowl = new Bowl(50);

        for (int i = 0; i < 3; i++) {
            cats[i].eat(bowl);
        }
        for (int i = 0; i < 3; i++) {
            if (cats[i].isFull()) {
                System.out.println(cats[i].getName() + " is full.");
            }
            else {
                System.out.println(cats[i].getName() + " is hungry!");
            }
        }

        System.out.println("=====================================");

        Dog d1 = new Dog("Tofik");
        Dog d2 = new Dog("Bobik");

        // for task 4
        System.out.println("Count of Cats: " + Cat.getAnimalCount());
        System.out.println("Count of Dogs: " + Dog.getAnimalCount());
        System.out.println("Count of Animals: " + Animal.getAnimalCount());
    }

    public Animal(String name) {
        animalCount++; //for task #4
        this.name = name;
    }

    public void run(int len){ //for task #2
        System.out.println("Animal ran " + len + " meters");
    }

    public void swim(int len){ //for task #2
        System.out.println("Animal swam " + len + " meters");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
