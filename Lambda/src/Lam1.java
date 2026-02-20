interface I
{
	void add(double a,double b);
	
    default void foo1()
    {
    	System.out.println("interface default method");
    }
}
public class Lam1 {
public static void main(String[] args) {
	I ob=(a,b)->System.out.println(a+b);
	ob.add(10.4,78.9);
	ob.foo1();
}
}
