
public class A3 {
	public static void main(String[] args) {
	int[][] x;
	x=new int[2][];
	x[0]= new int[2];
	x[0][0]=10;
	x[0][1]=20;
	
	System.out.println(x[0][1]);
	//x[0]= new int[]{10,20};
	x[1]=new int[]{30,40,50};
System.out.println(x[1][0]);
}
}