package Lesson10_primitives;

//2. Задача №2 на преобразование целых типов
//
//        Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765
//        int a = 15;
//        int b = 4;
//        float c = a / b;
//        double d = a * 1e-3 + c;

public class Task1_2 {
    public static void main(String[] args) {

        double a = 15;
        int b = 4;
        double c = a / b;
        double d = a * 1e-3 + c;
        System.out.println(d);
    }
}
