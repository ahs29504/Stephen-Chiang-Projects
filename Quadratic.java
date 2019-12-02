import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = b = c = 0;
		rootOne = rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots()
	{
		double doubleA;
		doubleA = 2 * a;
		double ac;
		ac = 4 * a * c;
		double squaredB;
		squaredB = b * b;
		double squareroot;
		squareroot = Math. sqrt(squaredB - ac);
		rootOne = (-1 * b + squareroot) / doubleA;
		rootTwo = (-1 * b - squareroot) / doubleA;
	}

	public void print()
	{
		System.out.print("\n\n");
		System.out.print("rootone :: ");
		System.out.printf("%.2f", rootOne);
		System.out.print("\nroottwo :: ");
		System.out.printf("%.2f", rootTwo);
		System.out.print("\n\n\n\n");
	}
}