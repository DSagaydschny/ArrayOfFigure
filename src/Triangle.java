import java.util.Random;
/**
 * The class Triangle that implements the abstract class "Figure"
 */
public class Triangle extends Figure {
    /**
     * The abscissa of the base point "A" of the triangle
     */
    public double xA;
    /**
     * The ordinate of the base point "A" of the triangle
     */
    public double yA;
    /**
     * The abscissa of the  point "B"
     */


    public double xB;
    /**
     * The ordinate of the  point "B"
     */


    public double yB;
    /**
     * The abscissa of the  point "C"
     */


    public double xC;
    /**
     * The ordinate of the  point "C"
     */


    public double yC;

    /**
     * Creates a new object - Triangle.
     * The coordinates of the circle are given randomly
     */
    public Triangle() {
        Random rand = new Random();
        this.xA = rand.nextDouble();
        this.yA = rand.nextDouble();
        this.xB = rand.nextDouble();
        this.yB = rand.nextDouble();
        this.xC = rand.nextDouble();
        this.yC = rand.nextDouble();
    }
    /**
     * Printing the coordinates of a Triangle in the console
     */

    @Override
    void print() {
        System.out.println("Triangle with coordinates A ("+xA+";"+yA+")");
        System.out.println("Triangle with coordinates B ("+xB+";"+yB+")");
        System.out.println("Triangle with coordinates C ("+xC+";"+yC+")");
        System.out.println();
    }


}
