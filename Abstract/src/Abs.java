abstract class P
{
	abstract void  foo();
	void m1()
	{
		System.out.println("hello");
	}
}

class Q extends P
{
	void foo()
	{
		System.out.println("hi");	
	}
}
public class Abs {
public static void main(String[] args) {
	P ob1 = new Q();
	Q ob= new Q();
	ob1.foo();
}
}
