package Lesson7;

import java.io.IOException;
import java.util.ArrayList;

public class List12_1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String>list=new ArrayList<String>();
        list=List1.addFromKeyboard(list);
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));
        }


    }



}