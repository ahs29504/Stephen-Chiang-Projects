import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Social test = new Social("456-56-234");
		test.chopAndAdd();
		out.println(test);
		
		test.setWord("1-1-1");
		test.chopAndAdd();
		out.println(test);
		
		test.setWord("102-2-12");
		test.chopAndAdd();
		out.println(test);
		
		test.setWord("0-0-0");
		test.chopAndAdd();
		out.println(test);
	}
}