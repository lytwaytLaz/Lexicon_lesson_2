package animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Mammal implements Animal {
//    protected String species;
//    protected String sound;
    protected String species;
    protected String sound;
    protected String food;

    public Mammal() {
        this.species = "";
        this.sound = "";
    }

    public Mammal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    public String eatFood() {
        return food;
    }

    public String makeSound() {
        return sound;
    }

    @Override
    public String toString() {
        return species;
    }


}