
class X1
{
	public  static void foo ()
	{
		System.out.println(" of parent class");
	}
	
}
class Y1 extends X1
{
	public  static void foo () // method hiding
	{
		System.out.println(" of child class");
	}
}
public class Dynamic {
public static void main(String[] args) {
	X1 ob = new Y1();
	ob.foo();
}
}
