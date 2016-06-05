package bil;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-05
 */
public class Main {
    public static void main(String[] args) {

        Bil mazda = new Bil("Mazda", "RX-8", 2);
        Bil_immut volvo = new Bil_immut("Volvo", "XC-90", 4);
        System.out.println("Make: " + mazda.getMake() + "\nModel: " + mazda.getModel() +
                            "\n" + mazda.getNumOfDoors() + "-door\n");
        System.out.println("Make: " + volvo.getMake());
        System.out.println("Model: " + volvo.getModel());
        System.out.println(volvo.getNumOfDoors() + "-door\n");
    }
}
