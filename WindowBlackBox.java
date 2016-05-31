/**
 * Created by Daniel on 2016-05-30.
 */
public class WindowBlackBox {
    private final Rectangle rectangle;

    public WindowBlackBox(double width, double height) {
        rectangle = new Rectangle(width, height);
    }

    public double area() {
        return rectangle.area();
    }
}
