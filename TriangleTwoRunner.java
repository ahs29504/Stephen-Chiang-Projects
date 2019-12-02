//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleTwoRunner
{
   public static void main( String args[] )
   {
		TriangleTwo test = new TriangleTwo();
		Scanner eatmyface =  new Scanner(System.in);
		System.out.println("How many rows?");
		int a = eatmyface.nextInt();
		test.setTriangle(a, "*");
		System.out.println(test.toString());
		
		



	}
}