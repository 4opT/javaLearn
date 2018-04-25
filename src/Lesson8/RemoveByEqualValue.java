package Lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveByEqualValue {
    public static void main(String[] args) {
        HashMap<String ,String > map=createMap();
        equalRemove(map);
        System.out.println(map);
    }

    public static Map<String,String> equalRemove(Map <String,String>set){

        ArrayList<String> names=new ArrayList<String>(set.values());
        for (String a:names) {
            int count=0;
            for (int i = 0; i < names.size(); i++) {
                if(a.equals(names.get(i))) count++;
                if(count>1){
                    removeFromMapByValue(set, a);
                }
            }
        }
        return  set;

    }

    private static void removeFromMapByValue(Map<String, String> set, String a) {
        HashMap<String ,String>copy=new HashMap<String, String>(set);
        for(Map.Entry<String,String >pair:copy.entrySet()){
            if (pair.getValue().equals(a)) set.remove(pair.getKey());
        }


    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сталлоне", "Сильвестр");
        map.put("Мориконе", "Энио");
        map.put("Вивальди","Антонио");
        map.put("Белучи", "Моника");
        map.put("Гудини", "Гарри");
        map.put("Верди", "Джузеппе");
        map.put("Марацци", "Бруно");
        map.put("Корлионе", "Вито");
        map.put("Брацци", "Люка");
        map.put("Страдивари", "Антонио");
        return map;
    }



}
