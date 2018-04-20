public class Giraffe extends Animal {

    public Giraffe(String newName) {
        super(newName, "leaves");
    }

    public void eat(String food) {
        if (!food.equals(favoriteFood)) {
            System.out.println("YUCK!!! " + name + " will not eat " + food + ".");
            System.out.println(name + " eats " + favoriteFood + ".");
        }

        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + favoriteFood + ".");

        }
    }
}


