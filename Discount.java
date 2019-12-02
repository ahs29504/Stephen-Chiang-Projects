import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	private double amount;
	private double discount;
	
	public Discount()
	{
		amount = 0.0;
	}
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public double getDiscountedBill(double bill)
	{
		amount=bill;
		discount = amount;
		if (bill>2000)
		{
			discount = amount * 0.85;
		}
		return discount;
	}
}