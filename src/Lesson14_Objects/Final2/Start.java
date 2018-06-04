package Lesson14_Objects.Final2;

public class Start {
    public static void main(String[] args) {
            getDeliciousDrink().taste();
            System.out.println(getWine().getHolidayName());
            System.out.println(getBubblyWine().getHolidayName());
            System.out.println(getWine().getHolidayName());
        }

    private static Drink getDeliciousDrink() {
        return new Wine();
    }

    private static BubblyWine getBubblyWine() {
        return new BubblyWine();
    }

    private static Wine getWine() {
        return new Wine();
    }



}
