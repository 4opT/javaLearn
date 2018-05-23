package Lesson12_polimorph;

//2. Нужно добавить в программу новую функциональность.
//
//        Задача: Сделать класс Pegas(пегас) на основе класса Horse(лошадь) и интерфейса Fly(летать).

public class Final2_2 {
    public class Horse{
        public void Run(){

        }
    }
    public interface Fly{
        public void Fly();
    }
    public class Pegas extends Horse implements Fly{

        @Override
        public void Fly() {

        }
    }
}
