package Lesson8;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Final2 {
    public static class Cat{
        public static int countCat=0;
        public String name;

        public Cat() {
            countCat++;
            this.name = "Cat"+countCat;

        }

        @Override
        public String toString() {
            return "cat name - "+this.name;
        }


    }
    public static class Dog{
        public static int countDog=0;
        public String name;
        public Dog() {
            countDog++;
            this.name = "Dog"+countDog;
        }

        @Override
        public String toString() {
            return "dog name - "+this.name;
        }


    }
    public static Set<Cat> createCats(){
        //BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Set<Cat>cats=new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            cats.add(new Cat());
        }

        return cats;
    }
    public static Set<Dog> createDogs(){
        Set<Dog>dogs=new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object>join(Set<Cat>cats,Set<Dog>dogs){
        Set<Object>pets=new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object>pets){
        Iterator<Object>itr=pets.iterator();
        while (itr.hasNext()){
            if (itr.next() instanceof Cat){
                itr.remove();
            }
        }
    }
    public static void printPets(Set<Object>pets){
        for (Object pet:pets){
            System.out.println(pet);
        }
    }

    public static void main(String[] args) {
        Set<Cat>cats=createCats();
        Set<Dog>dogs=createDogs();
        System.out.println("cats:"+cats);
        System.out.println("dogs:"+dogs);
        Set<Object>pets=join(cats,dogs);
        removeCats(pets);
        printPets(pets);


    }


}
