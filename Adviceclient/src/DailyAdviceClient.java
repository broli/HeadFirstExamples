import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DailyAdviceClient
{
    public void go() {
    	JFrame MainW = new JFrame();
    	MainW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JTextArea Resultado = new JTextArea();
    	JScrollPane Scroller = new JScrollPane(Resultado);
    	
    	MainW.getContentPane().add(Scroller);
    	MainW.setSize(500, 500);
    	
    	MainW.setVisible(true);
    	
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream()); 
            BufferedReader reader = new BufferedReader(streamReader);
            
            String advice = reader.readLine();
            //System.out.println("Today you should: " + advice);
            Resultado.setText(advice);
            reader.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
