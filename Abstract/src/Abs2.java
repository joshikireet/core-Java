
abstract class P1
{
	abstract void foo1();
	abstract void foo2();
	void m1()
	{
		System.out.println("abstract class concrete method");
	}
}
class C1 extends P1
{
	void foo1()
	{
System.out.println("hello");
	 }
void foo2()
	{
//System.out.println("hi");
//	 }
}
	public class Abs2 {
public static void main(String[] args) {
	C1 ob= new C1();
	ob.foo1();
	ob.foo2();
	}
}}