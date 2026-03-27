// concept of Thread Synchronization using synchronized method
class College
{
	public void display(String name)
	{
		// 10 lakhs loc
		synchronized(College.class)
		{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" class conducted by :");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println(name);
	}}}
}
	class MyThread7 extends Thread
	{
		College c;
		String name;
		MyThread7(College c,String name)

		{
			this.c=c;
			this.name=name;

		}
		public void run()
		{
			c.display(name);

		}
	}

	public class ThreadSync {
		public static void main(String[] args) 

		{
			College c1= new College();
			College c2= new College();
		MyThread7 mt1 = new MyThread7(c1,"Kireet");
		MyThread7 mt2 = new MyThread7(c2,"Ashish");
		mt1.start();
		mt2.start();
		
		}
	}


