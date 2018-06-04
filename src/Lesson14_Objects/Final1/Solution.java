package Lesson14_Objects.Final1;

public class Solution {
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }

    public static void main(String[] args) {
        SuspensionBridge bridge=new SuspensionBridge();
        println(bridge);
    }
}
