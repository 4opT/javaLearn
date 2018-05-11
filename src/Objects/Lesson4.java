package Objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson4 extends Cat {

    public static int applesPrice;

    public static void main(String[] args) throws IOException {

//        addPrice(13);
//        addPrice(10);
//        System.out.println(applesPrice);
     /*
       Cat cat=new Cat();
        cat.setName("Kitty");
        Cat minicat=new Cat();
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        */
        //System.out.println(getCatsCount());
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter first");
        int a=Integer.parseInt(reader.readLine());
        System.out.println("enter second");
        int b=Integer.parseInt(reader.readLine());
//        System.out.println("enter third");
//        int c=Integer.parseInt(reader.readLine());
//        System.out.println("enter fourth");
//        int d=Integer.parseInt(reader.readLine());
//        String name1=reader.readLine();
//        System.out.println("enter second");
//        String name2=reader.readLine();
//        compareName(name1,name2);
        System.out.println(coord(a,b));



    }


    public static int coord(int a, int b){
        return (a>0)?(b>0)?1:4:(b>0)?2:3;
    }

    public static void numbers(int a, int b, int c){
        if (a==b) System.out.println("3");
        else if (a==c) System.out.println("2");
        else System.out.println("1");
    }


    public static void compareName(String name1, String name2){
        if (name1.equals(name2)) System.out.println("equal");
        else if (name1.length()==name2.length()) System.out.println("only lengths are equal");
        else System.out.println("not equal");
    }




    public static void sort(int a, int b, int c){
        int max;
        int min;
        int middle;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max=b;
            min =a;
        }
        if (max>c){
            if (min<c){
                middle=c;
            } else {
                middle=min;
                min=c;
            }
        } else {
            middle=max;
            max=c;
        }
        System.out.println(max+" "+middle+" "+min);



    }

    public static int max(int a, int b, int c, int d){
        a=(a-b)<0?b:a;
        b=(c-d)<0?d:c;
        return (a-b)<0?b:a;
    }

    public static void isequal(int a, int b, int c){

        if (a==b && a==c) System.out.println(a+" "+b+" "+c);
            else  if (a==b||a==c) System.out.println(a+" "+a);
            else  if (c==b) System.out.println(c+" "+b);
                else System.out.println("no matches");

    }


    public static void svetofor(int a){
        if (a%5<3) System.out.println("green");
            else if (a%5<4) System.out.println("yellow");
                else System.out.println("red");
    }


    public static void isTriangleExist(int a,int b,int c){
        if (a+b>=c||a+c>=b||b+c>=a) System.out.println("triangle exist");
        else System.out.println("triangle is bad");
    }

    public static void denNedeli(int a){
        switch (a){
            case 1:
                System.out.println("ponedelnik");
                break;
            case 2:
                System.out.println("vtornik");
                break;
            case 3:
                System.out.println("sreda");
                break;
            case 4:
                System.out.println("4etverg");
                break;
            case 5:
                System.out.println("patnica");
                break;
            case 6:
                System.out.println("subb");
                break;
            case 7:
                System.out.println("sund");
                break;
            default:
                System.out.println("net takogo");
                break;
        }
    }

    public static void visokosni(int a){
        if (a%4==0 && a%100!=0 || a%400==00) {
            System.out.println("количество дней в году: 366");
        }
        else System.out.println("количество дней в году: 365");
    }

    public static int addPrice(int applesPrice){
        Lesson4.applesPrice+=applesPrice;
        return Lesson4.applesPrice;
    }

    public static void compare(int a){
        if (a<5) System.out.println("число меньше 5");
            else if (a>5) System.out.println("Число больше 5");
                else System.out.println("Число равно 5");
    }

    public static void closeToTen(int a, int b){
        if (Math.abs(a-10)>Math.abs(b-10)) System.out.println(b);
            else if (Math.abs(a-10)<Math.abs(b-10)) System.out.println(a);
                else System.out.println(a +"  "+ b);
    }

    public static void checkInterval(int a){
        if (50<=a && a<=100) System.out.println("число в интервале");
        else System.out.println("число не в интервале");
    }

    public static void checkSeason(int a){
        String monthString;
        switch (a){
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }



}

