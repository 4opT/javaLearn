package Lesson9_Trace_Excep;

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
