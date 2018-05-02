package Lesson8;


//Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//Новая задача: Программа должна работать не с номерами домов, а с городами:


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bonus2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Map<String ,String >map=initializeMap(reader);
        System.out.println("Enter city you wnat to find family");
        String city=reader.readLine();
        System.out.println(map.get(city));
    }



    public static Map<String,String >initializeMap(BufferedReader reader) throws IOException {
        System.out.println("Enter values. If you want to stop - press enter");
        Map<String,String>homeMap=new HashMap<String ,String >();
        while (true){
            System.out.println("City: ");
            String city=reader.readLine();
            if (city.isEmpty()) break;
            System.out.println("Family: ");
            String family=reader.readLine();
            if (family.isEmpty()) break;
            homeMap.put(city,family);
        }
        return homeMap;
    }

}
