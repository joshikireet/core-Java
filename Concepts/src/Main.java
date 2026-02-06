/**
 * 
 * @author {Kireet Joshi}
 * method hiding
 */
class P
{
static public void foo()
{
System.out.println("...in method 1 of P");	
}}
class C extends P
{
   static public void foo()
	{
		System.out.println("in method 1 of C ");
	}}
public class Main {
public static void main(String[] args) {
	P p= new P();
	p.foo(); // method1 of P
	C c= new C();
	c.foo(); // method 1 of C
	P p1= new C();
	p1.foo();  // method 1 of P method is resolved on the basis of references}
}}
