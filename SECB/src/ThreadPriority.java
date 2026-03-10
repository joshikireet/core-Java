class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread executing..");
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
		public class ThreadPriority {
			public static void main(String[] args)throws InterruptedException {
				//System.out.println("parent thread default prioity "+Thread.currentThread().getPriority());
				//Thread.currentThread().setPriority(6);
				//System.out.println("parent thread updated prioity "+Thread.currentThread().getPriority());
				MyThread2 mt= new MyThread2();
				mt.start();
				mt.join(10000); // interrupt
				for(int i=0;i<10;i++)
				{
					System.out.println("Main thread executing..");
				}
				//mt.setPriority(100);
				//System.out.println("child thread updated prioity "+ mt.getPriority());
			}
		}
