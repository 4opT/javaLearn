package Lesson14_Objects.Lesson2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        HenFactory newFacrory=new HenFactory();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String country=reader.readLine();
        Hen randHen=newFacrory.getHen(country);
        if (randHen instanceof RussianHen){
            RussianHen rus=(RussianHen) randHen;
            System.out.println(rus.getDescription());
        }
        else if (randHen instanceof MoldovanHen){
            MoldovanHen mold=(MoldovanHen) randHen;
            System.out.println(mold.getDescription());
        }
        else if (randHen instanceof UkrainianHen){
            UkrainianHen ukr=(UkrainianHen) randHen;
            System.out.println(ukr.getDescription());
        }
        else if (randHen instanceof BelarusianHen){
            BelarusianHen bel=(BelarusianHen) randHen;
            System.out.println(bel.getDescription());
        } else System.out.println(randHen.getDescription());

    }
}
