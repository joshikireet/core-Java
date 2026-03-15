/**
 * 
 * @author {Kireet Joshi}
 *concept of synchronized method
 */
class College
{
	public synchronized void display(String faculty) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i +" class taken by :");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
			System.out.println(faculty);

		}

	}
}
	class ThreadSync extends Thread
	{
		College c;
		String name;
		ThreadSync(College c,String name)
		{
			this.c=c;
			this.name=name;
		}
		public void run()
		{

			c.display(name);	

		}
	}
	public class SyncMethod {
		public static void main(String[] args) {

			College c= new College();
			ThreadSync t1= new ThreadSync(c,"Kireet");
			ThreadSync t2= new ThreadSync(c,"Vikas");
			t1.start();
			t2.start();
		}
	}
