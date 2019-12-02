import static java.lang.System.*;

public class Perfect
{
	private int number;
	private int sum;
	
	public Perfect()
	{
		number = 0;
		sum = 0;
	}
	
	public void setNum(int num)
	{
		number = num;
	}
	
	public boolean isPerfect()
	{
		int temp = number;
		int i;
		for(i = 1; i < number; i++)
		{
			if(temp % i == 0)
			{
				sum = sum + i;
			}
		}
		if(number == sum)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public String toString()
	{
		if(isPerfect())
		{
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
}