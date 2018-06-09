package Lesson15_Objects.Final1_1;

import tips.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=readfromconsole.readFromConsole("exit");
        for (String elem:list){

            if (elem.contains(".")){
                print(Double.parseDouble(elem));
            } else {
                try {
                    Integer elemNum=Integer.parseInt(elem);
                    if (elemNum > 0 && elemNum < 128) {
                    print(elemNum.shortValue());
                } else if (elemNum >= 128) {
                    print(elemNum);
                } else print(elem);
            } catch (Exception e){
                print(elem);
                }
            }
        }
    }

    public static void print(Double value){
        System.out.println("Double "+value);
    }
    public static void print(short value){
        System.out.println("short "+value);
    }
    public static void print(Integer value){
        System.out.println("Integer "+ value);
    }
    public static void print(String value){
        System.out.println("String " + value);
    }


}
