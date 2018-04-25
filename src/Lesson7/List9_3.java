package Lesson7;

import java.io.IOException;
import java.util.ArrayList;

public class List9_3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String >list=new ArrayList<String>();
        list=List1.addFromKeyboard(list);
        for (int i = 0; i < list.size(); i++) {
            list.add(i+1,"exactly");
            i++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
