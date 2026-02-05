class P1
{
	void foo1()
	{
		
		System.out.println("foo1");
	}
	
}
class C1 extends P1
{
	void foo2()
	{
		
		System.out.println("foo2");
	}
	
}
public class A
{
	public static void main(String[] args) {
		P1 p= new C1();
		
		p.foo1();
	//	p.foo2();
	//C1 c= new P1();
//	c.foo1();
//	c.foo2();
	}
}