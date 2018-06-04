package Lesson14_Objects.Lesson2_1;

public class BelarusianHen extends Hen {
    private String country="Belarus";
    @Override
    int getCountofEggsPerMonth() {
        return 0;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+". My country-"+country+
                ". I produce "+getCountofEggsPerMonth()+" eggs per month.";
    }

}
