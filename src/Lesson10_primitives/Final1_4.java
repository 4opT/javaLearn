package Lesson10_primitives;

//Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
//
//        Образец:
//        Я не хочу изучать Java, я хочу большую зарплату
//        не хочу изучать Java, я хочу большую зарплату
//        не хочу изучать Java, я хочу большую зарплату
//        е хочу изучать Java, я хочу большую зарплату
//        хочу изучать Java, я хочу большую зарплату
//        хочу изучать Java, я хочу большую зарплату
//        …

public class Final1_4 {
    public static void main(String[] args) {
        String w="Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i <40; i++) {
            System.out.println(w.substring(i));
        }
    }
}
