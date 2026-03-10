/**
 * 
 * @author {Kireet Joshi}
 * THREAD CREATION USING THREAD CLASS
 */
class MyThread0 extends Thread
{
	public void run() 
	{
		for(int i=0;i<10;i++)
			System.out.println("im a child thread..");
}
}
public class ThreadMain 
{
	public static void main(String[] args) {
MyThread0 mt = new MyThread0(); // new born thread
mt.start(); // thread starts executing
for(int i=0;i<10;i++)
	System.out.println("Main thread!!");
	}
}

