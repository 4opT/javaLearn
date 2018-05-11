package Lesson10_primitives;


//Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
//        float f = (float)128.50;
//        int i = (int)f;
//        int b = (int)(i + f);

public class Task1_3 {
    public static void main(String[] args) {
        float f = (float)128.50;
        int i = (int)f;
        int b = (int)(i + f);
        byte c=(byte)b;
        System.out.println(c);
    }
}
