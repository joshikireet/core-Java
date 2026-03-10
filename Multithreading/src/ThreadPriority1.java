class MyThread4 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread executing");
			try 
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	}
	public class ThreadPriority1 
	{
		public static void main(String[] args) throws InterruptedException
		{
			MyThread4 mt= new MyThread4();
			mt.start();
			mt.join(10000);
			for(int i=0;i<10;i++)
			{
				System.out.println("parent thread(main thread) executing");
			}

		}

	}
