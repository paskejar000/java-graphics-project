import java.lang.Math;

public class Vector extends Coord {
    // Represents a 2D vector value, inherits the same methods from coordinate but allows for more complex physics calculations.
    private double x;
    private double y;
    
    // Constructors
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Helper method for increasing a number to the power of 2
    private static double squared(double d) {
        return Math.pow(d, 2);
    }

    // Getters
    public double getMag() {
        /* Returns the (positive) magnitude of the vector */
        // Math calculation: a^2 + b^2 = c^2, returning c
        double magnitude = Math.sqrt(squared(x) + squared(y));
        return magnitude;
    }

	public static Vector fromDirectionAndMagnitude(double theta, double mag) {
		/* Return a vector based on a direction and magnitude*/
        Vector newVector = ;
    }
}
