package Lesson12_polimorph;

public class Lesson4_5 {
    public static void main(String[] args) {

    }

    public interface Run{
        void run(String destination);
    }
    public interface Swimm{
        void swimm(int distance);

    }

    public abstract class Human implements Run,Swimm{

    }
}
