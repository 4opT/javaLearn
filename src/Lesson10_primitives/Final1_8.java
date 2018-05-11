package Lesson10_primitives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Final1_8 {
    public static void main(String[] args) throws IOException {
        ArrayList<String>array=new ArrayList<String>();

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String text=reader.readLine();
            if (text.isEmpty()){
                break;
            } else array.add(text);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public class obj{
        public Integer num;
        public String text;
        public Object someObject;
        //...

        public obj(int num) {
            this.num = num;
        }

        public obj(String text) {
            this.text = text;
        }

        public obj(Object someObject) {
            this.someObject = someObject;
        }

        @Override
        public String toString() {
            if (!this.text.isEmpty()) return text;
            if (this.num!=null) return num.toString();
            if (this.someObject!=null) return someObject.toString();
            else return "can't find string";
        }
    }


}
