package lissajous;

import javax.swing.*;
import java.awt.*;


public class Lissajous extends JFrame
{ 

    public static JFrame window;
    public static int alpha;
    public static int beta;
    public static int gamma;
	public static int delta;
	public static int epsilon;
    public static int omega;
    public static final int WIDTH = 800;
    public Lissajous(){

        pack();
        setSize(800,900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        setTitle("Lissajous Curve by Michal Nowak");
        validate();
    }

    public static void main(String[] args)
    {

        //Graph Panel
        JPanel labelPanel = new LabelPanel();
        JPanel drawPanel = new Curve();
        JPanel controlPanel = new ControlPanel();
       //Frame
        window = new Lissajous();
        window.add(labelPanel, BorderLayout.NORTH);
        window.add(drawPanel, BorderLayout.CENTER);
        window.add(controlPanel, BorderLayout.SOUTH);
        window.pack();
    }
}

class LabelPanel extends JPanel
{
    public LabelPanel(){
        setPreferredSize(new Dimension ( WIDTH , 30 ));
        add(new JLabel("Lissajous Curve:", SwingConstants.CENTER), BorderLayout.NORTH);
        setBackground(Color.WHITE);
        setOpaque(true);
        validate();
    }
}
