package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Bonus1 {
    public static void main(String[] args) throws IOException {

        HashMap<String,Integer >mapMonths=new HashMap<String, Integer>();
        mapMonths.put("January", 1);
        mapMonths.put("February", 2);
        mapMonths.put("March", 3);
        mapMonths.put("April", 4);
        mapMonths.put("May", 5);
        mapMonths.put("June", 6);
        mapMonths.put("July", 7);
        mapMonths.put("August", 8);
        mapMonths.put("September", 9);
        mapMonths.put("October", 10);
        mapMonths.put("November", 11);
        mapMonths.put("December", 12);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String monthValue=reader.readLine();
        if (mapMonths.containsKey(monthValue)) System.out.println(monthValue+" is "+mapMonths.get(monthValue)+" month");
        else System.out.println("No such month");

    }

}
