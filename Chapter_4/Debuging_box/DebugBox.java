
public class DebugBox {
    private int width;
    private int length;
    private int height;

    public static void main(String[] agrs) {
        DebugBox DebugData = new DebugBox();
        DebugData.showData();

    }

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = width;
        this.height = width;
    }

    public void showData() {
        System.out.println("Width: " + width + " \nLength: " +
                length + " \nHeight: " + height);
    }

    public double getVolume() {
        double vol = length * width * height;
        return vol;
    }
}