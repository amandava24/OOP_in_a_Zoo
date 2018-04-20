import java.util.ArrayList;

public class Zookeeper {

    String name;

    public Zookeeper(String aName) {
        this.name = aName;
    }

    public String feedAnimals(ArrayList<Animal> animals, String food) {
        System.out.println(name + " is feeding " + food + " of " + Animal.population + " total animals.");
        System.out.println(name + " is feeding " + food + " to " + animals.size() + " animals.");
        return name;
    }

}

