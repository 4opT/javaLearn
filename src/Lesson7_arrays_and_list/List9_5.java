package Lesson7_arrays_and_list;

import java.io.IOException;
import java.util.ArrayList;

public class List9_5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String >list=new ArrayList<String>();
        list= List1.addFromKeyboard(list);
        list=doubleValues(list);
        List9_1.printList(list);
    }

    public static ArrayList doubleValues(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            list.add(++i,list.get(--i));
            i++;
        }
        return list;
    }

}
