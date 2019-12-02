import static java.lang.System.*;

public class DivisorsRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Divisors test = new Divisors();
		test.setNum(10);
		out.println(test);
		
		test.setNum(45);
		out.println(test);
		
		test.setNum(14);
		out.println(test);
		
		test.setNum(1024);
		out.println(test);
		
		test.setNum(1245);
		out.println(test);
		
		test.setNum(33);
		out.println(test);
		
		test.setNum(65535);
		out.println(test);							
	}
}