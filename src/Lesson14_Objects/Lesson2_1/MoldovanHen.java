package Lesson14_Objects.Lesson2_1;

public class MoldovanHen extends Hen {
    private String country="Moldova";
    @Override
    int getCountofEggsPerMonth() {
        return 10;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+". My country-"+country+
                ". I produce "+getCountofEggsPerMonth()+" eggs per month.";
    }
}
