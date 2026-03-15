
/**
 * 
 * @author {Kireet Joshi}
 *concept of synchronized method multiple threads multiple resources only static synchronized can solve the purpose
 */
class College1
{
	public synchronized static  void display(String name) 
	{
		for(int i=1;i<=5;i++)
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
	class ThreadSync1 extends Thread
	{
		College1 c;
		String name;
		ThreadSync1(College1 c,String name)
		{
			this.c=c;
			this.name=name;
		}
		public void run()
		{

			c.display(name);	

		}
	}
	public class SyncMethod1 {
		public static void main(String[] args) {

			College1 c1= new College1();
			College1 c2= new College1();
			ThreadSync1 t1= new ThreadSync1(c1,"Kireet");
			ThreadSync1 t2= new ThreadSync1(c2,"Vikas");
			t1.start();
			t2.start();
		}
	}
