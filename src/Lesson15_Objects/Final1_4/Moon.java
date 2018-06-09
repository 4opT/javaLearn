package Lesson15_Objects.Final1_4;

public class Moon implements Planet{
    public static Moon moon;
    public static Moon getMoon(){
        if (moon==null){
            moon=new Moon();
        }
        return moon;
    }
}
