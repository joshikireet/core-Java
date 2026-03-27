// ArrayList using List
import java.util.*;
public class AL {
public static void main(String[] args) {
	List<Integer> l= new ArrayList<>();
	l.add(23);
	l.add(20);
	l.add(12);
	
	l.set(0, 3);
	System.out.println(l.get(2));
	l.remove(0);
	List<Integer> l1= new ArrayList<Integer>();
	l1.add(100);
	l1.add(56);
	l.addAll(l1);
	Collections.sort(l);
//	Iterator<Integer>it = l.iterator();
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
	for(int i=0;i<l.size();i++)
	System.out.println(l.get(i));
	l.removeAll(l1);
	System.out.println("after emoval l1");
	System.out.println(l);
	

}
}
