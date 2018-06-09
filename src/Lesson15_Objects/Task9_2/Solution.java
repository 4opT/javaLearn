package Lesson15_Objects.Task9_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {
        System.out.println(A);
        new Solution();
        new Solution();
    }

    public Solution() {
        A=1;
        System.out.println(A);
    }
    public static int A=0;



     static {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
              A=Integer.parseInt(reader.readLine());
             // B=Integer.parseInt(reader.readLine());

        } catch (Exception e){
            System.out.println("Wrong input format");
        }

    }


}
