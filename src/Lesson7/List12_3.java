package Lesson7;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class List12_3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<String>();
        list=List1.addFromKeyboard(list,20);

        ArrayList<Integer> list1=new ArrayList<Integer>();



    }

    public static ArrayList<Integer> convertListToInt(ArrayList<String> list){
        ArrayList<Integer>list1=new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(Integer.parseInt(list.get(i)));
        }
        return list1;
    }


    public static void maxValueFromIntList(ArrayList<Integer>list){
        if (list.isEmpty()){
            System.out.println("no numbers in list");
        }
        int maxValue=list.get(0);
        int minValue=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)>maxValue) maxValue=list.get(i);
            if (list.get(i)<minValue) minValue=list.get(i);
        }
        System.out.println(maxValue);
        System.out.println(minValue);
    }



}
