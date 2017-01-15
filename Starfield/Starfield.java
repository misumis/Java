package starfield;

import javax.swing.*;
import java.awt.*;
//import java.util.*;

public class Starfield extends JFrame
{
	
    public static final int HEIGHT = 720;
    public static final int WIDTH = 1280;
    public Starfield()
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            
    	
   			public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

                JFrame frame = new JFrame("Starfield");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setLayout(new BorderLayout());
                frame.add(new Star());
                frame.setPreferredSize( new Dimension (WIDTH,HEIGHT));
                frame.setLocation(100,100);
                frame.setVisible(true);
                frame.pack();
            }
        });
    }
 
    public static void main(String[] args)
    {
    new Starfield();
    }
}

