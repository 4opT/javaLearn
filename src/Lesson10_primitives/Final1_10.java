package Lesson10_primitives;

//10. Безопасное извлечение из списка
//
//        Создать список целых чисел. Ввести с клавиатуры 20 целых чисел. Создать метод по безопасному извлечению чисел из списка:
//        int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
//
//        Метод должен возвращать элемент списка (list) по его индексу (index). Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.

import java.util.ArrayList;

public class Final1_10 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(55);
        System.out.println(safeGetElem(list,3,0));
    }

    public static int safeGetElem(ArrayList<Integer>list, int index, int defaultValue){
        int result=defaultValue;
        try {
            result=list.get(index);
            return result;
        } catch(Exception e) {
            return result;
        }


    }

}
