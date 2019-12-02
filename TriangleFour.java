//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
		setTriangle(0, " ");
	}

	public TriangleFour(int count, String let)
	{
		setTriangle(count, let);
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;

	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";

		for(int i = 1; i <= size; i++) 
		{
			for(int k = (size-i); k >= 0; k--) 
			{
				output += "*";
			}
			for(int j = 0; j<i; j++) 
			{
				output += letter;
			}
			output += "\n";
		}

		return output;
	}
}