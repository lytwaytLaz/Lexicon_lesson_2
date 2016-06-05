package animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Reptile implements Animal {
    protected String species;
    protected String sound;
    protected String food;

    public Reptile() {
        this.species = "";
        this.sound = "";
    }

    public Reptile(String species, String sound) {
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
