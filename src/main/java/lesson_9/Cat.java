package lesson_9;

import java.util.Random;

public class Cat extends Animal {
    private static int animalCount = 0; //for task #4
    private boolean fullness = false;

    public Cat(String name) {
        super(name);
        animalCount++; //for task #4
    }

    @Override
    public void run(int len){ //for task #2
        len = Math.abs(len);
        if (len < 200) {
            System.out.println("Cat " + this.getName() + " ran " + len + " meters");
        }
        else {
            System.out.println("Cat " + this.getName() + " cannot run for " + len + " meters");
        }
    }

    @Override
    public void swim(int len) {
        System.out.println("Cat " + this.getName() + " cannot swim!");
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public Boolean isFull() {
        return fullness;
    }

    public void eat(Bowl b){
        if (fullness) {
            System.out.println("Cat " + getName() + " won't eat, the stomach is full!");
        }
        else {
            Random r = new Random();
            int food = r.nextInt(15, 25);
            if (b.eat(food)) {
                fullness = true;
                System.out.println("Cat " + getName() + " successfully ate " + food + " food! The bowl has " + b.getAmountOfFood() + " food left.");
            }
            else {
                System.out.println("Cat " + getName() + " couldn't eat, there is not enough food! Need " + food + " while the bowl has only " + b.getAmountOfFood());
            }
        }
    }
}
