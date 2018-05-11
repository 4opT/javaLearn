package Lesson9_Trace_Excep;

public class Final1_2 {
    public static void main(String[] args) {
        for (int i = 10; i >=0; i--) {
            System.out.println(i);
            try{
                Thread.sleep(100);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
