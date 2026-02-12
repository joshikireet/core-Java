/**
 * 
 * @author {Kireet Joshi}
 * use of super  and this keyword 
 */
class P1
{
	String s=" graphic";

}

class C extends P1
{
	String s=" hello"; // an explicit variable
	public void show()
	{
		System.out.println(super.s); // graphic
	}

}

public class InSuper {
	public static void main(String[] args) {
		C ob = new C();
		ob.show();
	}
}
