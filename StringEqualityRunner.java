import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality test = new StringEquality();
		test.setWords("hello","goodbye");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("one","two");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("three","four");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("TCEA","UIL");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("State","Champions");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("ABC","ABC");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("ABC","CBA");
		test.checkEquality();
		test.toString();
		out.println(test);
		
		test.setWords("Same","Same");
		test.checkEquality();
		test.toString();
		out.println(test);
	}
}