package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task1_4 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String >smth=new HashMap<Integer,String>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        for (int i = 1; i <=10; i++) {
            s=reader.readLine();
            smth.put(i,s);
        }
        for (Map.Entry<Integer,String >pair: smth.entrySet()){
            int key=pair.getKey();
            String value=pair.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }


}
