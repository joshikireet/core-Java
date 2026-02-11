/**
 * 
 * @author {Kireet Joshi}
 *
 */
import java.util.*;
public class Arr {
public static void main(String[] args) {	
int[][] A=new int[3][];
Scanner sc= new Scanner(System.in);
System.out.println("enter the size");
for(int i=0;i<A.length;i++)
{
A[i]=new int[3];

for(int j=0;j<A[i].length;j++)
{
A[i][j]=sc.nextInt();
}
}
for(int i=0;i<A.length;i++)
{
for(int j=0;j<A[i].length;j++)
{
System.out.print(A[i][j] +" ");
}
System.out.println();
}	System.out.println();
	
}
}