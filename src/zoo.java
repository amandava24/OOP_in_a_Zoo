import java.util.ArrayList;

public class zoo {

    public static void main(String[] args) {
        zoo z = new zoo();
//        z.eat("Tigger", "meat");
//        z.eat("Tigger", "bacon");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        pooh.sleep();

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        stinger.sleep();

        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        zoebot.feedAnimals(animals, "pizza");


    }
}
