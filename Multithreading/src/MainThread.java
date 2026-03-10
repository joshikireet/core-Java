// first force main thread to execute then child thtraed executes 

class Mythread5 extends Thread
{
	static Thread mt;
	
	public void run()
	{
		try
		{
			mt.join(10000);
		}
		catch(InterruptedException e)
		{}
     		for(int i=0;i<10;i++)
			System.out.println("child thread");
	
	
}}
public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		Mythread5.mt=Thread.currentThread();
		Mythread5 t=new Mythread5();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		Thread.sleep(2000);
		
	}
	}
}
