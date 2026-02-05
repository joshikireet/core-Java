class P
{
	Object m()
	{
	System.out.println("hello");
	return null;
}
}
class Q extends P
{
	String m()
	{
	System.out.println("hi");
	return null;
}
}
public class Over {
public static void main(String[] args) {
	P op=new Q();
	op.m();
}
}
