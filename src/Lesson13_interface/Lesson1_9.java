package Lesson13_interface;

public class Lesson1_9 {
    interface Movable{
        Double speed();
    }
    interface Runable extends Movable{
        Double speed(Runable param);
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog.speed());
        System.out.println(dog.speed(dog));
    }

    static class Dog implements Runable{

        @Override
        public Double speed() {
            return Double.valueOf(4);
        }

        @Override
        public Double speed(Runable param) {
            System.out.println(param);
            return Double.valueOf(5);
        }
    }


}
