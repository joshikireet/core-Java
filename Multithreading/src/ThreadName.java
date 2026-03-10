/**
 * 
 * @author {Kireet Joshi}
 * // to print name of main thread and child thread( that is executed by main thread)
 *
 */

class MyThread1 extends Thread
{
	
}


public class ThreadName 
{
public static void main(String[] args) 
{
//System.out.println(Thread.currentThread().getName());
Thread.currentThread().setName("kireet");// explicit name of thread
System.out.println(Thread.currentThread().getName());
MyThread1 t = new MyThread1();
System.out.println(t.getName());
t.setName("child");
System.out.println(t.getName());// explicit name
//System.out.println(10/0);

}

}
