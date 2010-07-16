import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * 
 */

/**
 * @author cferrabo
 *
 */
public class WidgetTest implements ActionListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WidgetTest gui = new WidgetTest();
	    gui.go();
	}


	public void go() {
		JFrame frame = new JFrame () ;
		JPanel panel = new JPanel () ;
		
		panel.setBackground(Color.gray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JTextField Text1 = new JTextField("Texto");
		Text1.setEditable(false);
		Text1.setSize(10, 10);
		
		JTextArea Textarea = new  JTextArea(10,20);
		
		JScrollPane scroller = new JScrollPane (Textarea) ;
		
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		JCheckBox check = new JCheckBox("Goes to 11");
		
		
		
		panel.add(scroller);
		panel.add(Text1);
		panel.add(check);
			
		//frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setContentPane(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		/**Second frame
		 * 
		 * 
		 * 
		 * 
		 */
		
		JFrame frame2 = new JFrame();
		JPanel panel2 = new JPanel();
		JButton Boton1 = new JButton("click!");
		
		panel2.setBackground(Color.white);
		panel2.setLayout(new BorderLayout());
		
		JTextArea Textarea2 = new  JTextArea(10,20);
		
		JScrollPane scroller2 = new JScrollPane (Textarea2) ;
		
		scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel2.add(BorderLayout.CENTER,scroller2);
		panel2.add(BorderLayout.SOUTH,Boton1);
		
		frame2.setContentPane(panel2);
		frame2.setSize(450,450);
		frame2.setVisible(true);
		
		Boton1.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
