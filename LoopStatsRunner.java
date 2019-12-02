//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class ForLoopCircles extends Canvas
{
	public ForLoopCircles()
	{
		setBackground(Color.WHITE);
	}
	
	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Lab 8A", 20, 40 );
	  	window.drawString("Drawing Circles Using a for loop ", 20, 80 );
	  	drawCircles(window);
	}
	
	public void drawCircles(Graphics window)
	{
		for(int i=0; i<18; i=i++)
		{
			int x=20;
			window.setColor(Color.BLUE);
			window.drawOval( x, 200, 40, 40 );	
			x = x+20;
		}	
	}
}