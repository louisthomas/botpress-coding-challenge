public class Line {
    private Orientation orientation;

    private int x;

    private int y;
    private int length;


    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Line(Orientation orientation, int x, int y, int length) {
        this.orientation = orientation;
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "orientation=" + orientation +
                ", x=" + x +
                ", y=" + y +
                ", length=" + length +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
