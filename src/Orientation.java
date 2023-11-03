public enum Orientation {
    HORIZONTAL(1, "-"),
    VERTICAL(2, "|"),
    DIAGONAL_UP(3, "/"),
    DIAGONAL_DOWN(4, "\\");

    private int numVal;
    private String symbol;

    Orientation(int numVal, String symbol) {
        this.numVal = numVal;
        this.symbol = symbol;
    }

    public int getNumVal() {
        return numVal;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Orientation getOrientation(int numVal) {
        for (Orientation orientation : Orientation.values()) {
            if (orientation.getNumVal() == numVal) {
                return orientation;
            }
        }
        return null;
    }


}
