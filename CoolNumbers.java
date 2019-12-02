import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
		if(num%3==1)
		if(num%4==1)
		if(num%5==1)
		if(num%6==1)
		return true;
		 return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int count = 0;
		for(int index = 6; index<=stop; index++)
		{
			if(isCoolNumber(index)==true)
			{
				count++;
			}
		}
		return count;
	}
}