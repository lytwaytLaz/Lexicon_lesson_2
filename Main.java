/**
 * Created by Daniel on 2016-05-30.
 */
public class Main {
    public static void main(String[] args) {
        WindowWhiteBox window1 = new WindowWhiteBox(1.0, 1.0);
        WindowBlackBox window2 = new WindowBlackBox(2.0, 2.0);
        System.out.println(window1.area());
        System.out.println(window2.area());
    }
}
