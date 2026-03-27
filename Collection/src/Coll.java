// implementation of List(I) using ArrayList(C)& LinkedList(C)
import java.util.*;
public class Coll {
	public static void main(String[] args) 
	{
		Set<Integer> l= new TreeSet<Integer>();
		l.add(70);
		l.add(20);
		l.add(66);
		l.add(20);
		l.add(1000);
		l.add(100);
		l.add(1);
		System.out.println(l);
		//l1.add("rohan");
//		for(int i=0;i<l1.size();i++)
//		System.out.println(l1.get(i));
		// for each
//		for(Integer i:l1)
//			System.out.println(i);
	Iterator<Integer> it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}
}
