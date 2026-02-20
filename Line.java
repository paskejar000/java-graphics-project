/* A line object represents two connected coordinates.*/
public class Line {
    // Instance variables
    private Coord c1;
    private Coord c2;
    private boolean visible = false;

    // Constructors
    public Line(Coord c1, Coord c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    // Getters
    public Coord getC1() {
        // Return first coordinate
        return c1;
    }
    
    public Coord getC2() {
        // Return second coordinate
        return c2;
    }

    public boolean isVisible() {
        // Return visible
        return visible;
    }

    // Setters
    public void setC1(Coord newCoord) {
        // Set the first coordinate
        c1 = newCoord;
    }
    public void setC2(Coord newCoord) {
        // Set the second coordinate
        c2 = newCoord;
    }
    public void setVisible(boolean newState) {
        // Set visibility to true or false
        visibility = newState;
    }
}