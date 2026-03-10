// to print name of main thread and child thread( that is executed by main thread)


class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("this line executed by(Thread name): "+Thread.currentThread().getName());
}
}
public class Threadname1 {
	public static void main(String[] args) 
	{
	System.out.println("this line executed by(Thread name) :"+Thread.currentThread().getName());
	MyThread2 t = new MyThread2();
    t.start();
	}

	}

