import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHourRunner 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour();
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		System.out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
	
		//add more test cases
				
		System.out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		System.out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
	}
}