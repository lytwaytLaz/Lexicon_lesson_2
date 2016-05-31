/**
 * Created by Elev1 on 2016-05-30.
 */
public class Bil {
    private String make;
    private String model;
    private String doorNum;

    public Bil() {
        this.make = "";
        this.model = "";
        this.doorNum = "";
    }

    public Bil(String make, String model, String doorNum) {
        this.make = make;
        this.model = model;
        this.doorNum = doorNum;

    }

    @Override
    public String toString() {
        return make + " " + model + ", " + doorNum;
    }
    public static void main(String[] args) {
        String make = "Mazda";
        String model = "RX-8";
        String doorNum = "2-dörrar";

        System.out.println(make + " " + model + ", " + doorNum);

    }
}
