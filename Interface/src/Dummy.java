
interface I4
{
	default void foo()
	{
		System.out.println("I4");
		foo1();
		foo2();
	}
	static void foo1()
	{
	System.out.println("common code of default method");	
	}
	private void foo2()
	{
		System.out.println("im private ,my visibility is only within this interface");
	}
}

interface I5
{
	
	default void foo()
	{
		System.out.println("I5");
	}
	
}
interface I6 extends I4,I5 
{
default void foo() // overriding to resolve ambiguity
{
	I4.super.foo();
	I5.super.foo();
}
}
public class Dummy implements I6 {
public static void main(String[] args) {
	I6 im = new Dummy(); // Dynamic dispatch 
	//Dummy dm= new Dummy(); // can also be used 
	im.foo();
}
}
