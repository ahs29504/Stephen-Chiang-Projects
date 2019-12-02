import static java.lang.System.*;

public class VowelCounter
{

	public static String getNumberString( String s)
	{
			String ret = "";
	final String vowels ="aeiouAEIOU";
	int index = 0 ;
	
	
	for(char c:s.toCharArray())
	
	{
		if(vowels.indexOf(c)!= -1)
		{
			ret=ret+index;
			index++;
			if(index==10)
			{
				index = 0;
			}
			ret = ret + c;
		}
	}
		return ret;
	}
}