import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(theChar>=65)
		{
			if(theChar<'A'+26)
			{
				return true; 
			}
		}
		return false;
	}

	public boolean isLower( )
	{
		if(theChar>=97)
		{
			if(theChar<'a'+26)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean isNumber( )
	{
		return false;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
}