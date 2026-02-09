
class A011
{ int x;
A011(int x)
{this.x=x;}
A011(A011 re)
{this.x=re.x;}
}
public class Test12
{ public static void main(String[] args)
{ 
	A011 a11=new A011(7);
	A011 a12=new A011(a11);
	a11.x=15;
	System.out.print(a12.x);
}
}