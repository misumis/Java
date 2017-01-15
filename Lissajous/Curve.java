package lissajous;

import javax.swing.*;
import java.awt.*;


public class Curve extends JPanel 
{   
	
    public Curve()
    {
    	Lissajous.alpha=3;
    	Lissajous.beta=5;
    	Lissajous.gamma=5;
    	Lissajous.delta=3;
    	Lissajous.epsilon=5;
        Lissajous.omega = 5;
        setPreferredSize(new Dimension ( Lissajous.WIDTH , 500 ));
        setBackground(Color.WHITE);
    }
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        //super.paintComponent(axisy);
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D axx = (Graphics2D) g;
        Graphics2D axy = (Graphics2D) g;
        int x, y;
        axx.drawLine(0,250,Lissajous.WIDTH,250);
        axy.drawLine(400, 0 , 400 , 500);
        for (int i = 0; i <= 200000; i++) 
        {
            y = (int ) (Math.sin(i * Lissajous.alpha + Lissajous.beta*0.036)* Lissajous.gamma*0.4 * 50 + 250);
            x = (int ) (Math.sin(i* Lissajous.delta + Lissajous.epsilon*0.036) * Lissajous.omega*0.6  * 50 + 400);
            g2d.drawLine(x, y, x , y);
        }
    }    
}