package Lesson9;

public class NB {
    //get trace Length from where the method below was exec
    public static int traceLength(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println("In "+stackTraceElements[2]+" only "
                +(stackTraceElements.length-2)      //we don't count tracelength and getstacktracemethods
                +" method(s) including itself");
        return stackTraceElements.length-2;
    }


    //here we can get a type of error in canonical name view
    public static void typeOfException(){
        try {
            String s=null;
            String m=s.toUpperCase();
        } catch (Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }
    }


}
