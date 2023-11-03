public class Line {
    private int x;

    private int y;
    private int length;

    private Orientation orientation;

    public Line(int x, int y, int length, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.orientation = orientation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Line{" +
                "x=" + x +
                ", y=" + y +
                ", length=" + length +
                ", orientation=" + orientation +
                '}';
    }
}
