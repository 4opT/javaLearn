package Lesson10_primitives;

public class Final1_6 {
    public class Human{
        private int age;
        private boolean gender;
        private int iq;
        private String phoneNumber;
        private boolean hasChild;
        private int weight;

        public Human(int age, boolean gender, int iq, String phoneNumber, boolean hasChild, int weight) {
            this.age = age;
            this.gender = gender;
            this.iq = iq;
            this.phoneNumber = phoneNumber;
            this.hasChild = hasChild;
            this.weight = weight;
        }
        public Human(int age, boolean gender){
            this.age=age;
            this.gender=gender;
            int maxValue=0;
            if (age>30){
                maxValue+=100;
                if (gender) maxValue+=100;
            }
            clever(maxValue);
        }

        public Human(){
            //...
        }

        private void clever(int maxValue){
            this.iq=maxValue;
        }
    }
}
