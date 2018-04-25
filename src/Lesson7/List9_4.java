package Lesson7;

import java.io.IOException;
import java.util.ArrayList;

public class List9_4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<String>();
        list=List1.addFromKeyboard(list);
        list=fix(list);
        List9_1.printList(list);


    }

    public static ArrayList<String > fix(ArrayList<String>list){
        for (int i = 0; i < list.size(); i++) {
            String word=list.get(i);
            if (word.contains("р")&&word.contains("л")) continue;
            if (word.contains("р"))list.remove(word);
            if (word.contains("л")){
                list.add(++i,word);
                i++;
            }
        }
        return list;
    }
}
