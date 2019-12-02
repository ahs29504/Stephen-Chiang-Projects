import java.util.Scanner; 
import java.lang.Math.*;

public class TriangleRunner  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();


		Triangle test = new Triangle(3, 3, 3);
		test.calcPerimeter();
		test.calcArea();
		test.print();


		//ask for user input
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();


		test.setSides(7,8,9);
		test.calcPerimeter();
		test.calcArea();
		test.print();
		
		
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();


		test.setSides(10,9,11);
		test.calcPerimeter();
		test.calcArea();
		test.print();


		//add one more input section




	}
}