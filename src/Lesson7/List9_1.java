package Lesson7;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List9_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        while (true){
            String s=reader.readLine();
            if(s.isEmpty())break;
            numbers.add(Integer.parseInt(s));
        }
        ArrayList<Integer>num3=new ArrayList<Integer>();
        ArrayList<Integer>num2=new ArrayList<Integer>();
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i)%3==0) num3.add(numbers.get(i));
            if (numbers.get(i)%2==0) num2.add(numbers.get(i));
        }

        printList(num3);
        printList(num2);
        printList(numbers);

    }


    public static void printList(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
