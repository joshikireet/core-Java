/**
 * method hiding
 * @author {Kireet Joshi}
 *
 */
class P
{	void foo(int x)
	{
		System.out.println("integer argument");
	}
	void foo( int ...x) // 1.5 v
	{
		System.out.println("variable arguments");
}
}
public class Main 
{
	public static void main(String[] args) {
		P p = new P(); 
		p.foo();
		//p.foo(20,400);
	}}
