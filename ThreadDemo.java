package scratch;

public class ThreadDemo implements Runnable{
	
private String threadName;
	Thread t;
	 ThreadDemo(String threadName){
		 this.threadName=threadName;
	}

	@Override
	public void run() {
		System.out.println(threadName+" is running");
		Thread.sleep(500);
		System.out.println(threadName+" is sleeping");
	}

	public void go() {
		t =new Thread(this.threadName);
		t.start();
}
}
