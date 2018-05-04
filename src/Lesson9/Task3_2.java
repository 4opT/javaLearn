package Lesson9;


public class Task3_2 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e){
            System.out.println("catch them");
        }

    }
    static class Exception1 extends Exception{

    }
    static class Exception2 extends Exception{

    }
    static class Exception3 extends Exception{

    }

    public static void method1() throws Exception1, Exception2, Exception3{
        int rand=(int)(Math.random()*3)+1;

        switch (rand) {
            case 1: throw new Exception1();
            case 2: throw new Exception2();
            case 3: throw new Exception3();
        }
    }
}
