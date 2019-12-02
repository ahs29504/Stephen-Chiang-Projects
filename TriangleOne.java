//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
   private int size;
   private char letter;

	public TriangleOne()
	{
		setTriangle(0, ' ');
	}

	public TriangleOne(int theSize, char theLetter)
	{
		setTriangle(theSize, theLetter);
	
	}


	public void setTriangle(int theSize, char theLetter)
	{
		size = theSize;
		letter = theLetter;

	}

	public char getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for(int r = 1; r<= size; r++)
		{
			for(int c = 1; c<=r; c++)
			{
				output = output + getLetter();
			}
			output = output + "\n";
		}	
		return output+"\n";
	}
}