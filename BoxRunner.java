import static java.lang.System.*;

public class BoxRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Box test = new Box();
		test.setWord("hippo");
		test.print();
		
		test.setWord("abcd");
		test.print();
		
		test.setWord("it");
		test.print();
		
		test.setWord("a");
		test.print();
		
		test.setWord("chicken");
		test.print();
	}
}