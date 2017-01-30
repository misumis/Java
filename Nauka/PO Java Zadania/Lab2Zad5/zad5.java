import javax.swing.*;
import java.awt.*;

public class zad5 extends JFrame{
	 int numClicks;
	//Constructors
	public zad5(){
		super("Content Pane");
		
		setSize(640,480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		JButton button = new JButton("Close Me!");
		JButton button2 = new JButton("Hello");
		JButton button3 = new JButton("Click Counter");
		JButton button4 = new JButton("Text Appeared");
		JButton button5 = new JButton("Hide and Seek!");
		TextField text = new TextField(20);

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(button);
		getContentPane().add(button2);
		getContentPane().add(button3);
		getContentPane().add(button4);
		getContentPane().add(button5);
		getContentPane().add(text);

		button.addActionListener( e -> { dispose(); });
		button2.addActionListener( e ->  System.out.println("Hello"));
		button3.addActionListener( e -> { numClicks++; System.out.println(numClicks); });
		button4.addActionListener( e -> text.setText("ButtonClicked") );
		button5.addActionListener( e -> { try {hide(); Thread.sleep(1000); show();} catch(Exception eve){} });
	
		JMenuBar menu = new JMenu("menu") ;
		getContentPane().add(menu);

		}


	public zad5(GraphicsConfiguration gc){
		
	}
	public zad5(String title){

	}
	
	public zad5(String title, GraphicsConfiguration gc){

	}

	//Methods
	
	
	public static void main(String[] args) {
		zad5 frame = new zad5();
		frame.setVisible(true);
		
	}
}