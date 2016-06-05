package bil;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-05-30
 */

public class Bil {
    private String make;
    private String model;
    private int numOfDoors;

    public Bil() {
        this.make = "";
        this.model = "";
        this.numOfDoors = 0;
    }

    public Bil(String make) {
        this();
        this.make = make;
    }

    public Bil(String make, String model) {
        this(make);
        this.model = model;
    }


    public Bil(String make, String model, int numOfDoors) {
        this(make, model);
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
