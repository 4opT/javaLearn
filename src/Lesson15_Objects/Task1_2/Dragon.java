package Lesson15_Objects.Task1_2;

public class Dragon extends BigAnimal {
    public String getSize() {
        return "Дракон большой"+super.getSize();
    }
}
