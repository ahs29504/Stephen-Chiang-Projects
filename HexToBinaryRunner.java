import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//add test cases
		System.out.print("Enter a letter :: ");
		char hex = keyboard.next().charAt(0);
		HexToBinary test = new HexToBinary();
		test.setHex(hex);
		out.println(test);
		
		System.out.print("Enter a letter :: ");
		hex = keyboard.next().charAt(0);
		test.setHex(hex);
		out.println(test);
		
				System.out.print("Enter a letter :: ");
		hex = keyboard.next().charAt(0);
		test.setHex(hex);
		out.println(test);
		
				System.out.print("Enter a letter :: ");
		hex = keyboard.next().charAt(0);
		test.setHex(hex);
		out.println(test);
		
				System.out.print("Enter a letter :: ");
		hex = keyboard.next().charAt(0);
		test.setHex(hex);
		out.println(test);
		
				System.out.print("Enter a letter :: ");
		hex = keyboard.next().charAt(0);
		test.setHex(hex);
		out.println(test);
		
				System.out.print("Enter a letter :: ");
		hex = keyboard.next().charAt(0);
		test.setHex(hex);
		out.println(test);
	}
}