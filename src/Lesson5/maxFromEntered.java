package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxFromEntered {


    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter mumber 1");
        float num1=Float.parseFloat(reader.readLine());
        System.out.println("enter number 2");
        float num2=Float.parseFloat(reader.readLine());
        findMax(num1,num2);

    }

    public static void findMax(float a,float b){
        if (a>=b) System.out.println(a);
        if (b>a) System.out.println(b);

    }
}
