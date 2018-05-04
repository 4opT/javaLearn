package Lesson9;

public class Task2_1 {
    public static void main(String[] args) {
        try {
            int a=42/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
