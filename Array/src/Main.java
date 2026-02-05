import java.util.*;

//Employee class with empId and name as attributes
class Employee{
  int empId;
  String name;
  //Employee class constructor
  Employee(){
Scanner sc= new Scanner(System.in);
System.out.println("enter name ");
name=sc.nextLine();
System.out.println("enter empid ");
empId=sc.nextInt();
  
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
   System.out.println();
 }
}
public class Main{
	   public static void main(String args[]){
	     //create array of employee object  
	    Employee[] obj = new Employee[2] ;
	 for(int i=0;i<args.length;i++)
	     //create & initialize actual employee objects using constructor
	    obj[i] = new Employee();
	      obj[0]= new Employee();
	 obj[0].showData();
	      obj[1]=new Employee();
	      obj[1].showData();
	     //display the employee object data
	   
//	   System.out.println("Employee Object 1:");
//	     obj[0].showData();
//	     System.out.println("Employee Object 2:");
//	     //obj[1].showData();
	  }
	}