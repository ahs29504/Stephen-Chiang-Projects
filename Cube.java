public class Cube
{
	private int side;
	private int surfaceArea;

	public void setSide(int s)
	{
		
	side = s;	
		
		
		
	}

	public void calculateSurfaceArea( )
	{
		
		
		int square = side * side;
		surfaceArea = square * 6;
		
		
		
	}

	public void print( )
	{
		
		
		System.out.println("The surface area is ::"+ surfaceArea);
		
	}
}