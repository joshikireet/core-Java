
// creation of a thread using Thread Class

class Thread10 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Child thread Executing..");

	}

}
public class ThreadMain1 {
	public static void main(String[] args)throws InterruptedException

	{
		Thread10 ob= new Thread10();
		ob.start();
		ob.join();
		for(int i=0;i<10;i++)
			System.out.println("Main thread Executing..");

	}
}
