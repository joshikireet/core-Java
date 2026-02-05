
	abstract class Vehicle
	{
		abstract int getNoofWheel();
		void m1()
		{
			System.out.println("hello");
		}
	}

	class Bus extends Vehicle
	{
		int getNoofWheel()
		{
			return 6;	
		}
	}
	class Auto extends Vehicle
	{
		int getNoofWheel()
		{
			return 3;	
		}
	}
	public class Abs1 {
	public static void main(String[] args) {
	Vehicle ob1 = new Bus();
		//Bus b= new Bus();
		System.out.println(ob1.getNoofWheel());
		Auto a= new Auto();
		System.out.println(a.getNoofWheel());
	}
	}


