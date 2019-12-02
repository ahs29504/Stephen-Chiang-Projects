//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
	}

	public void check()
	{
		boolean valid = false;
		Scanner keyboard = new Scanner(System.in);
		do
		{
			out.print("Enter a password: ");
			password = keyboard.next();
			if(password.equals("mchammergohammer"))
			{
				valid = true;
				out.println("\n Valid");
			
			}
		     else
		     {
		     	out.println("\n Invalid");
		     }
		}
		while(!valid);
	}
}