import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
    
	public MilesPerHour()
	{
		
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double TotalTime;
		TotalTime = (minutes / 60.0) + hours;
		mph = distance / TotalTime;
	}

	public void print()
	{
		System.out.print("\n");
		System.out.print(Math.round(distance));
		System.out.print(" miles in ");
		System.out.print(Math.round(hours));
		System.out.print(" hour and ");
		System.out.print(Math.round(minutes));
		System.out.print(" minutes = ");
		System.out.print(Math.round(mph));
		System.out.print(" MPH.");
		System.out.println("\n\n");
	}
}