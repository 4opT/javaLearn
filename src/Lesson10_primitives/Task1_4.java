package Lesson10_primitives;

//Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine = 9
//        short number = 9;
//        char zero = '0';
//        int nine = (zero + number);

public class Task1_4 {

    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        char nine = (char)(zero + number);
        System.out.println(nine);
    }

}
