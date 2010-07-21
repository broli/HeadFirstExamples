import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author cferrabo
 *
 */
public class Maingui {
	
	JTextArea Question;
	JTextArea Answer;
	JFrame MainFrame;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Maingui Maingui1 = new Maingui();
		Maingui1.go();
	}
	
	public void go () {
		MainFrame = new JFrame("Main");
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel myPanel = new JPanel();
		Question = new JTextArea(6,20);
		JScrollPane Qscroller = new JScrollPane(Question);
		Answer = new JTextArea(6,20);
		JScrollPane Ascroller = new JScrollPane(Answer);
		JButton Botton1 = new JButton("boton1");
		JLabel Label1 = new JLabel("laber 1");
		JLabel Label2 = new JLabel("Label 2");
		
		MainFrame.setResizable(false);
		MainFrame.addMouseMotionListener(new MouseListener());
		
		Botton1.addActionListener(new BotonListener());
		Botton1.addFocusListener(new BotonListener());
		
		Answer.setEditable(false);
		Question.setEditable(false);
		
		
		myPanel.add(Label1);
		myPanel.add(Qscroller);
		myPanel.add(Label2);
		myPanel.add(Ascroller);
		myPanel.add(Botton1);
		
		MainFrame.getContentPane().add(myPanel,BorderLayout.CENTER);
		MainFrame.setSize(300,300);
		MainFrame.setVisible(true);	
	}

	public class BotonListener implements ActionListener, FocusListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser filesave = new JFileChooser();
			filesave.showOpenDialog(MainFrame);
			Question.append(filesave.getSelectedFile().getName()+"\n");
			
		}

		@Override
		public void focusGained(FocusEvent e) {
			Question.append("Focus Gained\n");
			Answer.setVisible(true);
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			Question.append("Focus lost\n");
			Answer.setVisible(false);
			
		}
		
	}
	
	public class MouseListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Answer.setText("X\t" + e.getX()+"\n");
			Answer.append("Y\t" + e.getY()+"\n");
			
			
		}
		
	}
	
}
