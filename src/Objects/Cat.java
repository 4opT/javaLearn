package Objects;

import java.io.IOException;

public class Cat {
    private String name;
    private static int catsCount=0;

    public Cat() {
        addNewCat();
    }

    public static void main(String[] args) throws IOException {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void addNewCat(){
        catsCount+=1;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }
}
