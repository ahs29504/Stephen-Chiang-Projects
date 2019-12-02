import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = yOne = xTwo = yTwo = 0;
		distance = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		double x;
		x = (xTwo - xOne) * (xTwo - xOne);
		double y;
		y = (yTwo - yOne) * (yTwo - yOne);
		distance = Math.sqrt(x + y);
	}

	public void print( )
	{
		System.out.print("distance == ");
		System.out.printf("%.3f", distance);
		System.out.print("\n\n");
	}
}