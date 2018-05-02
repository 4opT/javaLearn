package Lesson8;


//Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
//ПыСы очень интересная задача, с использованием Comparator. Юзать на будущее!


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bonus3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>words=new ArrayList<String >();
        while (true) {
            String word=reader.readLine();
            if (word.isEmpty()) break;
            words.add(word);
        }
        Collections.sort(words,ALPHABETICAL_ORDER);
        for (int i = 0; i < 5; i++) {
            System.out.println(words.get(i));
        }

    }


    private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
        public int compare(String str1, String str2) {
            //String s1=str1.substring(num,num+1);
            //String s2=str2.substring(num,num+1);
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
            if (res == 0) {
                res = str1.compareTo(str2);
            }
            return res;
        }
    };





}
