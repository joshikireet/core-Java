
public class Ex {
public static void main(String[] args) 
{
	int a,b,c;
	a=10;
	b=0;
	try
	{
	c=a/b;
	System.out.println("Division is"+c);
	}
    catch(ArithmeticException e)
	{
System.out.println("divide by 0");
}
	System.out.println("after exception");
}}