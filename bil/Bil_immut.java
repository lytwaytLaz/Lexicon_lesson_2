package bil;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-05
 */
public class Bil_immut {
    private final String make;
    private final String model;
    private final int numOfDoors;

    public Bil_immut(String make, String model, int numOfDoors) {
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumOfDoors() {
        return this.numOfDoors;
    }

    @Override
    public String toString() {
        return make + " " + model + ", " + numOfDoors;
    }

}
