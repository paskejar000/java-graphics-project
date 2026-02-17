public class Coord {
    /* A coordinate represents a single fixed (x, y) value.*/

    // Instance variables
    private double x;
    private double y;

    // Constructors
    public Coord() {
        /* Constructor defaults to (0, 0) */
        this.x = 0;
        this.y = 0;
    }

    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Other formats
    public double[] toArray() {
        /* Returns the coordinate in an array [x, y] format. */
        double[] array = {x, y};
        return array;
    }

    public String toString() {
        /* Returns coordinate in String format of "(x, y)" */
        return "(" + x + "," + y + ")";
    }
}
