import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main(String[] args)
	{
		//add a case
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a :: ");
		int quadA = keyboard.nextInt();

		System.out.print("Enter b :: ");
		int quadB = keyboard.nextInt();

		System.out.print("Enter c :: ");
		int quadC = keyboard.nextInt();

		Quadratic test = new Quadratic();
		test.setEquation(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
		
		//add a case
		System.out.print("Enter a :: ");
		quadA = keyboard.nextInt();

		System.out.print("Enter b :: ");
		quadB = keyboard.nextInt();

		System.out.print("Enter c :: ");
		quadC = keyboard.nextInt();

		test.setEquation(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
		
		//add a case
		System.out.print("Enter a :: ");
		quadA = keyboard.nextInt();

		System.out.print("Enter b :: ");
		quadB = keyboard.nextInt();

		System.out.print("Enter c :: ");
		quadC = keyboard.nextInt();

		test.setEquation(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
	}
}