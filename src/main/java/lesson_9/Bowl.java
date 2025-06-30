package lesson_9;

public class Bowl {
    private int amountOfFood;

    public Bowl(int food){
        if (food > 0) {
            amountOfFood = food;
        }
        else {
            amountOfFood = 0;
        }
    }

    public void addFood(int food){
        amountOfFood += food;
    }

    public boolean eat(int amount){
        if (amount>amountOfFood) { return false; }
        else {
            amountOfFood -= amount;
            return true;
        }
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }
}
