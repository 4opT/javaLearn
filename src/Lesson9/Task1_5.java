package Lesson9;

public class Task1_5 {
    public static void main(String[] args) {

        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3(){
        traceLength();
    }


    public static int traceLength(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println("In "+stackTraceElements[2]+" only "
                +(stackTraceElements.length-2)      //we don't count tracelength and getstacktracemethods
                +" method(s) including itself");
        return stackTraceElements.length-2;
    }

}
