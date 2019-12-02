//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  - Ball

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

   public Ball(int x, int y)
   {
   	    super(x,y);
		xSpeed = 3;
		ySpeed = 1;
   }

   public Ball(int x, int y, int wid, int ht)
   {
     	super(x,y,wid,ht);
		xSpeed = 3;
		ySpeed = 1;
		
   }

   public Ball(int x, int y, int wid, int ht, Color col)
   {
   	super(x,y,wid,ht,col);
   	xSpeed=3;
   	ySpeed=1;
   }

   public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
   	super(x,y,wid,ht);
   	xSpeed=ySpd;
   	ySpeed=xSpd;
   }

   public Ball(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
   	super(x,y,wid,ht,col);
   	xSpeed=ySpd;
   	ySpeed=xSpd;
   }

   public void setXSpeed( int xSpd )
   {
   	xSpeed=xSpd;
   	
   }

   public void setYSpeed( int ySpd )
   {
   	ySpeed=ySpd;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draws over the old ball with a white ball
   	 draw(window,Color.WHITE);
   	 
   	//draw(window,Color.red); //draws over the old ball with whichever color you want
							//in case you want to have a trail
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
	//draws the Ball
	draw(window);
	
	

   }
   
	public boolean didCollideLeft(Object obj)
	{
		
		Block other = (Block)obj;

                  return getX()<=other.getX()

              +other.getWidth()

              +Math.abs(getXSpeed());
	}
	
	
		public boolean didCollideLeft2(Object obj)
	{
		
		Block other = (Block)obj;

                  return getX()<=other.getX()

              +other.getWidth()

              +Math.abs(getXSpeed());
	}
	
	
	public boolean didCollideRight(Object obj)
	{
		Block other = (Block)obj;                    

      return getX()+getWidth()>=

                           other.getX()

                           -Math.abs(getXSpeed());
	}
	
	
		public boolean didCollideRight2(Object obj)
	{
		Block other = (Block)obj;                    

      return getX()+getWidth()>=

                           other.getX()

                           -Math.abs(getXSpeed());
	}
	
	public boolean didCollideTop(Object obj)
	{
		 Block other = (Block)obj;

      return  getY()>=other.getY()

            &&getY()<=other.getY()+getHeight();
	}
	
	public boolean didCollideBottom(Object obj)
	{	
		 Block other = (Block)obj;

      return getY()+getHeight()>=   

                  other.getY()

                      &&getY()

                   +getHeight()<=other.getY()

                +other.getHeight();
	}    

	public boolean equals(Object obj)
	{
		  Ball other = (Ball)obj;

      if(super.equals(other)&&getXSpeed()

            ==other.getXSpeed()

           &&getYSpeed()

           ==other.getYSpeed())

                 return true;

      return false;
	}

   public int getXSpeed(  )
   {
   	return xSpeed;
   }

   public int getYSpeed(  )
   {
   	return ySpeed;
   }

   public String toString()
   {
   	return super.toString() +""+xSpeed+""+ySpeed;
   }
}