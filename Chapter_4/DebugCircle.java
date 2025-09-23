
public class DebugCircle {

    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {

        this.radius = r;
        this.diameter = 2 * r;
        this.area = PI * r * r;

    }

    public int getRadius() {

        return radius;
    }

    public int getDiameter() {

        return diameter;
    }

    public double getArea() {

        return area;

    }

    public void debug() {

        System.out.println("Radius: " + getRadius());
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Area: " + getArea());

    }

    public static void main(String[] args) {
        DebugCircle Debug = new DebugCircle(5);
        Debug.debug();
    }

}