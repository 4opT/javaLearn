package Lesson14_Objects.Lesson2_1;

public class HenFactory {
        public Hen getHen(String country){
            switch (country){
                case "Russian": return new RussianHen();

                case "Belorussian":return new BelarusianHen();

                case "Moldovan": return new MoldovanHen();

                case "Ukrainian":return new UkrainianHen();
                default:return new Hen() {
                    @Override
                    int getCountofEggsPerMonth() {
                        return (int) (Math.random()*10);
                    }
                };
            }
        }
}
