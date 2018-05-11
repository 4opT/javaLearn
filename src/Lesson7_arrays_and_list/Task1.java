package Lesson7_arrays_and_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int[] array =initializeArray();
        System.out.println(max(array));
    }

    public static int[] initializeArray() throws IOException {
        int [] newArray=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=Integer.parseInt(reader.readLine());
        }
        return newArray;
    }

    public static int max(int[] newArray){
        int max=newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i]>max) max=newArray[i];
        }
        return max;
    }

}
