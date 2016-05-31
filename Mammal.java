/**
 * Created by Elev1 on 2016-05-31.
 */
public class Mammal extends Animal {
//    protected String species;
//    protected String sound;

    public Mammal() {
        this.species = "";
        this.sound = "";
    }

    public Mammal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return species;
    }
}