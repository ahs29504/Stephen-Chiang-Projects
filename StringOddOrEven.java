import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if (word.length() % 2 == 0)
 		{
 			return true;
 		}
		return false;
	}

 	public String toString()
 	{
 		if(isEven())
 		{
 			return word + " is even.\n";
 		}
 		return word + " is odd.\n";
	}
}