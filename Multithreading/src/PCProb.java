// problem without interthread communication
class Shop1
{
	int item;
	public synchronized void produce(int x)
	{
		item=x;
		System.out.println(item+ " item has been produced");		

	}
	public synchronized void consume()
	{
		System.out.println(item+ " item has been consumed");		

	}

}
class Producer1 extends Thread
{
	Shop1 s;
	Producer1(Shop1 s)
	{
		this.s=s;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			s.produce(i);
		}
	}}

	class Consumer1 extends Thread
	{
		Shop1 s;
		Consumer1(Shop1 s)
		{
			this.s=s;
		}	
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				s.consume();
			}
		}
	}
	public class PCProb {
		public static void main(String[] args) {

			Shop1 s=new Shop1();
			Producer1 p= new Producer1(s);
			Consumer1 c= new Consumer1(s);
			p.start();
			c.start();
		}
	}


