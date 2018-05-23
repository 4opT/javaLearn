package Lesson12_polimorph;


//3. Задача по алгоритмам.
//
//        Задача: Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).

//here i'm trying to use as much knowledges as possible

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Final2_3 {
    public static void main(String[] args) {
        LinkedList<Integer>array=initialize();
        Map<Integer,Integer>map=getMinFromArray(array);
        for(Map.Entry<Integer,Integer>pair:map.entrySet()){
            Integer value=pair.getValue();
            Integer key=pair.getKey();
            System.out.println("key - "+key+", value - "+value);
        }
    }
    public static Map<Integer,Integer> getMinFromArray(LinkedList<Integer>array){
        int min=array.get(0);
        int index=0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i)<min){
                min=array.get(i);
                index=i;
            }
        }
        Map<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(index,min);
        return map;
    }
    public static LinkedList<Integer> initialize(){
        LinkedList<Integer>array=new LinkedList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                String s=reader.readLine();
                if(s.isEmpty()) break;
                else array.add(Integer.parseInt(s));
            } catch (IOException e) {
                System.out.println("wrong value");
                break;
            }
        }
        return array;
    }
}
