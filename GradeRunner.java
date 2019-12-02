import static java.lang.System.*;
import java.util.Scanner;

public class GradeRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//add test cases
		System.out.print("Enter a number grade:: ");
		int grade = keyboard.nextInt();
		Grade test = new Grade();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		
		System.out.print("Enter a number grade:: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
	}
}