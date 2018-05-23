package Lesson12_polimorph;

public class Lesson4_1 {

    public static void main(String[] args) {
        Dog dog=new Dog("New home");
        dog.eat("Poison bread");
        dog.eat("bone");
        dog.run("New home");
        dog.run("Uncle house");

    }


    public interface Fly {
        boolean wings = true;

        void fly(String newAddress);

        void checkWether(boolean weather);
    }


    public interface Run {
        boolean legs = true;

        void run(String newAddress);
    }

    public interface Swimm {
        void swimm(String newAddress);

        void checkWater(boolean isCold);
    }

    public interface Eat {
        void eat(String food);

        boolean checkFood(String food);
    }

    public static class Dog implements Run, Eat {

        public String newAddress = "Никуда не пойду";

        public Dog(String newAddress) {
            run(newAddress);
        }

        public Dog(String food, String newAddress) {
            eat(food);
            run(newAddress);
        }

        @Override
        public void run(String newAddress) {
            if (newAddress == null || newAddress.equals(this.newAddress)) System.out.println("I'm already here");
            else {
                this.newAddress = newAddress;
                System.out.println("Я мчу как ветер до " + this.newAddress);
            }
        }

        @Override
        public void eat(String food) {
            if (checkFood(food)) System.out.println("Mmm, so yammi!");
            else System.out.println("Feee, eat it by yourself.");
        }

        @Override
        public boolean checkFood(String food) {
            if (food.toLowerCase().contains("poison")) return false;
            return true;
        }
    }

    public class Car implements Run {
        public String newAddress;

        public Car(String newAdress) {
            run(newAdress);
        }

        @Override
        public void run(String newAddress) {
            if (newAddress == null || newAddress.equals(this.newAddress)) System.out.println("I'm already here");
            else {
                this.newAddress = newAddress;
                System.out.println("Engine starts...Destination is " + this.newAddress + "...And we are here!");
            }
        }
    }

    public class Duck implements Run, Fly, Eat {

        @Override
        public void fly(String newAddress) {

        }

        @Override
        public void checkWether(boolean weather) {

        }

        @Override
        public void run(String newAddress) {

        }

        @Override
        public void eat(String food) {

        }

        @Override
        public boolean checkFood(String food) {
            return false;
        }
    }

    public class Airplane implements Fly, Run {

        @Override
        public void fly(String newAddress) {

        }

        @Override
        public void checkWether(boolean weather) {

        }

        @Override
        public void run(String newAddress) {

        }
    }

}

