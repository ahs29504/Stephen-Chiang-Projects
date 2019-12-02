import static java.lang.System.*;

public class Divisors
{
	private int number;
	
	public Divisors()
	{
		number = 0;
	}
	
	public void setNum(int num)
	{
		number = num;
	}
	
	public String getDivisors()
	{
		String divisors = "";
		int temp = number;
		int i = 1;
		while(i < temp)
		{
			if(temp % i == 0)
			{
				divisors = divisors + " " + i + " ";
			}
			i++;
		}
		return divisors;
	}
	
	public String toString()
	{
		return number + " has divisors " + getDivisors() + "\n";
	}
}