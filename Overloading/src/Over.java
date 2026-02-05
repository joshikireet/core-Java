class A
{
	void m1(int x,float y)
	{
		System.out.println("int - float");
	}
	void m1(float x,int y)
	{
		System.out.println(" float- int ");
	}
}
public class Over {
public static void main(String[] args) {
	A ob = new A();
	ob.m1(10, 20.60f);
	ob.m1(30.50f, 40);
}
}
