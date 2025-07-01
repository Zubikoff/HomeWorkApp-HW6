package lesson_10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        float sum = 0;
        for (T f: fruits) {
            sum += f.getWeight();
        }
        return sum;
    }

    public Boolean compare(Box<?> box){
        return this.getWeight()==box.getWeight();
    }

    public void transferFruits(Box<T> box){
        while (!fruits.isEmpty()) {
            box.addFruit(fruits.removeFirst());
        }
    }
}
