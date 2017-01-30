package starfield;

import javax.swing.*;
import java.awt.*;
//import java.util.*;


public class Star extends JPanel
{

	int second = 0;
    Star[] stars = new Star[1000];
	int x;
	int y;
	int z;
    public Star()
    {
	    setBackground(Color.BLACK);
		x = (int) Math.round(Math.random() * Starfield.WIDTH);
		y = (int) Math.round(Math.random() * Starfield.HEIGHT);
		z = (int) Math.round(Math.random() * Starfield.WIDTH);
		//animate();
    }

    @Override
    public void paintComponent( Graphics g ) 
    {
        super.paintComponent(g);
        g.setColor( Color.WHITE );
        for (int i=0 ; i < stars.length; i++) 
        {
            stars[i] = new Star();
            g.drawLine(  stars[i].x , stars[i].y , stars[i].x , stars[i].y );
        } 
    }
    public void animate()
    {
    	for(int i=0; i < 200; i++)
    	{
    		stars[i].x++;
    		stars[i].y++;
    		repaint();
    		if (i==199)
    		{
    			i=1;
    		}
    	}
    }
}