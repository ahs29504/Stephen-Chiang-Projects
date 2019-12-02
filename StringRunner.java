import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String s = keyboard.nextLine();
		StringOddOrEven test = new StringOddOrEven(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
		
		out.print("Enter a word :: ");
		s = keyboard.nextLine();
		test.setString(s);
		out.println(test);
	}
}