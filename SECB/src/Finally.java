
public class Finally {
public static void main(String[] args) {
	try
	{
		System.out.println("in try");
		System.out.println(10/0);
	}
	catch(NullPointerException e)
	{
		System.out.println("in catch...");
	}
	finally
	{
		System.out.println("i will execute always!!");
	}
}
}
