package se.lexicon.laszlo.animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Donkey extends Mammal implements Domestic {
    public Donkey() {
        species = "donkey";
        sound = "iiihaw";
        food = "grass";
    }

    public String feedAnimal() {
        return food;
    }
}
