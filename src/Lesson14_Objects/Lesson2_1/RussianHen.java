package Lesson14_Objects.Lesson2_1;

public class RussianHen extends Hen{

    private String country = "Russia";

    @Override
    int getCountofEggsPerMonth() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ". My country-" + country +
                ". I produce " + getCountofEggsPerMonth() + " eggs per month.";

    }
}
