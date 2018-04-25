package Lesson5;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class maxFrom5 {
    public static ArrayList<Integer> i;

    public static void main(String[] args) throws IOException {
        arrayReturn();

    }

    public static void arrayReturn () throws IOException {

        maxFrom5.i=new ArrayList<Integer>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        while (s.equals("")){
            maxFrom5.i.add(Integer.parseInt(s));
        }

    }

    public static void sortArray(){

        for (int j = 0; j < maxFrom5.i.size(); j++) {
            for (int k = 0; k < maxFrom5.i.size(); k++) {
                if (i.get(k)<i.get(k+1)){
                    int temp=i.get(k);

                }
            }
        }

    }

}