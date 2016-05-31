/**
 * Created by Elev1 on 2016-05-31.
 */
public class Reptile extends Animal {

    public Reptile() {
        this.species = "";
        this.sound = "";
    }

    public Reptile(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return species;
    }
}
