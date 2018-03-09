import java.util.Random;

/**
 * Creates an array of geometric figures (implemented for a circle and a triangle).
 * Fills it in a random way.
 */
public class ArrayFigures {
    /**
    * This is field that specifies the number of elements in an array
     */
    private int amount;
    /**
     *This is field of a one-dimensional array containing geometric figures
     */
    Figure [] figures;

    /**
     * Creates a new object - an array of geometric figures (circle and a triangle)
     * @param number number of elements in the array
     *
     */
    public ArrayFigures(int number) {
        this.amount = number;
        this.figures = new Figure[number];
        Random rand = new Random();

        for (int i = 0; i < number; i++) {
            int nObject =    rand.nextInt(2);
            if  (nObject == 0) {
                figures[i] = new Circle();

            }
            else{
                figures[i] = new Triangle();
            }
            figures[i].print();
        }

    }

    /**
     * Displays the contents of an array of geometric figures
     */
    public void print(){
        int j;
        String nameFigure;
        for (int i = 0; i < amount; i++) {
            j = i+1;
            Class obj = figures[i].getClass();

            if (obj.getCanonicalName() == "Triangle") {
                nameFigure = "Треугольник";
            }
            else {
                if (obj.getCanonicalName() == "Circle")
                nameFigure = "Окружность";
                else {
                    nameFigure = "Не определена";
                }
            }
            System.out.println(j+": " + nameFigure);

        }

    }
}
