import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Robot extends Canvas
{
   public Robot()    
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
     
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

       head(window);
       upperBody(window);
       lowerBody(window);
      
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      

      
		
				
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.BLUE);
      
      window.fillRect(300,250,200,100);
      
		
   }

   public void lowerBody( Graphics window )
   {

     window.setColor(Color.GREEN);
     
     window.fillRect(300,300,200,100);
     
     window.fillRect(405,400,100,50);
     
     window.fillRect(200,200,100,50);
     
     window.fillRect(500,200,100,50);
     
     window.fillRect(300,400,100,50);
     

   }
   
   
}