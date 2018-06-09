package Lesson15_Objects.Final1_4;

public class Sun implements Planet{
    public static Sun sun;
    public static Sun getSun(){
        if (sun==null){
            sun=new Sun();
        }
        return sun;
    }
}