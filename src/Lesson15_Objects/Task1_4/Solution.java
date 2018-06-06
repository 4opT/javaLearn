package Lesson15_Objects.Task1_4;

public class Solution {
    public static void main(String[] args) {
        Book book=new AgathaChristieBook();
        Book bookmark=new MarkTwainBook();
        System.out.println(Book.getOutputByBookType(book));
        System.out.println(Book.getOutputByBookType(bookmark));
    }

    public static abstract class Book{
        protected abstract Book getBook();
        public static String getOutputByBookType(Book book){
            if (book instanceof MarkTwainBook){
                return ((MarkTwainBook) book).markTwainOutput();
            } else if (book instanceof AgathaChristieBook) {
                return ((AgathaChristieBook) book).agathaChristieOutput();
            } else return "We don't have such author";
        }
    }

    public static class MarkTwainBook extends Book{
        public String author="Mark";
        public String name="Mark's book";

        @Override
        protected MarkTwainBook getBook() {
            return this;
        }
        protected String markTwainOutput(){
            return author;
        }
    }

    public static class AgathaChristieBook extends Book{
        public String author="Agatha";
        public String name="Agatha's book";

        @Override
        protected AgathaChristieBook getBook() {
            return this;
        }
        protected String agathaChristieOutput(){
            return author;
        }
    }
}

