//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();	
			
			
			TriangleOne test = new TriangleOne();
			test.setTriangle(3, 'A');
			out.print(test);
			
			
			//print the Triangle
			
			
			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}