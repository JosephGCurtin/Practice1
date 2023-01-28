
/** 
 * Choosing a shape either square or triangle to generate. 
 * @author Joseph Curtin
 * @version 1/27/2023
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		try {

			Scanner theShapeInput = new Scanner(System.in);
			System.out.print("This program with show either a square or triangle depending "
					+ "on which you choose. \n \nEnter 1 for a square or 2 for a triangle: ");

			int theChosenShape = theShapeInput.nextInt();

			if (theChosenShape == 1) {

				AbstractShape abstractShape = new Square();
				abstractShape.theShape();
			}

			else if (theChosenShape == 2) {

				AbstractShape abstractShape = new Triangle();
				abstractShape.theShape();
			}

			else {
				System.out.println("That is not a 1 or 2. Please try again and enter "
						+ "either a 1 for a square or a 2 for a triangle.");
			}
		}

		catch (InputMismatchException e) {
			System.out.println("That is not a 1 or 2. Please try again and enter "
					+ "either a 1 for a square or a 2 for a triangle.");
		}
	}

}