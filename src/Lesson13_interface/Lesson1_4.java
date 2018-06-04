package Lesson13_interface;

public class Lesson1_4 {
    interface Selectable{
        void onSelect(int x,int y);
    }
    interface Updatable{
        boolean refresh();
    }
    public class Screen implements Selectable,Updatable{

        @Override
        public boolean refresh() {
            return true;
        }

        @Override
        public void onSelect(int x, int y) {

        }
    }
}
