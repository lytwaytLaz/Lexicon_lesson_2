/**
 * Created by Daniel on 2016-05-30.
 */
public class Rectangle {
    private final double width; // helst om kan m
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
}
