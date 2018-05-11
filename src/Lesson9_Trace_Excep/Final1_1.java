package Lesson9_Trace_Excep;

public class Final1_1 {
    public static void main(String[] args) {
        try {
            divisionByZero(5);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void divisionByZero(int a){
        System.out.println(a/0);
        }
}
