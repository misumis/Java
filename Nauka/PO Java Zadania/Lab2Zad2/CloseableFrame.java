
import javax.swing.*;
import java.awt.*;
public class CloseableFrame extends JFrame{
    public CloseableFrame() throws HeadlessException {
		setSize(640, 480); 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public static void main(String[] args) {

    	CloseableFrame ramka = new CloseableFrame();
    	ramka.setVisible(true);
    }
}