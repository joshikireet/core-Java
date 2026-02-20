@FunctionalInterface
interface in
{
	void foo();
}
 
 public class Lam{
 public static void main(String[] args) {
	in l= ()->System.out.println("foo is implemented via lambda");
	l.foo();
	
}
}