package Lesson14_Objects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lesson1_2 {
    public static void main(String[] args) {
        ArrayList cats=createCats();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("what cat you'd like to find?");
        String name;
        while (true){
            try {
                name=reader.readLine();
                if (name.isEmpty()) continue;
                break;
            } catch (Exception e){
                System.out.println("please enter a valid name");
            }
        }
        getCatByKey(name,cats);
    }

    public static void getCatByKey(String name, ArrayList<Cat> cats){
        String result = "No such cat";
        for (int i = 0; i < cats.size(); i++) {
            if (name.equals(cats.get(i).getName())) {
                result = cats.get(i).toString();
                break;
            }
        }
        System.out.println(result);
    }


    public static ArrayList<Cat> createCats(){
        LinkedList<String>catsNames=AddCatsNames();
        ArrayList<Cat>cats=new ArrayList<Cat>();
        for (int i = 0; i < catsNames.size(); i++) {
            Cat cat=new Cat(catsNames.get(i));
            cats.add(cat);
        }
        return cats;
    }

    public static class Cat{
        private String name;

        public Cat(String name){
            this.name=name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "А вот и наш - " + name;
        }
    }

    public static LinkedList<String > AddCatsNames(){
        LinkedList<String> catsNames= new LinkedList<String>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                String s=reader.readLine();
                if (s.isEmpty()) break;
                catsNames.add(s);
            } catch (Exception e){
                System.out.println("the value is invalid");
                break;
            }
        }
        return catsNames;
    }

}
