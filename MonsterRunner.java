import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		out.print("Enter 1st monster's name :: ");
		String name = keyboard.next();
		out.print("Enter 1st monster's size :: ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Monster mOne = new Monster (name, size);
		
		//ask for name and size
		out.print("Enter 2nd monster's name :: ");
		name = keyboard.next();
		out.print("Enter 2nd monster's size :: ");
		size = keyboard.nextInt();
		
		//instantiate monster two
		Monster mTwo = new Monster(name,size);
		out.print("\n");
		out.println("Monster 1 - " +mOne.name + " " + mOne.howBig);
		out.println("Monster 2 - " +mTwo.name + " " + mTwo.howBig);
		out.print("\n");
		
		if(mOne.isBigger(mTwo) == true)
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if(mOne.isSmaller(mTwo) == true)
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if(mOne.namesTheSame(mTwo) == true)
		{
			out.println("Monster one has the same name as Monster two.\n\n\n");
		}
		if(mOne.namesTheSame(mTwo) == false)
		{
			out.println("Monster one does not have the same name as Monster two.\n\n\n");
		}
		
		//ask for name and size
		out.print("Enter 1st monster's name :: ");
		mOne.name = keyboard.next();
		out.print("Enter 1st monster's size :: ");
		mOne.howBig = keyboard.nextInt();
		
		//instantiate monster one
		
		//ask for name and size
		out.print("Enter 2nd monster's name :: ");
		mTwo.name = keyboard.next();
		out.print("Enter 2nd monster's size :: ");
		mTwo.howBig = keyboard.nextInt();
		
		//instantiate monster two
		out.print("\n");
		out.println("Monster 1 - " +mOne.name + " " + mOne.howBig);
		out.println("Monster 2 - " +mTwo.name + " " + mTwo.howBig);
		out.print("\n");
		
		if(mOne.isBigger(mTwo) == true)
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if(mOne.isSmaller(mTwo) == true)
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if(mOne.namesTheSame(mTwo) == true)
		{
			out.println("Monster one has the same name as Monster two.\n\n\n");
		}
		if(mOne.namesTheSame(mTwo) == false)
		{
			out.println("Monster one does not have the same name as Monster two.\n\n\n");
		}
		
		//ask for name and size
		out.print("Enter 1st monster's name :: ");
		mOne.name = keyboard.next();
		out.print("Enter 1st monster's size :: ");
		mOne.howBig = keyboard.nextInt();
		
		//instantiate monster one
		
		//ask for name and size
		out.print("Enter 2nd monster's name :: ");
		mTwo.name = keyboard.next();
		out.print("Enter 2nd monster's size :: ");
		mTwo.howBig = keyboard.nextInt();
		
		//instantiate monster two
		out.print("\n");
		out.println("Monster 1 - " +mOne.name + " " + mOne.howBig);
		out.println("Monster 2 - " +mTwo.name + " " + mTwo.howBig);
		out.print("\n");
		
		if(mOne.isBigger(mTwo) == true)
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if(mOne.isSmaller(mTwo) == true)
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if(mOne.namesTheSame(mTwo) == true)
		{
			out.println("Monster one has the same name as Monster two.\n\n\n");
		}
		if(mOne.namesTheSame(mTwo) == false)
		{
			out.println("Monster one does not have the same name as Monster two.\n\n\n");
		}
	}
}