import static java.lang.System.*;
import java.util.Scanner;

public class DecorderRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//add test cases
		System.out.print("Enter a letter :: ");
		char let = keyboard.next().charAt(0);
		Decoder test = new Decoder();
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
		
		System.out.print("Enter a letter :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.print(test);
	}
}