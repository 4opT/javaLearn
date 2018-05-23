package Lesson12_polimorph;

public class Lesson3_1 {
    public abstract class Pet{
        public abstract void move();
        private String name;
    }

/* Исправь код. Первая задача
Исправь код, чтобы программа компилировалась.

    public class Solution{
        public static void main(String[] args)
        {

        }


        public static abstract class Pet
        {
            public String getName()
            {
                return "Я - котенок";
            }

            public abstract Pet getChild();
        }

    }
    Исправь код. Вторая задача
Исправь код, чтобы программа компилировалась.


    public class Solution1
    {
        public static void main(String[] args)
        {

        }

        public static abstract class Pet
        {
            public String getName()
            {
                return "Я - котенок";
            }

            public  abstract Pet getChild();
        }

    }

     Класс Cow от Animal
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.


    public class Solution
    {
        public static void main(String[] args)
        {

        }

        public static abstract class Animal
        {
            public abstract String getName();
        }

        public static class Cow extends Animal
        {
            public String getName(){return null;};
        }

    }

  Классы Cat и Dog от Pet
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.


    public class Solution
    {
        public static void main(String[] args)
        {

        }

        public static abstract class Pet
        {
            public abstract String getName();
            public abstract Pet getChild();
        }

        public static class Cat extends Pet
        {
            public String getName(){return null;}
            public Pet getChild(){  return null;}
        }

        public static class Dog extends Pet
        {
            public String getName(){return null;}
            public Pet getChild(){  return null;}

        }

    }


 Нужно исправить программу, чтобы компилировалась и работала
Расставить правильно ключевые слова abstract, чтобы программа компилировалась (там где надо и не надо).


    public class Solution
    {

        public static void main(String[] args)
        {
            Horse horse = new Pegas();
            horse.run();
        }

        public static interface Fly
        {
            public abstract void fly();
        }

        public static abstract class Horse
        {
            public void run()
            {

            }
        }

        public static class Pegas extends Horse implements Fly
        {
            public void fly()
            {

            }
        }

        public static abstract class SwimPegas extends Pegas
        {
            public abstract void  swim();
        }

    }

*/


}
