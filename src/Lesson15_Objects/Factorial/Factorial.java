package Lesson15_Objects.Factorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try{
            int i=Integer.parseInt(reader.readLine());
            System.out.println(factorial(i));
        } catch (ArithmeticException e){
            System.out.println(0);
        } catch (Exception e){
            System.out.println("You've entered wrong value");
        }
    }

    public static long factorial(int i){
        if (i<0) throw new ArithmeticException();
        if (i==0) return 1;
        return i*=factorial(i-1);
    }


//    this one doesn't work:
//    public static BigInteger factorial(long i){
//        if (i<0) throw new IllegalArgumentException();
//        BigInteger res=BigInteger.ONE;
//        for (long j = 2; j <= i; j++) {
//            res=res.multiply(BigInteger.valueOf(i));
//        }
//        return res;
//    }

}
