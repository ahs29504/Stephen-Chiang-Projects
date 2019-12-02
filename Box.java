import static java.lang.System.*;

public class Box
{
	private String word;

	public Box()
	{
		word = "";
	}

	public Box(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		int x;
		for(x = 1; x <= word.length(); x = x + 1)
		{
			System.out.println(word);
		}
		System.out.print("\n\n");
	}
}