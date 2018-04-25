package Lesson5;

public class KissMyShinyMetalAss {
    public static void main(String[] args) {
        KissMyShinyMetalAss bender=new KissMyShinyMetalAss();
        System.out.println(bender);
    }

    public static int counter=0;

    public KissMyShinyMetalAss() {
        counter+=1;
    }

    @Override
    public String toString() {
        return "KissMyShinyMetalAss"+counter;
    }
}
