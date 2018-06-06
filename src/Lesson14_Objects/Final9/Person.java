package Lesson14_Objects.Final9;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    private List<Money> allMoney;

    Person(String name){
        this.name = name;
        this.allMoney = new ArrayList<Money>();
        allMoney.add(new USD(20));
        allMoney.add(new Hrivna(5));
    }


    public List<Money> getAllMoney()
    {
        return allMoney;
    }
}
