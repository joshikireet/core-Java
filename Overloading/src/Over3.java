class Vararg
{
	
	public void foo(int i)
	{
		System.out.println("Single arg");		
	}
	public void foo(int ...i)
	{
     System.out.println("var arg");	

	}
	
}
public class Over3 {
public static void main(String[] args) {
	Vararg v = new Vararg();
	v.foo(10);
	v.foo(10,29,20);
}
}
