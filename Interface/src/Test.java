/**
 * 
 * @author {Kireet Joshi}
 *
 */
public class Test implements I 
{
public void foo()
{
	System.out.println("hello");// class implements foo
	
}
public static void main(String[] args) {
	I ob= new Test(); // interface reference,Dynamic Binding
	ob.foo();
	System.out.println(x); // x is static and final
}
}
