package Lesson5;

public class StringHelper {
    public static void main(String[] args) {
        System.out.println(multiply("hello",2));
    }
    public static String  multiply(String s, int count){
        String newS=s;
        for (int i = 1; i < count; i++) {
            newS+=s;
        }
        return newS;
    }
    public static String  multiply(String s){
        String newS=s;
        for (int i = 1; i < 5; i++) {
            newS+=s;
        }
        return newS;
    }



}
