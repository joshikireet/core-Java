class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("name of child thread :"+Thread.currentThread().getName());
	}
}
public class ThreadName {
public static void main(String[] args) 
{
   // Thread.currentThread().setName("harsh");
	System.out.println("name of parent thread :"+Thread.currentThread().getName());
     MyThread1 t1= new MyThread1();
     t1.start();
     

}   
}
