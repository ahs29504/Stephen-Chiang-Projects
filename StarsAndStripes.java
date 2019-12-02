import static java.lang.System.*;

public class StarsAndStripes
{
	public StarsAndStripes()
	{
	out.println("StarsAndStripes");
	printTwoBlankLines();
	}
	public void printTwentyStars()
	{
		System.out.println("********************");
	}
	
	public void printTwentyDashes()
	{
		System.out.println("--------------------");
	}
	public void printTwoBlankLines()
	{
		out.print("\n\n");
	}
	public void printASmallBox()
	{
		System.out.println("--------------------");
		System.out.println("********************");
		System.out.println("--------------------");
		System.out.println("********************");
        System.out.println("--------------------");
		System.out.println("********************");
		System.out.println("--------------------");
	}
	
	public void printABigBox()
	{
		printASmallBox();
		printASmallBox();
	}
}