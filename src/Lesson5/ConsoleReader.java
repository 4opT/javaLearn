package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static void main(String[] args) throws IOException {
        //String text=readSting();
        //int number=readInt();
       // double number1=readDouble();
        boolean isTrue=readBoolean();
        if (isTrue) System.out.println("true");
         else System.out.println("false");
        System.out.println("Did it");
    }

    public static String readSting() throws IOException {
        System.out.println("Enter string pls");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws IOException {
        System.out.println("Enter int pls");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws IOException {
        System.out.println("Enter double pls");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());

    }

    public static boolean readBoolean() throws IOException {
        System.out.println("Enter boolean pls");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(reader.readLine());
    }

}
