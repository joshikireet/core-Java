/**
 * Q2.What will be the output of the following Java code using abstract class reference:
 * @author {Kireet Joshi}
 *
 */
abstract class A
{ int x=10;
 abstract int get(); }
 class B extends A
{
int get()
{return x;} }
public class Test
{ public static void main(String[] args)
{ A a=new B();
a.x=20;
System.out.print(a.get());
 } }