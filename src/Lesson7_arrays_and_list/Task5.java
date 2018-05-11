package Lesson7_arrays_and_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        int[]test=new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < test.length; i++) {
            test[i]=Integer.parseInt(reader.readLine());
        }
        int[]test1=new int[5];
        int[]test2=new int[5];
        for (int i = 0; i < test.length; i++) {
            if(i<5)test1[i]=test[i];
            else test2[i-5]=test[i];
        }
        for (int i = 0; i < test2.length; i++) {
            System.out.println(test2[i]);
        }
    }
}
