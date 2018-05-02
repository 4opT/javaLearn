package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Final8 {

    public static void main(String[] args) throws IOException {
        int[] array =initializeArray(7);
        int[] sortedArray=maxFive(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }
    }

    public static int[] initializeArray(int n) throws IOException {
        int [] newArray=new int[n];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=Integer.parseInt(reader.readLine());
        }
        return newArray;
    }

    public static int[] maxFive(int[] array){
        Arrays.sort(array);
        int [] newArray=new int[5];
        for (int i = 0; i < 5; i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }

}
