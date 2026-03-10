import java.util.*;
public class Custom {
	public static void main(String[] args) throws CoronaVirusException {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age  ");
		int age= sc.nextInt();
		try
		{
			if(age>12)
				throw new CoronaVirusException("You are not safe..Take your vaccination");
			System.out.println("You are safe!!");
		}
//		catch(CoronaVirusException e)
//		{
//			System.out.println(e.getMessage());// Throwable
//		}
finally
{
sc.close();	
}
	}}
