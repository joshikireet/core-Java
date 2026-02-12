/**
 * 
 * @author {Kireet Joshi}
 *
 */
class D
{
	D()
	{
		this(10); // constructor chaining
		System.out.println("no arg cons");
	}
	
	D(int x)
	{
		System.out.println("arg const");
	}
}

public class InThis {
public static void main(String[] args) {
	D ob = new D();
}
}
