package scratch;

public class ThreadExtension extends Thread {
	ThreadExtension(){
	super("Child Thread");
	start();
	}
	
	private void start() {
		// TODO Auto-generated method stub
		
	}

	public void run() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread is running for "+i+"time");
			Thread.sleep(300);
		}
	}
	
}
