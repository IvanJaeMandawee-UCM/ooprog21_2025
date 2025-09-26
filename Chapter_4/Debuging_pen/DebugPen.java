
public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        this.color = "Black";
        this.point = "medium";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(String point) {
        this.point = point;
    }
}