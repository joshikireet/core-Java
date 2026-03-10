
// using runnable interface

class MyRunnable implements Runnable
{
	public void run() 
	{
		for(int i=0;i<10;i++)
System.out.println("interface thread!!");		
		
	}
	
}

public class Main {
public static void main(String[] args) {
	MyRunnable mr = new MyRunnable();
	Thread t = new Thread(mr);
mr.run();
for(int i=0;i<10;i++)
System.out.println("Main thread...");		
		
}
}
