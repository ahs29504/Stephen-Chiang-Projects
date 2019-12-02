import static java.lang.System.*;

import java.util.Scanner;

public class BoxRunner
{
 public static void main( String args[] )
 
 {
   Scanner keyboard = new Scanner(System.in);
    String choice="";
        do{
            out.print("Enter the size of the box : ");
            int big = keyboard.nextInt();
            //out.print("Enter a letter : ");
            //String value = keyboard.next();

                //instantiate a TriangleFour object
         Box box = new Box( big);
            //call the toString method to print the triangle
            System.out.println( box );

            System.out.print("Do you want to enter more data? ");
            choice=keyboard.next();
        }while(choice.equals("Y")||choice.equals("y"));
}
}