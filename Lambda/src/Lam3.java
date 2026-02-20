@FunctionalInterface
interface I1
{
    static void foo() {System.out.println("im static");}
	int sq(int a);
}
@FunctionalInterface
interface I2 extends I1
{
	//void foo1(); // not a functional interface now as 2 abstract methods
	int sq(int x); // java sees a single contract redeclared and a functional interface
	default void bar()
	{
		System.out.println("default method");
	}
}
public class Lam3 {
public static void main(String[] args) {
	I1 i=(a)-> a*a;
	I1.foo();
	System.out.println(i.sq(5));
}
}
