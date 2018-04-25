package Lesson5;

public class Solution {

    public static void main(String[] args) {
        Idea idea=new Idea();
        printIdea(idea);
    }

    public static class Idea{
        public String getDescription(){
            return "sada";
        }

    }

    public static void printIdea(Idea idea){
        String s=idea.getDescription();
        System.out.println(s);
    }
}
