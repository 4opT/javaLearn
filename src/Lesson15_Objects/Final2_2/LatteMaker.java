package Lesson15_Objects.Final2_2;

public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Взяли маленьку кофейную кружку");
    }

    @Override
    void putIngredient() {
        System.out.println("Положили зерна, сахар, молоко");
    }

    @Override
    void pour() {
        System.out.println("Ебанули все миксером");
    }

    public LatteMaker() {
        super.makeDrink();
    }
}
