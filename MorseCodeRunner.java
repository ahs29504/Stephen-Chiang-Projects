import static java.lang.System.*;

public class MouseCodeRunner
{
	public static void main( String args[] )
	{
		//add test cases
		MorseCode test = new MorseCode();
		test.setChar('A');
		out.print(test);
		
		test.setChar('B');
		out.print(test);
		
		test.setChar('3');
		out.print(test);
		
		test.setChar('Z');
		out.print(test);
		
		test.setChar('8');
		out.print(test);
		
		test.setChar('F');
		out.print(test);
		
		test.setChar('0');
		out.print(test);
	}
}