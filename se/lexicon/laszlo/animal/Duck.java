package se.lexicon.laszlo.animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Duck extends Bird implements Domestic {
    public Duck() {
        species = "duck";
        sound = "quackquack";
        food = "bread";
    }

    public String feedAnimal() {
        return food;
    }

}
