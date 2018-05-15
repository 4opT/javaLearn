package Lesson10_primitives;

//Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap. Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
//        Затем программа выводит содержание HashMap на экран


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Final2_2 {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map =new HashMap<String, Integer>();
        while (true) {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter number");
            Integer number=Integer.parseInt(reader.readLine());
            System.out.println("enter text");
            String text=reader.readLine();
            if (text.isEmpty())break;
            map.put(text,number);
        }

        for (Map.Entry<String,Integer>pair:map.entrySet()){
            System.out.println(pair.getValue()+" "+pair.getKey());
        }


    }
}
