package Lesson8;

import java.util.ArrayList;

public class Final6 {

    public static class Human{
        String name;
        boolean gender;
        int age;
        ArrayList<Human>children=new ArrayList<Human>();

        public String isGender() {
            if (!gender){
                return "woman";
            }
            return "man";
        }

        public static void addChildTo(Human parent, Human child){
            parent.children.add(child);
        }

        public Human(String name, boolean gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            String childs = "childs: ";
            for (Human human:this.children){
                childs+=human.name+" ";
            }
            if (this.children.isEmpty()){
                childs="";
            }

            return "Name - "+this.name+", "+
                    "gender - "+this.isGender()+", "+
                    "age - "+this.age+", "+childs;
        }
    }


    public static void main(String[] args) {
        Human dad=new Human("Daddy",true,55);
        Human mam=new Human("Mammy",false,55);
        Human granny=new Human("Granny",false,86);
        Human grandfather=new Human("BigDaddy",true,86);
        Human son=new Human("Pizdyk",true,20);
        Human daughter=new Human("Nashka",false,18);
        Human grannyf=new Human("GrannyF",false,86);
        Human grandfatherf=new Human("BigDaddyF",true,86);
        Human.addChildTo(dad,son);
        Human.addChildTo(mam,son);
        Human.addChildTo(mam,daughter);
        Human.addChildTo(dad,daughter);
        Human.addChildTo(granny,mam);
        Human.addChildTo(grandfather,mam);
        Human.addChildTo(grandfatherf,dad);
        Human.addChildTo(grannyf,dad);
        System.out.println(dad);
        System.out.println(mam);
        System.out.println(grandfather);
    }

}
