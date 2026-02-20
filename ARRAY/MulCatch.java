
public class MulCatch {
public static void main(String[] args) {
	try
	{
		System.out.println(10/10);
		int[] a= new int[5];
		a[10]=80;
	}
	
//	catch(ArithmeticException e)
//	{
//		System.out.println(e);
//	}
//	catch(ArrayIndexOutOfBoundsException e)
//	{
//		System.out.println("out of bounds");
//	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
