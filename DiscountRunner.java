import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Discount demo = new Discount ();
		System.out.print("Bill after discount ::" + demo.getDiscountedBill(amt));
	
	
		out.print("\n Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		System.out.print("Bill after discount ::" + demo.getDiscountedBill(amt));
		
		
		
		out.print("\n Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		System.out.print("Bill after discount ::" + demo.getDiscountedBill(amt));
		
	
	
	
		out.print("\n Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		System.out.print("Bill after discount ::" + demo.getDiscountedBill(amt));
		
	
	
	
		out.print("\n Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		System.out.print("Bill after discount ::" + demo.getDiscountedBill(amt));
		

	}
}