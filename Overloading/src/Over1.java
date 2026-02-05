

class P
{
void m1(int x)
{
	System.out.println("integer");
}
void m1(float x)
{
	System.out.println("float");
}

void m1(double x)
{
	System.out.println("double");
}
}
class C extends P
{
	void m1(double x)
	{
		System.out.println("double");
	}
}
public class Over1 {
	public static void main(String[] args) {
		
P ob= new P();
 C ob1= new C();
//ob.m1('a');
ob.m1(10.7f);
//ob1.m1(80.87);
	}
}