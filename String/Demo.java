
 class D {
	D()
	{
	this(10);
		System.out.println("im in A");
	}
	D(int x)
	{
		System.out.println("im an argument constructor");
	}}
public class Demo
{
	public static void main(String[] args) {
	D ob= new D(100);
	}
	}

