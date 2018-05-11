package Lesson9_Trace_Excep;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Task3_1 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (NullPointerException | FileNotFoundException e){
            System.out.println("Catch NPE or FNFE");
        }
    }

    public static void method1() throws Exception{
        int rand=(int)(Math.random()*4)+1;

        switch (rand) {
        case 1: throw new ArithmeticException();
        case 2: throw new NullPointerException();
        case 3: throw new FileNotFoundException();
        case 4: throw new URISyntaxException("uris","uris");
        }
    }

}
