import java.util.Arrays;

public class Main {
    private static final int TABLE_SIZE = 30;

    public static void main(String[] args) {
        int[][] consoleTable = new int[TABLE_SIZE][TABLE_SIZE];
        fill(consoleTable, 0);
        Arrays.asList(new Line(Orientation.HORIZONTAL, 0, 0, 5), new Line(Orientation.VERTICAL, 6, 7, 12), new Line(Orientation.DIAGONAL_UP, 10, 10, 2), new Line(Orientation.DIAGONAL_DOWN, 9, 0, 4)).forEach(line -> drawLine(consoleTable, line));
        printTable(consoleTable);
    }

    public static void printTable(int[][] table) {
        for (int[] row : table) {
            System.out.println(convert(row));
        }
    }

    public static String convert(int[] row) {
        String result = "";
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                result += " ";
            } else {
                result += Orientation.getOrientation(row[i]).getSymbol();
            }
        }
        return result;
    }

    public static void fill(int[][] table, int value) {
        for (int[] row : table) {
            Arrays.fill(row, value);
        }
    }

    public static void drawLine(int[][] table, Line line) {
        int x = line.getX();
        int y = line.getY();
        int length = line.getLength();
        Orientation orientation = line.getOrientation();

        switch (orientation) {
            case HORIZONTAL:
                for (int i = 0; i < length; i++) {
                    table[y][x + i] = orientation.getNumVal();
                }
                break;
            case VERTICAL:
                for (int i = 0; i < length; i++) {
                    table[y + i][x] = orientation.getNumVal();
                }
                break;
            case DIAGONAL_UP:
                for (int i = 0; i < length; i++) {
                    table[y - i][x + i] = orientation.getNumVal();
                }
                break;
            case DIAGONAL_DOWN:
                for (int i = 0; i < length; i++) {
                    table[y + i][x + i] = orientation.getNumVal();
                }
                break;
        }
    }
}