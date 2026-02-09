class A0
{
static void show()
{
System.out.print("CHOTA BHEEM...");
}
}
class B0 extends A0
{ static void show()
{System.out.print("NAGRAAJ");
}
}
public class T1 {
	public static void main(String[] args)
	{ A0 a=new B0();
	a.show();
	 }
	}

