import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

	//add constructors
	public TenToAny()

	//add a set method

	public String getNewNum()
	{
		String newNum="";
		int num= base10;
		while(num>0)
		{
			int rem = num%newBase;
			switch(rem)
			{
				case 10 :newNum='A'+newNum;break;
				case 11 :newNum='B'+newNum;break;
				case 12 :newNum='C'+newNum;break;
				case 13 :newNum='D'+newNum;break;
				case 14 :newNum='E'+newNum;break;
				case 15 :newNum='F'+newNum;break;
				default:newNum= rem+newNum;break;
			}
			num=num/newBase;
		}
		return newNum;
	}
	public String toString()
	
	return="";
	}