package Lesson12_polimorph;

public class Lesson2_1 {
    public static void print(int a){
        System.out.println(a);
    }
    public static void print(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        print("hello");
        print(10);
    }
}
