package Lesson15_Objects.Task1_2;

public class Goose extends SmallAnimal{
    public String getSize() {
        return "гусь маленький"+super.getSize();
    }
}
