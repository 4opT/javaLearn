package Lesson9_Trace_Excep;

import java.util.ArrayList;
import java.util.HashMap;

public class Task2_3 {

    public static void main(String[] args) {
        try {
            int[]m=new int[2];
            m[8]=5;
        } catch (Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }

        try {
            ArrayList<String>list=new ArrayList<String >();
            String s=list.get(18);
        } catch (Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }
        try {
            HashMap<String ,String >map=new HashMap<String ,String>(null);
            map.put(null,null);
            map.remove(null);
        } catch (Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }
    }

}
