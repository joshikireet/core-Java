class P
{
P(int i)
{
	System.out.println("hello");
}
}
class Q extends P
{
Q()
{
	super(10);
	System.out.println("hi");
}
}
public class Test {
public static void main(String[] args) {
	Q ob = new Q();
}
}
