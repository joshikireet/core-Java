//What will be the output of the following Java code demonstrating shallow copy with object reference:

class B1{
 int x=10;
 }
 public class Test1{ 
 public static void main(String[] args)
{
B1 a1=new B1();
B1 a2=a1;
a1.x=99;
System.out.print(a2.x);
 }
}