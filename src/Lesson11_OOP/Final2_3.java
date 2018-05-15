package Lesson11_OOP;

import java.util.ArrayList;

public class Final2_3 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        int max=list.get(0);
        int min=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)>max) max=list.get(i);
            if (list.get(i)<min) min=list.get(i);
        }
        System.out.println("min is - "+min);
        System.out.println("max is - "+max);
    }
}
