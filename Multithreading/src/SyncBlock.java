/**
 * 
 * @author {Kireet Joshi}
 *concept of synchronized block using multiple resources multiple threads using class level thread
 */

class College2
{
	public  void display(String name) 
	{
		synchronized(College.class)
		{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" class taken by :");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
			System.out.println(name);
		}
		}

	}
}
	class ThreadSync2 extends Thread
	{
		College2 c;
		String name;
		ThreadSync2(College2 c,String name)
		{
			this.c=c;
			this.name=name;
		}
		public void run()
		{

			c.display(name);	

		}
	}
	public class SyncBlock {
		public static void main(String[] args)
		{

			College2 c1= new College2();
			College2 c2= new College2();
			ThreadSync2 t1= new ThreadSync2(c1,"kireet");
			ThreadSync2 t2= new ThreadSync2(c2,"Vikas");
			t1.start();
			t2.start();
		}
	}
