package Lesson14_Objects.Final3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> userTypes=new ArrayList<String>();
        while (true){
            String s=reader.readLine();
            if (check(s)){
                userTypes.add(s);
            } else {
                break;
            }
        }
        if (userTypes.size()==0) System.out.println("No data");
        else {
            createObj(userTypes);

        }


    }

    public static boolean check (String s){
        if (s.equals("user")||s.equals("looser")||s.equals("coder")||s.equals("proger")) return true;
        return false;
    }

    public static void createObj(ArrayList<String> userTypes){
        Object person=null;
        for (String elem:userTypes){
            switch (elem){
                case "user": person=new User();
                break;
                case "looser":person=new Looser();
                break;
                case "coder":person=new Coder();
                break;
                case "proger":person=new Proger();
            }
            doWork(person);
        }
    }

    public static void doWork(Object person){
        if (person instanceof User) ((User) person).live();
        if (person instanceof Looser) ((Looser) person).doNothing();
        if (person instanceof Coder) ((Coder) person).coding();
        if (person instanceof Proger) ((Proger) person).enjoy();
    }
}
