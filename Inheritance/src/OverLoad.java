
class X
{
	String s="hello";
	
}
class Y extends X
{
	String s="graph";
	
}
public class OverLoad {
public static void main(String[] args) {
	X x= new X();
	System.out.println(x.s);
	Y y= new Y();
	System.out.println(y.s);
	X x1= new Y();
	System.out.println(x1.s);
}
}
