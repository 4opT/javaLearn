package Lesson12_polimorph;

public class Lesson1_3 {
    public static void main(String[] args) {
        Cat cat=new Cat("Hulio");
        Animal bird=new Bird("Lopez");
        System.out.println(getInstance(bird));
    }

    public static String getInstance(Object ob){
        return ob.getClass().getSimpleName();
    }

    public static class Animal{
        private String name;

        public String getName() {
            return this.name;
        }
        public void setName(String name){
            this.name=name;
        }
        public void makeMove(){
            System.out.println("Хожу");
        }
    }
//котики
    public static class Cat extends Animal{
        public Cat(String name){
            setName(name);
        }
    }
//птычка
    public static class Bird extends Animal{
        public Bird(String name){
            setName(name);
        }
        public void makeMove(){
            System.out.println("Лечу");
        }
//лампа
    }
    public static class Lamp {
        private String name="Lamp";

        public String getName() {
            return name;
        }

        public void action(){
            System.out.println("Cвечу");
        }
    }



}
