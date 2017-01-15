package lissajous;


import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel
{
	public JLabel alphaValue;
	public JSlider alphaSlider;
    public static final int ALPHA_MAX = 10;
    public static final int ALPHA_MIN = 1;
    public static final int ALPHA_INIT = 3;
    public static final int BETA_MAX = 180;
    public static final int BETA_MIN = 1;
    public static final int BETA_INIT = 5;
    public static final int GAMMA_MAX = 12;
    public static final int GAMMA_MIN = 1;
    public static final int GAMMA_INIT = 5;
    public static final int DELTA_MAX = 10;
    public static final int DELTA_MIN = 1;
    public static final int DELTA_INIT = 3;
    public static final int EPSILON_MAX = 180;
    public static final int EPSILON_MIN = 1;
    public static final int EPSILON_INIT = 5;
    public static final int OMEGA_MAX = 10;
    public static final int OMEGA_MIN = 1;
    public static final int OMEGA_INIT = 5;
    public ControlPanel(){

	setPreferredSize(new Dimension ( Lissajous.WIDTH , 250));
	
	//Sliders
	JSlider alphaSlider = new JSlider(JSlider.HORIZONTAL, ALPHA_MIN, ALPHA_MAX, ALPHA_INIT);
	JSlider betaSlider = new JSlider(JSlider.HORIZONTAL, BETA_MIN, BETA_MAX, BETA_INIT);
	JSlider gammaSlider = new JSlider(JSlider.HORIZONTAL, GAMMA_MIN, GAMMA_MAX, GAMMA_INIT);
	JSlider deltaSlider = new JSlider(JSlider.HORIZONTAL, DELTA_MIN, DELTA_MAX, DELTA_INIT);
    JSlider epsilonSlider = new JSlider(JSlider.HORIZONTAL, EPSILON_MIN, EPSILON_MAX, EPSILON_INIT);
	JSlider omegaSlider = new JSlider(JSlider.HORIZONTAL, OMEGA_MIN, OMEGA_MAX, OMEGA_INIT);


	// Variable Labels
	JLabel alphaSliderLabel = new JLabel("Frequency 1", JLabel.CENTER);
    JLabel betaSliderLabel = new JLabel("Angle 1", JLabel.CENTER);
    JLabel gammaSliderLabel = new JLabel("Amplitude 1", JLabel.CENTER);
	JLabel deltaSliderLabel = new JLabel("Frequency 2", JLabel.CENTER);
    JLabel epsilonSliderLabel = new JLabel("Angle 2", JLabel.CENTER);
    JLabel omegaSliderLabel = new JLabel("Amplitude 2", JLabel.CENTER);

    // Value Labels
	JLabel alphaValue = new JLabel( Integer.toString(alphaSlider.getValue()), JLabel.CENTER );
	JLabel betaValue = new JLabel( Integer.toString(betaSlider.getValue()), JLabel.CENTER );
	JLabel gammaValue = new JLabel( Integer.toString(gammaSlider.getValue()), JLabel.CENTER );
	JLabel deltaValue = new JLabel( Integer.toString(deltaSlider.getValue()), JLabel.CENTER );
	JLabel epsilonValue = new JLabel( Integer.toString(epsilonSlider.getValue()), JLabel.CENTER );
	JLabel omegaValue = new JLabel( Integer.toString(omegaSlider.getValue()), JLabel.CENTER );


	//Layout
	JPanel layout = new JPanel();
    layout.setLayout(new GridLayout(6, 3));


//LISTENERS
   	alphaSlider.addChangeListener( e -> { 
	    Lissajous.alpha = alphaSlider.getValue();
	    Lissajous.window.revalidate();
	    Lissajous.window.repaint();
	    alphaValue.setText(Integer.toString(alphaSlider.getValue()));
   	});
   
   betaSlider.addChangeListener( e -> { 
	    Lissajous.beta = betaSlider.getValue();
	    Lissajous.window.revalidate();
	    Lissajous.window.repaint();
	    betaValue.setText(Integer.toString(betaSlider.getValue()));
   });
   
   gammaSlider.addChangeListener( e ->  { 
	    Lissajous.gamma = gammaSlider.getValue();
	    Lissajous.window.revalidate();
	    Lissajous.window.repaint();
	    gammaValue.setText(Integer.toString(gammaSlider.getValue()));
   });
   
   deltaSlider.addChangeListener( e -> { 
	    Lissajous.delta = deltaSlider.getValue();
	    Lissajous.window.revalidate();
	    Lissajous.window.repaint();
	    deltaValue.setText(Integer.toString(deltaSlider.getValue()));
   });

   epsilonSlider.addChangeListener( e -> { 
	    Lissajous.epsilon = epsilonSlider.getValue();
	    Lissajous.window.revalidate();
	    Lissajous.window.repaint();
	    epsilonValue.setText(Integer.toString(epsilonSlider.getValue()));
   });
 
   omegaSlider.addChangeListener( e -> { 
	    Lissajous.omega= omegaSlider.getValue();
	    Lissajous.window.revalidate();
	    Lissajous.window.repaint();
	    omegaValue.setText(Integer.toString(omegaSlider.getValue()));
   });



    
    JLabel equ = new JLabel(" x = sin ( Freq * t + Angle ) * Amplitude ", JLabel.CENTER);
   
     // 1 row
    layout.add(alphaSliderLabel);
    layout.add(betaSliderLabel);
    layout.add(gammaSliderLabel);
	//  2 row
    layout.add(alphaSlider);
    layout.add(betaSlider);
    layout.add(gammaSlider);

    layout.add(alphaValue);
    layout.add(betaValue);
    layout.add(gammaValue);
       
   	layout.add(deltaSliderLabel);
   	layout.add(epsilonSliderLabel);
   	layout.add(omegaSliderLabel);

   	
   	layout.add(deltaSlider );
   	layout.add(epsilonSlider);
   	layout.add(omegaSlider);

	layout.add(deltaValue);
    layout.add(epsilonValue);
    layout.add(omegaValue);
    add(layout);
   }   
}