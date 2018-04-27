package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Final4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n=Integer.parseInt(reader.readLine());
        ArrayList<Integer>list=getIntegerList(n,reader);
        System.out.println(getMinimun(list));


    }

    public static ArrayList<Integer> getIntegerList(int n, BufferedReader reader) throws IOException {
        ArrayList<Integer>intList=new ArrayList<Integer>();
        System.out.println("enter "+n+" numbers");
        for (int i = 0; i < n; i++) {
            int number=Integer.parseInt(reader.readLine());
            intList.add(number);
        }
        return intList;
    }

    public static int getMinimun(List<Integer> list){
        Collections.sort(list);
        return list.get(0);
    }





}