package Lesson11_OOP;
//
//Задача: Добавь общий базовый класс к классам-фигур: (фигуры из шахмат).
//
public class Final2_2 {

    public class ChessItem{
        private boolean color;
        private int value;
        private int x;
        private int y;

        public boolean isColor() {
            return color;
        }

        public int getValue() {
            return value;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setColor(boolean color) {
            this.color = color;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class King extends ChessItem{
        public boolean kingMove(int x, int y){
            if (true) return true;
            return false;
        }
    }

    public class Horse extends  ChessItem{
        public boolean horseMove(int x, int y){
            if (true) return true;
            return false;
        }
    }

    public class Eleph extends ChessItem{
        public boolean ElephMove(int x, int y){
            if (true) return true;
            return false;
        }

    }

}
