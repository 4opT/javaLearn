package Lesson14_Objects.Final_Singleton;

public class Singleton {

    private static Singleton SINGLE=new Singleton();

    public static Object getInstance(){
        return SINGLE;
    }

    @Override
    public String toString() {
        return Singleton.class.getCanonicalName();
    }
}
