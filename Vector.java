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

    public static Vector fromPolar(double r, double theta) {
		/* Return a vector based on a polar coordinate (r, theta) or magnitude and direction respectively*/
        // Math calculation for x: cos(theta) = adjacent (x) / hypotenuse (r)
        // Step 2: x = cos(theta) * r
        double x = Math.cos(theta) * r;
        // Math calcuation for y: sin(theta) = opposite (y) / hypotenuse (r) 
        // Step 2: y = sin(theta) * r
        double y = Math.sin(theta) * r;
        Vector newVector = ;
    }

    // Helper method for increasing a number to the power of 2
    private static double squared(double d) {
        return Math.pow(d, 2);
    }

    // Getters
    public double getMag() {
        /* Returns the (positive) magnitude of the vector */
        // Math calculation: a^2 + b^2 = c^2, returning c
        // Step 2: c = sqrt(a^2 + b^2)
        double magnitude = Math.sqrt(squared(x) + squared(y));
        return magnitude;
    }

    public double getTheta() {
        /* Returns the angle of the vector in radians */
        // Math calculation: tan(theta) = opposite/adjacent, returning theta
        // theta = arctan(opposite/adjacent), but in this instance using atan2 to consider negative directions (ranging from -pi to pi, fully circular)
        double theta = Math.atan2(y, x);
        return theta;
    }

	

    public void main(String[] args) {
        // Main method runs test cases for this class
        // Test constructors and getters
        Vector testVector1 = new Vector(3, 4);
        Vector testVector2 = Vector.fromPolar()
        assert testVector1.getMag()
    }
}
