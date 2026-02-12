/**
 * 
 * @author {Kireet Joshi}
 *
 */
class P2
{
	P2(int x)
	{
		   super();
		System.out.println("parent class constuctor");
	 
     }
//P2()
//{
}
class C2 extends P2
{
	C2()
	{
	super(10); // this we have to explicitly invoke
		System.out.println("child class cons...");
	}
}
public class Incons {
public static void main(String[] args)
{
	C2 ob = new C2();
}}