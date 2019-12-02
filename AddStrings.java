import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
   	  first = "";
   	  last = "";
   	  sum = "";
   }

   public AddStrings(String one, String two)
   {
   	  first = one;
   	  last = two;
   }

   public void setStrings(String one, String two)
   {
   	  first = one;
   	  last = two;
   }

 	public void add( )
 	{
 		sum = first + " " + last;
	}

 	public String toString()
 	{
 		String output="";
 		output = "first :: " + first
 		         +" \nlast :: "+ last 
 		         +"\nsum :: " + sum;
 		return output;
	}
}