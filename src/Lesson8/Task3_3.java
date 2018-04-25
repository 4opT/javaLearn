package Lesson8;

import org.apache.commons.exec.DaemonExecutor;

import java.util.*;

public class Task3_3 {
    public static void main(String[] args) {
//        Map<String, String>set1=new HashMap<String, String>();
//        set1.put("dsallds","kdsak");
//        set1.put("ieqweeq","sada");
//        set1.put("asdjad","fjafaf");
//        set1.put("sakdkk","dadaskd");
//        set1.put("Fedor","Shalyapin");
//        set1.put("Fdor","Shalyapin");
//        System.out.println(countSame(set1,"Shalyapin","Fedor"));

//
//        Map<String,Date>set2=new HashMap<String, Date>();
//        set2.put("first",new Date());
//        Date date=new Date();
//        date.setMonth(5);
//        System.out.println(date);
//        set2.put("second", date);
//        //removeSummer(set2);
//        System.out.println(set2);



    }

    public static int countSame(Map<String,String > set1,String name,String surname){
        int count=0;
        for (Map.Entry<String ,String>pair:set1.entrySet()){
            String key=pair.getKey();
            String value=pair.getValue();
            if (name.equals(value))count++;
            if (surname.equals(key))count++;
        }
        return count;
    }

    public static Map<String,Date> removeSummer(Map<String,Date> set){
        Iterator<Map.Entry<String,Date>>itr=set.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Date>pair=itr.next();
            Date date=pair.getValue();
            if (date.getMonth()>4 && date.getMonth()<8) itr.remove();
        }
        return set;
    }




}
