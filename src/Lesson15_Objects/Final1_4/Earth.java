package Lesson15_Objects.Final1_4;

public class Earth implements Planet {
    public static Earth earth;
    public static Earth getEarth(){
        if (earth==null){
            earth=new Earth();
        }
        return earth;
    }
}
