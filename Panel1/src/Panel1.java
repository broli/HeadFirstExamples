import java.awt.*;
import javax.swing.*;


/**
 * Head First java 2 edition
 * Pagina 408
 */

/**
 * @author cferrabo
 *
 */
public class Panel1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
	    gui.go();
	}

	public void go() {
		JFrame frame = new JFrame () ;
		JPanel panel = new JPanel () ;
		JButton button1 = new JButton ("shock me0");
		JButton button2 = new JButton ("shock me2");
		JButton button3 = new JButton ("shock me3");
		JButton button4 = new JButton ("shock me4");
		JButton button5 = new JButton ("shock me5");
		JButton button6 = new JButton ("shock me6");
		JButton button7 = new JButton ("shock me7");
		
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
		
	}

}
