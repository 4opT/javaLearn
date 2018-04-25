package Lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task3_2 {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<Integer>();
        for (int i = 0; i < 50; i++) {
            set1.add(i);
        }


        Iterator<Integer>itr=set1.iterator();
        while(itr.hasNext()){
            int number=itr.next();
            if (number>10){
                itr.remove();
            }
        }

        for (Integer i:set1){
            System.out.println(i);
        }
    }
}
