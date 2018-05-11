package Lesson9_Trace_Excep;

public class Task2_2 {
    public static void main(String[] args) {
        try {
            String s=null;
            String m=s.toUpperCase();
        } catch (Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }
    }
}
