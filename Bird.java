/**
 * Created by Elev1 on 2016-05-31.
 */
public class Bird extends Animal {
    public Bird() {
        this.species = "";
        this.sound = "";
    }
    public Bird(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return species;
    }
}
