import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner kb = new Scanner(System.in);
		System.out.print("Emter a whole number ::");
		int input = kb.nextInt();
		System.out.println(input+" is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input+" is even :: " + NumberVerify.isEven(input));
		
		System.out.print("Emter a whole number ::");
		input = kb.nextInt();
		System.out.println(input+" is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input+" is even :: " + NumberVerify.isEven(input));
		
			System.out.print("Emter a whole number ::");
		input = kb.nextInt();
		System.out.println(input+" is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input+" is even :: " + NumberVerify.isEven(input));
		
			System.out.print("Emter a whole number ::");
		input = kb.nextInt();
		System.out.println(input+" is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input+" is even :: " + NumberVerify.isEven(input));
		
			System.out.print("Emter a whole number ::");
		input = kb.nextInt();
		System.out.println(input+" is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input+" is even :: " + NumberVerify.isEven(input));
		//add in more test cases
	}
}