import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author cferrabo
 *
 */
public class Button1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();

	}

	public void go() {
/**		JFrame frame = new JFrame();
		JButton button = new JButton ("cliclc me ");
		
		Font bigFont = new Font ("serif", Font.BOLD, 28);
		
		button.setFont(bigFont);
		frame.getContentPane().add(BorderLayout.NORTH, button);

		frame.setSize(200, 200);
		frame.setVisible(true);**/
		
		JFrame frame = new JFrame();
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center) ;
		
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	

}
