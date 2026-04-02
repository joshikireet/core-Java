class Student
{
private Object val;
	Student(Object val)
	{
		this.val=val;
	}
	public Object getVal()
	{
		return val;
	}
	public void setVal(int val)
	{
		this.val=val;

	}
}
public class Gen {
public static void main(String[] args) {
	Student ob1= new Student(10);
	Student ob2= new Student("ajay");
	//ob.setVal("ddd");
	//Manual Downcasting
	int i= (Integer)ob1.getVal();
	String s= (String)ob2.getVal();
	System.out.println(i+5);
	System.out.println(s+5);
}
}
