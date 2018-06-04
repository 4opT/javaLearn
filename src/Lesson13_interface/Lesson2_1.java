package Lesson13_interface;



public class Lesson2_1 {
    public abstract class Translator{
        public abstract void translate(String word);
        abstract String getLanguage();
    }
    public class EnglishTranslator extends Translator{

        private String language="English";

        @Override
        public void translate(String word) {
            System.out.println("I'm trying to translate word \""+word+"\" in "+getLanguage());
        }

        @Override
        String getLanguage() {
            return this.language;
        }
    }

    public static void main(String[] args) {

    }
}
