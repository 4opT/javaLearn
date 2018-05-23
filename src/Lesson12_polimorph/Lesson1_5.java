package Lesson12_polimorph;
//Написать метод, который определяет,
//объект какого класса ему передали,
//и возвращает результат – одно значение из: «Корова»,
//«Кит», «Собака», «Неизвестное животное».
public class Lesson1_5 {
    public static void main(String[] args) {

        Cat hellocat=new Cat();
        Dog hellodog=new Dog();
        Lesson1_3.Lamp lamp=new Lesson1_3.Lamp();
        System.out.println(getClassName(lamp));
        System.out.println(getClassName(hellodog));

    }

    public static String getClassName(Object obj){
        if (obj instanceof Cat) return "Кот";
        if (obj instanceof Wheel) return "Кит";
        if (obj instanceof Dog) return "Собака";
        return "Неизвестное животное";
    }

    public static class Cat{};
    public class Wheel{};
    public static class Dog{};

}
