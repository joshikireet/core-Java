import java.util.*;
public class CustomExcep {
public static void main(String[] args)  {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your age..");
	int age= sc.nextInt();
	try
	{
		if(age>12)
			throw new CoronaVirusException("you are not safe!! get your vaccination done");
		System.out.println("Safe....");
	}
	catch(CoronaVirusException e)
	{
	 System.out.println(e.getMessage());
	}
finally
	{
	 sc.close(); // closed the resource,cleanup code
    }
}
}
