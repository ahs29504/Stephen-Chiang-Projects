import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class ColoredBoxes extends Canvas
{
	public ColoredBoxes()
	{
		setBackground(Color.white);
		setVisible(true);
	}

	public void paint( Graphics window )
	{
	  	window.setColor( Color.white );
	  	window.fillRect( 0, 0, 640, 480 );

		window.setColor(Color.red);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		int x = 95;
		int y = 95;        

		// changed box size to 5 x 5                                                                     ;

		for(int r=1; r<6; r++)
		{
			for(int c=1; c<6; c++)
			{
				window.setColor(Color.blue);
				window.fillRect(r*20+30,c*20+100,15,15);
			}
		}
	}

	
}