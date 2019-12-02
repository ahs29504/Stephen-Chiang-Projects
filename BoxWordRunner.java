import static java.lang.System.*;

import java.util.Scanner;

public class BoxWordRunner
{
 public static void main( String args[] )
   {
   Scanner keyboard = new Scanner(System.in);
    String choice="";
        do{
            out.print("Enter the word for the box : ");
            String value = keyboard.next();


                //instantiate a BoxWord object
         BoxWord bw = new BoxWord(value );
            //call the toString method to print the triangle
            System.out.println( bw );

            System.out.print("Do you want to enter more data? ");
            choice=keyboard.next();
        }while(choice.equals("Y")||choice.equals("y"));
}
}