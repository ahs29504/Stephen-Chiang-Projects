public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public void Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1 ,x2 ,y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope=(double)(yTwo-yOne)/(xTwo-xOne);
	}

	public void print( )
	{
		System.out.print("the slope is");
		System.out.printf("%.2f",slope);
		System.out.println(" ");
	}
}