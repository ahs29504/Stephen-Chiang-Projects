import static java.lang.System.*;

public class LetterRemover
{
	private String sentence;
	private char lookFor;
	
	public LetterRemover()
	{
		sentence = "";
		lookFor = 0;
	}
	
	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public String removeLetters()
	{
		String cleaned = sentence;
		int loc = cleaned.indexOf(lookFor);
		while(loc >= 0)
		{
			cleaned = cleaned.substring(0,loc) + cleaned.substring(loc+1);
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}
	
	public String toString()
	{
		return sentence + " - letter to remove " + lookFor
		 		+ "\n" + removeLetters() + "\n\n";
	}
}