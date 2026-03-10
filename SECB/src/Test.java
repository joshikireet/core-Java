class MyThread extends Thread
{
	public void start()
	{
		super.start(); // thread create
		System.out.println("hello start...");
	}
	public void run() 
	{
		for(int i=0;i<10;i++)
			System.out.println("im a child thread..");
}
}
public class Test {
	public static void main(String[] args)throws InterruptedException {
MyThread mt = new MyThread(); // new born thread
mt.start(); // thread starts executing
//mt.join();
for(int i=0;i<10;i++)
	System.out.println("Main thread!!");
	}
}
