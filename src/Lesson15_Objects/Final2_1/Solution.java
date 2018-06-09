package Lesson15_Objects.Final2_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(result);
    }
    public static Flyable result;
    public static void reset(){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            String type=reader.readLine();
            if (type.equals("plane")){
                int number=Integer.parseInt(reader.readLine());
                result=new Plane(number);
            } else if(type.equals("helicopter")){
                result=new Helicopter();
            } else throw new IllegalArgumentException();
        } catch (Exception e){
            System.out.println("Wrong params, pls try again");
            reset();
        }
    }

    static {
        reset();
    }
}
