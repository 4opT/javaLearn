package Lesson12_polimorph;

public class Final1_4 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        getClass(cat);
        Tiger tigr=new Tiger();
        System.out.println(getClass(tigr,true));
    }
    public static class Cat{}
    public static class Tiger{}
    public class Lion{}
    public class Bull{}
    public class another{}

    public static void getClass(Object obj){

        System.out.println(obj.getClass().getSimpleName());
    }

    //another realization
    public static String getClass(Object obj, boolean isRussia){
        String result="xз";
        switch (obj.getClass().getSimpleName()){
            case "Cat": result="Кот";
            break;
            case "Tiger":result="Тигр";
            break;
            case "Lion":result="Лев";
            break;
            case "Bull":result="Бык";
            break;
        }
        return result;
    }

}
