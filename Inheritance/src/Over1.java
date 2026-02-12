/**
 * 
 * @author {Kireet Joshi}
 *
 */
class O
{
	public void foo(int c, double x)
	{
		System.out.println(" int- double argumengt");
	}
	public void foo(double x, int c)
	{
		System.out.println(" double -int  argument");
	}
}
public class Over1 {
	public static void main(String[] args) {
		O ob= new O();
		//ob.foo('a');
		ob.foo(10,10.34);
	}
}
