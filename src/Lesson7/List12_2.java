package Lesson7;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class List12_2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<String>();
        list=List1.addFromKeyboard(list,2);
        int n=Integer.parseInt(list.get(0));
        int m=Integer.parseInt(list.get(1));
        list.clear();
        list=List1.addFromKeyboard(list,n);
        list=changeOrder(list,m);
        List9_1.printList(list);

    }

    public static ArrayList changeOrder(ArrayList list, int m){

        for (int i = 0; i < m; i++) {
            list.add(list.size(),list.get(0));
            list.remove(0);
        }

        return list;
    }


}
