/**
 * 
 * @author {Kireet Joshi}
 *
 */
interface I7
{
	
	static void foo1()
	{
		foo();
	}
	private static void foo()
	{
	System.out.println("private static method");
	}
}
public class Dummy1 implements I7 {
public static void main(String[] args) {
	I7.foo1();// invoked only by interface_name.method_name
}
}
