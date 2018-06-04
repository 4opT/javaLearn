package Lesson14_Objects.Final5;

public class Start {
    public static void main(String[] args) {
        Computer comp=new Computer(new Keyboard(),new Mouse(),new Monitor());
        System.out.println(comp.getKeyboard());
        System.out.println(comp.getMouse());
        System.out.println(comp.getMonitor());
    }
}
