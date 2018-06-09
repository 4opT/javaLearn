package Lesson15_Objects.Task9_5;

public class Solution {

    public static void main(String[] args) {

    }
    public static Object cat;

    static {

        class Cat{
            String name="Pushok";
        }
        Cat mycat=new Cat();
        cat=mycat;
        System.out.println(mycat.name);
    }
}
