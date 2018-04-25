package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Final1 {
    public static void main(String[] args) throws IOException {
        Set<Cat> cats=createCats();
        printCats(cats);
        Iterator<Cat> itr=cats.iterator();
        if (itr.hasNext()) cats.remove(itr.next());
        System.out.println("deleting completed");
        printCats(cats);

    }

    public static class Cat{
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "cat name - "+this.name;
        }
    }

    public static Set createCats() throws IOException {
        Set<Cat>cats=new HashSet<Cat>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
               String name=reader.readLine();
               cats.add(new Cat(name));
        }
        return cats;

    }

    public static void printCats(Set cats){

        for (Object cat:cats){
            System.out.println(cat);
        }
    }

}
