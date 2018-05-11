package Lesson7_arrays_and_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
        String [] array =createArray(10);
        //printDesc(array);
        int[] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=array[i].length();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static String[] createArray(int i) throws IOException {
        String[] array=new String[i];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < array.length; j++) {
            array[j]=reader.readLine();
        }
        return array;
    }

    public static void printDesc(String[] array) {
        for (int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
}
