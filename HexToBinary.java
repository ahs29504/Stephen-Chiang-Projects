import static java.lang.System.*;

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{
		hex = 0;
	}

	public HexToBinary(char hexNum)
	{
		hex = hexNum;
	}

	public void setHex(char hexNum)
	{
		hex = hexNum;
	}

	public String getBinary()
	{
		switch(hex)
		{
			case 'A' : return "1010";
			case 'B' : return "1011";
			case 'C' : return "1100"; 
			case 'D' : return "1101"; 
			case 'E' : return "1110"; 
			case 'F' : return "1111"; 
			case 'X' : return "ERROR";
		}
		return "";
	}

	public String toString()
	{
		return hex + " is " + getBinary() + " in binary!\n";
	}
}