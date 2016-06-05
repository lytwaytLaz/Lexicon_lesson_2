package animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Bird implements Animal {
    protected String species;
    protected String sound;
    protected String food;

    public Bird() {
        this.species = "";
        this.sound = "";
        this.food = "";
    }
    public Bird(String species, String sound, String food, boolean domestic) {
        this.species = species;
        this.sound = sound;
        this.food = food;
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
