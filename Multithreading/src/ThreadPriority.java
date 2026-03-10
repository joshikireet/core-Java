class MyThread3 extends Thread
{
	public void run()
	{
	// priority of all child threads is same as parent main thread
		System.out.println("priority is"+Thread.currentThread().getPriority());
	
	}
	
}

public class ThreadPriority 
{
public static void main(String[] args) {
	//System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(3);
	System.out.println(Thread.currentThread().getPriority());
MyThread3 mt= new MyThread3();
mt.start();
}
}
