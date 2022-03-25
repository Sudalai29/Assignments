package scratch;

public class TDemoTest implements Runnable{
	
private String threadName;
	Thread t;
	 TDemoTest(String threadName){
		 this.threadName=threadName;
	}

	@Override
	public void run() {
		System.out.println(threadName+" is running");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(threadName+" is sleeping");
	}

	public void go() {
		t =new Thread(thisthreadName);
		t.start();
}
}