import static java.lang.System.*;

public class StringLengthCheckRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringLengthCheck test = new StringLengthCheck();
		test.setWords("hello","goodbye");
		out.println(test);
		
		test.setWords("one","two");
		out.println(test);
		
		test.setWords("three","four");
		out.println(test);
		
		test.setWords("TCEA","UIL");
		out.println(test);
		
		test.setWords("State","Champions");
		out.println(test);
		
		test.setWords("ABC","DEF");
		out.println(test);
		
		test.setWords("four","five");
		out.println(test);
		
		test.setWords("whoot","what");
		out.println(test);
	}
}