/**
 * 
 * @author {Kireet Joshi}
 *
 */
//Thread creation using Runnable interface

class MyRunnable implements Runnable
{
	public void run() 
	{
		for(int i=0;i<10;i++)
			System.out.println("interface thread exceuted..");

	}

}

public class Main 
{
	public static void main(String[] args) {	
		MyRunnable r= new MyRunnable();
		Thread t = new Thread(r);
	     t.start();
		//	r.run();// no new  thread is created  
		for(int i=0;i<10;i++)
			System.out.println("Main thread!!");
	}
}