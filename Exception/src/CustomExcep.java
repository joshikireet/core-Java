import java.util.*;

public class CustomExcep {
	public static void main(String[] args)throws CoronaVirusException {
Scanner sc= new Scanner(System.in);
System.out.println("enter the age");
int age= sc.nextInt();
try
{
	if(age>12)
		throw  new CoronaVirusException("stay alert!!! not safe");
	System.out.println("Safe....");
}
//catch(CoronaVirusException e)
//{
//	System.out.println(e.getMessage());
//}
finally
{
	sc.close();
}
	}

}
