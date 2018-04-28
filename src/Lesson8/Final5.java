package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Final5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(reader.readLine());
        ArrayList<String >list=createStringList(number,reader);
        toUpperCase(list);
    }

    public static ArrayList<String >createStringList(int n, BufferedReader reader) throws IOException {
        ArrayList<String>list=new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        return list;
    }

    public static ArrayList<String> toUpperCase(ArrayList<String>list){
        ArrayList<String>resultList=new ArrayList<String>();
        for (String a:list){
            String s=a.substring(0,1).toUpperCase()+a.substring(1);
            System.out.println(s);
            resultList.add(s);
        }
        return resultList;
    }


}
