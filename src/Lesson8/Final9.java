package Lesson8;

public class Final9 {
    public static boolean isDataOdd(String date){
        String[]array=date.split(" ");
        if((Integer.parseInt(array[1]) % 2) != 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isDataOdd("JANUARY 2 2020"));
    }
}
