package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3_1 {
    public static void main(String[] args) throws IOException {
        Set<String> set1=new HashSet<String >();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s;
        for (int i = 0; i < 20; i++) {
                s=reader.readLine();
                set1.add(s);
        }
        for (String text:set1){
            System.out.println(text);
        }
    }


}
