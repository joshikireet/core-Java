/**
 * 
 * @author {Kireet Joshi}
 *
 */
class Test3 
{
	public void foo()
	{
		System.out.println("im foo of Class");
		
	}
}

public class Test4 extends Test3 implements I3 {
public static void main(String[] args) {
	Test4 ob = new Test4();
	ob.foo(); // class method wins over interface ,no overriding here
}
}
