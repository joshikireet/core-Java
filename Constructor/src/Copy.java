class Student
{
	String name;
	int roll;
Student(String name,int roll)
{
	this.name=name;
	this.roll=roll;
}

Student(Student s)
{
	
	this("hello",10);
	name=s.name;
	roll=s.roll;
	//this("hello",10);
}
void display()
{
	System.out.println("name "+name+"  "+"roll no "+roll);
}
}

public class Copy {
public static void main(String[] args) {
	Student s1= new Student("rohan",40);
	s1.display();
  	Student s2= new Student(s1);
  
  	s2.display();
    
}
}
