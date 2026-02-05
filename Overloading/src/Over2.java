class M
{
public void foo(Object o)
{
	System.out.println("object");
}
public void foo(String s)
{
	System.out.println("String");
}	
}
public class Over2 {
public static void main(String[] args) {
	M ob = new M();
     ob.foo(new M());
     ob.foo("hello");
     ob.foo(null);
}
}
