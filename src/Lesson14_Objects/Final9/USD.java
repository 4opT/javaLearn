package Lesson14_Objects.Final9;

public class USD extends Money{
    public USD(int amount) {
        super(amount);
    }
    public String getCurrencyName(){
        return "USD";
    }
}
