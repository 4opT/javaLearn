package Lesson8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task2_1 {
    public static void main(String[] args) throws Exception
    {
        LinkedList list1=new LinkedList();
        ArrayList list2=new ArrayList();
        System.out.println("Add:");
        list1=addElement(list1);
        list2=addElement(list2);
        System.out.println("get: ");
        getElement(list1);
        getElement(list2);
        System.out.println("set:");
        setElement(list1);
        setElement(list2);
        System.out.println("Remove:");
        removeElement(list1);
        removeElement(list2);
    }

    public static LinkedList addElement(LinkedList list){
        System.out.print("LinkedList - ");
        Date begintime=new Date();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
        System.out.println(msDelay+" ms passed");
        return list;
    }
    public static void getElement(LinkedList list){
        System.out.print("LinkedList - ");
        Date begintime=new Date();
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
        System.out.println(msDelay+" ms passed");

    }
    public static void setElement(LinkedList list){
        System.out.print("LinkedList - ");
        Date begintime=new Date();
        for (int i = 0; i < 10000; i++) {
            list.set(i,i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
        System.out.println(msDelay+" ms passed");

    }


        public static LinkedList removeElement(LinkedList list){
        System.out.print("LinkedList - ");
        Date begintime=new Date();
        for (int i = 9999; i >=0; i--) {
            list.remove(i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
            System.out.println(msDelay+" ms passed");
         return list;
    }


    public static ArrayList addElement(ArrayList list){
        System.out.print("Arraylist - ");
        Date begintime=new Date();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
        System.out.println(msDelay+" ms passed");
        return list;

    }
    public static void getElement(ArrayList list){
        System.out.print("Arraylist - ");
        Date begintime=new Date();
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
        System.out.println(msDelay+" ms passed");;

    }
    public static void setElement(ArrayList list){
        System.out.print("Arraylist - ");
        Date begintime=new Date();
        for (int i = 0; i < 10000; i++) {
            list.set(i,i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
        System.out.println(msDelay+" ms passed");

    }


        public static ArrayList removeElement(ArrayList list){
        System.out.print("Arraylist - ");
        Date begintime=new Date();
        for (int i = 9999; i >=0; i--) {
            list.remove(i);
        }
        Date endTime=new Date();
        long msDelay=begintime.getTime()-endTime.getTime();
            System.out.println(msDelay+" ms passed");
        return list;
    }

        


}
