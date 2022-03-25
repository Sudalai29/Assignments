package scratch;

public class Thread {
	public Thread(String string) {
		// TODO Auto-generated constructor stub
	}

	public Thread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread main=new Thread();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main  thread is running for "+i+"time");
			Thread.sleep(500);
		}
	}

	public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
