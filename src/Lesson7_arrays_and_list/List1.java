package Lesson7_arrays_and_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List1 {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        list=addFromKeyboard(list);
        max(list);

    }

    public static ArrayList<String> addFromKeyboard(ArrayList<String> list) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s=reader.readLine();
            if (s.equals(""))break;
            else list.add(s);
        }

        return list;
    }

    public static ArrayList<String> addFromKeyboard(ArrayList<String> list, int n) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (n>0) {
            String s=reader.readLine();
            list.add(s);
            n--;
        }

        return list;
    }

    public static void max(ArrayList<String>list){
        String maxVal="";
        for (int i = 0; i < list.size(); ) {
            if (maxVal.length()>list.get(i).length()){
                list.remove(i);
            } else if(maxVal.length()==list.get(i).length()) {
                i++;
            } else {
                maxVal=list.get(i);
                i=0;
            }
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }

}
