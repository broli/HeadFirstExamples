import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 */

/**
 * @author cferrabo
 *
 */
public class widgets implements ActionListener,ListSelectionListener {

	JTextArea TAsalida;
	String[] ListNombres = { "priemro", "segundo", "tercero", "cuarto","quinto0","asd","asddd","otromas","ymas mas ams",
							"septimo","octavo","noveno","decimo","quedamuylargo","noseveee"};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		widgets mainGui = new widgets();
		mainGui.goMain(args);
	}
	
	public void goMain (String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox check = new JCheckBox("check box");
		frame.getContentPane().add(check,BorderLayout.NORTH);
		check.addActionListener(this);
		
		TAsalida = new JTextArea();
		JScrollPane scroller = new JScrollPane(TAsalida);
		frame.getContentPane().add(scroller,BorderLayout.CENTER);
		
		JList listado = new JList(ListNombres);
		JScrollPane scroller2 = new JScrollPane(listado);
		frame.getContentPane().add(scroller2,BorderLayout.WEST);
		listado.addListSelectionListener(this);
		
		frame.setSize(300,300);
        frame.setVisible(true);	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		TAsalida.append("evento\n" );
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		TAsalida.append("evento de lista\n" );
		
	}

}
