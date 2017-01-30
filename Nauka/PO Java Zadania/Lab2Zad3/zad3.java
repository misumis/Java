import javax.swing.*;
import java.awt.*;

public class zad3 extends JFrame{
	 int numClicks;
	//Constructors
	public zad3(){
		super("Content Pane");
		TextField text = new TextField(20);
		setSize(640,480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		JButton button = new JButton("Close Me!");
		JButton button2 = new JButton("Hello");
		JButton button3 = new JButton("Click Counter");
		JButton button4 = new JButton("Text Appeared");
		JButton button5 = new JButton("Hide and Seek!");

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
	}

	public zad3(GraphicsConfiguration gc){
		
	}
	public zad3(String title){

	}
	
	public zad3(String title, GraphicsConfiguration gc){

	}

	//Methods
	
	
	public static void main(String[] args) {
		zad3 frame = new zad3();
		frame.setVisible(true);
		
	}
}