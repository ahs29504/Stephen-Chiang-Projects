import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		socialNum = "";
	}

	public Social(String soc)
	{
		socialNum = soc;
	}


	public void setWord(String w)
	{
		 socialNum = w;
	}

	public void chopAndAdd()
	{
		sum = 0;
		String sub = socialNum;
		sub = sub.substring(0, sub.indexOf("-"));
		sum = sum + Integer.parseInt(sub);
		sub = socialNum;
		sub = sub.substring(sub.indexOf("-")+1, sub.lastIndexOf("-"));
		sum = sum + Integer.parseInt(sub);
		sub = socialNum;
		sub = sub.substring(sub.lastIndexOf("-")+1);
		sum = sum + Integer.parseInt(sub);	
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}