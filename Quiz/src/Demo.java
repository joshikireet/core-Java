public class Demo
{ 
	public static void main(String[] args)
	{ int[]            [] a=new int[2][];
	a[0]=new int[]{1,2};
	a[1]=new int[]{3,4,5};
	System.out.print(a[1][a[0].length]);
	}
}