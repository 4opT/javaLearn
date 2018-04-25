package Lesson5;

import java.util.ArrayList;

public class Cat {

    public static  ArrayList<Cat> cats=new ArrayList<>();
    public String name;
    private Cat mother;
    //private String status;
    private Cat father;




    public static void main(String[] args) {


        Cat cat5=new Cat("дедушка Вася");
        Cat cat6=new Cat("бабушка Мурка");
        Cat cat1=new Cat("папа Котофей", cat5,"man");
        Cat cat2=new Cat("мама Василиса", cat6,"woman");
        Cat cat3=new Cat("сын Мурчик", cat2, cat1);
        Cat cat4=new Cat("дочь Пушинка", cat2, cat1);




        printCat();


    }

//    public static int catCount=0;

//    public Cat(int i) {
//        catCount+=1;
//       this.name="Cat"+i;
//        Cat.cats.add(this);
//    }

    public Cat(String name, Cat mother, Cat father){
        this.name=name;
        this.mother=mother;
        this.father=father;
        Cat.cats.add(this);
    }
    public Cat(String name){
        this.name=name;
        Cat.cats.add(this);
    }
    public Cat(String name, Cat parent, String gender){
        this.name=name;
        if (gender.equals("man")){
            this.father=parent;
        } else if (gender.equals("woman")){
            this.mother=parent;
        }
        Cat.cats.add(this);
    }


    @Override
    public String toString() {
        if (this.mother==null&&father==null){
            return this.name;
        } else if (this.father==null) {
            return this.name + " have mother " + this.mother.toString();
        } else if (this.mother==null) {
            return this.name + " have father " + this.father.toString();
        } else return this.name+" have mother "+this.mother.toString()+" and father "+this.father.toString();
    }

    public static void printCat(){
        for (Cat cat:cats) System.out.println(cat.toString());
//        System.out.println(catCount);
    }

//    public static int getCatCount(){
//        return Cat.catCount;
//    }


//    public static void setCatCount(int catCount) {
//        Cat.catCount = catCount;
//    }


}
