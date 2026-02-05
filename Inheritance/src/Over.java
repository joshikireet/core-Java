class P
{
	Number m()
	{
	System.out.println("hello");
	return null;
}
}
class Q extends P
{
	Float m()
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
