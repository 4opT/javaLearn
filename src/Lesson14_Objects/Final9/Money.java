package Lesson14_Objects.Final9;

public class Money {
    private int amount;
    public int getAmount(){
        return this.amount;
    }

    public Money(int amount) {
        this.amount = amount;
    }

    public String getCurrencyName(){
        return "money";
    }
}
