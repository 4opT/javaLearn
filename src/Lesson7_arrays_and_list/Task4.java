package Lesson7_arrays_and_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        int[]array=new int[10];
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        for (int i = array.length-1; i>=0; i--) {
            array[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
