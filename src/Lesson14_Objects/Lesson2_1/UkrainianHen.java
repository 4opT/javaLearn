package Lesson14_Objects.Lesson2_1;

public class UkrainianHen extends Hen{
    private String country="Ukraina";

    @Override
    int getCountofEggsPerMonth() {
        return 100;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+". My country-"+country+
                ". I produce "+getCountofEggsPerMonth()+" eggs per month.";
    }
}
