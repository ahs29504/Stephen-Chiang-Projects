import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
		
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWords()
	{
		String back="";
		for(int x = 0; x < word.length(); x++)
		{
			back = word.charAt(x) + back;
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar()
 				+"\n"
 				+ getLastChar()
 				+"\n"
 				+ getBackWords()
 				+"\n"
 				+ word
 				+"\n\n";
	}
}