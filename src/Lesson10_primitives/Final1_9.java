package Lesson10_primitives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Final1_9 {
    public static void main(String[] args) throws IOException {
        ArrayList<String >array=new ArrayList<String>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            array.add(reader.readLine());
        }

        Map<String,Integer>map=new HashMap<String, Integer>();
        for (int i = 0; i < array.size(); i++) {
            if (!map.containsKey(array.get(i))){   //check was the record in a map already
                int count=0;
                map.put(array.get(i),count);
                for (int j = i; j < array.size(); j++) {
                    if (array.get(i).equals(array.get(j))){
                        map.replace(array.get(i),count,++count);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> pair: map.entrySet()){
            String key=pair.getKey();
            int value=pair.getValue();
            System.out.println(key+" - "+ value);
        }


    }
}
