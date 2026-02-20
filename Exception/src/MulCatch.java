
public class MulCatch {
public static void main(String[] args) {
	try
	{
		System.out.println(10/1);
		int[] a = new int[7];
		a[20]=90;
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
}
}
