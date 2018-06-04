package Lesson14_Objects.Final5;

public class Keyboard implements CompItem{
    @Override
    public String getName() {
        return getClass().getName();
    }
}
