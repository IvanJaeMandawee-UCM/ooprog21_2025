
public class DebugCircle {
    private int radius;
    private int diameter;
    private double area;

    public DebugCircle(int r) {
        this.radius = r;
        calculateValues();
    }

    private void calculateValues() {
        this.diameter = 2 * this.radius;
        this.area = Math.PI * this.radius * this.radius;
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
}