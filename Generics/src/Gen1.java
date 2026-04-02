class Student1<T>  // type parameter
{
private T val;
Student1(T val)
	{
		this.val=val;
	}
	public T getVal()
	{
		return val;
	}
	public void setVal(T val)
	{
		this.val=val;
	}
}
public class Gen1 {
public static void main(String[] args) {
	Student1<Integer>ob1= new Student1<Integer>(10); // type argumet
	Student1<String> ob2= new Student1<String>("ajay");
System.out.println(ob1.getVal()+5);
System.out.println(ob2.getVal()+5);
	//String s= (String)ob1.getVal(); // class cast exception
}}
