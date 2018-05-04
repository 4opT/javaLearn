package Lesson9;

public class Task1_2 {
    public static int i=2;
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println("the line for method1 - "+stackTraceElements[i].getLineNumber());
        System.out.println("method1"+stackTraceElements[i]);
        method2();
    }
    public static void method2(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[i]);
        method3();
    }
    public static void method3(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[i]);
        method4();
    }
    public static void method4(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[i]);
        method5();

    }
    public static void method5(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[i]);

    }
}
