package tips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readfromconsole {

    public static ArrayList<String> readFromConsole(String exitWord) throws IOException {
        ArrayList<String>list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String word=reader.readLine();
            if (word.equals(exitWord))break;
            list.add(word);
        }
        return list;
    }
    public static ArrayList<Number> readFromConsole(Number exitnumber) throws IOException {
        ArrayList<Number>list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            Number number=Integer.parseInt(reader.readLine());
            if (number==exitnumber)break;
            list.add(number);
        }
        return list;
    }

}
