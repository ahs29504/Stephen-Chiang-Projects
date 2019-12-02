import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringRemover test = new StringRemover();
		test.setRemover("xR-MxR-MHelloxR-M","R-M");
		out.println(test);
		
		test.setRemover("sxsssxssxsxssexssxsesss","xs");
		out.println(test);
		
		test.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty");
		out.println(test);
	}
}