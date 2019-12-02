import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		return " " + word.charAt(0) ;
	}
	
	public String getLast()
	{
		return " " + word.charAt(word.length()-1);
	}

 	public String toString()
 	{
 		String output="";
 		return output ;
	}
}