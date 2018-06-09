package Lesson15_Objects.Final1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static Planet thePlanet;

    public static void main(String[] args) {
        System.out.println(thePlanet);
    }
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String planetname=reader.readLine();
        if (planetname.equals(Planet.EARTH)){
            thePlanet=new Earth();
        } else if (planetname.equals(Planet.MOON)){
            thePlanet=new Moon();
        } else if (planetname.equals(Planet.SUN)){
            thePlanet=new Sun();
        } else thePlanet=null;
    }

}
