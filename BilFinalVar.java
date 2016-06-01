/**
 * Created by Elev1 on 2016-06-01.
 */
public class BilFinalVar {
    // make variables final to make objects of class Bil immutable
    private final String make;
    private final String model;
    private final String doorNum;

    public BilFinalVar() {
        this.make = "";
        this.model = "";
        this.doorNum = "";
    }

    public BilFinalVar(String make) {
        this.make = make;
    }

    public BilFinalVar(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public BilFinalVar(String make, String model, String doorNum) {
        this.make = make;
        this.model = model;
        this.doorNum = doorNum;

    }

    @Override
    public String toString() {
        return make + " " + model + ", " + doorNum;
    }
    public static void main(String[] args) {
//        String make = "Mazda";
//        String model = "RX-8";
//        String doorNum = "2-dörrar";

        BilFinalVar mazda = new BilFinalVar("Mazda", "RX-8", "2-dörrar");
        System.out.println(mazda);



    }
}

