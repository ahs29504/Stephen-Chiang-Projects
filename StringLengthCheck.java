import static java.lang.System.*;

public class StringLengthCheck
{
	String wordOne, wordTwo;

	public StringLengthCheck()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringLengthCheck(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkLength( )
	{
		if(wordOne.length() == wordTwo.length())
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		if(checkLength())
		{
			return wordOne + "has the same # of letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same # of letters as " + wordTwo + "\n";
	}
}