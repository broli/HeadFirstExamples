/**
 * 
 */

/**
 * @author cferrabo
 *
 */
public class RunThreads implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunThreads runner = new RunThreads();
		Thread Alpha = new Thread(runner);
		Thread Beta = new Thread(runner);
		Alpha.setName("Alpha t");
		Beta.setName("Beta T");
		Alpha.start();
		Beta.start();

	}

	@Override
	public synchronized void run() {
		for (int i=0; i< 100;i++){
		System.out.println("Running: \t" + Thread.currentThread().getName());
		}
		
	}

}
