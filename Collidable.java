//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  - Collidable

import java.awt.Color;
import java.awt.Graphics;

public interface Collidable
{
	    public  boolean didCollideLeft(Object obj);

            public boolean didCollideRight(Object obj);
            
            boolean didCollideRight2(Object obj);
            
            boolean didCollideLeft2(Object obj);

            boolean didCollideTop(Object obj);

            boolean didCollideBottom(Object obj);
}