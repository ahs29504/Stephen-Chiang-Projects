//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString test = new BiggestString("abc", "cba", "bca");//add test cases
		out.println(test);

		test.setStrings("one", "fourteen", "twenty");
		out.println(test);
		
		test.setStrings("124323", "20009", "3434");
		out.println(test);
		
		test.setStrings("abcde", "ABCDE", "1234234324");
		out.println(test);
		
		
	}
}