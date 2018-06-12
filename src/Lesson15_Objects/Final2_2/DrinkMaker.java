package Lesson15_Objects.Final2_2;

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    protected void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }

}
