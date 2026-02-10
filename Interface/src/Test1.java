
public class Test1 implements I1,I2{ // multilevel inheritance through interfaces

	@Override
	public void foo()// overriding is mandatory to resolve conflicts 
	{
		I1.super.foo();
		I2.super.foo();
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.foo();
	}
	

}
