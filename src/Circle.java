import java.util.Random;

/**
 * The class circle that implements the abstract class "Figure"
 */
public class Circle extends Figure {
    /**
     * abscissa of the center of a circle
     */
    public double x;
    /**
     * the ordinate of the center of the circle
     */

    public double y;
    /**
     * radius of a circle
     */

    public double r;

    /**
     * Creates a new object - circle.
     * The coordinates of the circle are given randomly
     */
    public Circle() {
        Random rand = new Random();
        this.x =  rand.nextDouble();
        this.y = rand.nextDouble();
        double rStart = -1;
        while (rStart < 0 ) {
            rStart = rand.nextDouble();
        }
        this.r = rStart;
    }
    /**
     * Printing the coordinates of a circle in the console
     */
    @Override
    void print() {
        System.out.println("Circle with center ("+x+";"+y+") and  radius "+r);
        System.out.println();

    }


}
