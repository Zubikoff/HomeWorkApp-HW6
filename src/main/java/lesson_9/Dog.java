package lesson_9;

public class Dog extends Animal {
    private static int animalCount = 0; //for task #4

    public Dog(String name) {
        super(name);
        animalCount++; //for task #4
    }

    @Override
    public void run(int len){ //for task #2
        len = Math.abs(len);
        if (len < 500) {
            System.out.println("Dog " + this.getName() + " ran " + len + " meters");
        }
        else {
            System.out.println("Dog " + this.getName() + " cannot run for " + len + " meters");
        }
    }

    @Override
    public void swim(int len) {
        len = Math.abs(len);
        if (len < 10) {
            System.out.println("Dog " + this.getName() + " swam " + len + " meters");
        }
        else {
            System.out.println("Dog " + this.getName() + " cannot swim for " + len + " meters");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
