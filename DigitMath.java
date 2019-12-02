import static java.lang.System.*;

public class DigitAdder
{
	private int number;
	
	public DigitAdder()
	{
		number = 0;
	}
	
	public void setNum(int num)
	{
		number = num;
	}
	
	public int getSum()
	{
		int sum = 0;
		int i = number;
		while(i > 0)
		{
			sum = sum + i % 10;
			i = i / 10;
		}
		return sum;
	}
	
	public String toString()
	{
		return getSum() + " is the sum of the digits of " + number + "\n";
	}
}