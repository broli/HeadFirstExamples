import java.io.*;
import java.net.*;



/**
 * @author cferrabo
 *
 */
public class DailyAdviceServer {

	String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you loo",
	        "One word: inappropriate", "Just for today, be honest.  Tell your boss what you *really* thin",
	        "You might want to rethink that haircut"};

	

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while (true)
            {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args)
    {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }


}
