import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * 
 */

/**
 * @author carlos
 *
 */
public class FileViewer {
	
	JFrame MainFrame;
	JTextArea Texto;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileViewer maingui = new FileViewer();
		maingui.go(args);

	}

	private void go(String[] args) {
		MainFrame = new JFrame("Main");
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Panel = new JPanel();
		
		Texto = new JTextArea();
		Texto.setEditable(false);
		Texto.setMargin(new Insets(5,50,50,20));
		JScrollPane TAscroller = new JScrollPane(Texto);
		
		JButton BAbrir = new JButton("Abrir");
		BAbrir.addActionListener(new BotonListener());
		Panel.add(BAbrir);
				
		
		MainFrame.getContentPane().add(TAscroller,BorderLayout.CENTER);
		MainFrame.getContentPane().add(Panel,BorderLayout.SOUTH);
		
		MainFrame.setSize(400,400);
		MainFrame.setVisible(true);
		
		
		
	}

	public class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser filechooser = new JFileChooser();
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "lst","conf");
			    filechooser.setFileFilter(filter);
			    int returnVal = filechooser.showOpenDialog(MainFrame);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	
			    	//Texto.setText(""+filechooser.getSelectedFile().getAbsolutePath());
			    	try {
			    		File textfile = new File(filechooser.getSelectedFile().getAbsolutePath());
			    		FileReader filereader = new FileReader(textfile);
			    		BufferedReader reader = new BufferedReader(filereader);
			    		
			    		String line;
						while ((line = reader.readLine()) != null) {
			    			Texto.append(line+"\n");
			    		}
						
						reader.close();
			    		
			    		
			    	}catch (Exception ex) {
			    		ex.printStackTrace();
			    	}
			    	
			    }

			
		}
	}
	
}
