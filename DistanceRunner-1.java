import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test);
		
		//add more test cases
		
		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test);
		
		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test);
		
		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test);
	}
}