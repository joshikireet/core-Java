// LinkedHashSet using Set
import java.util.*;
public class Coll1 {
public static void main(String[] args) {
	Set<Integer> l= new TreeSet<Integer>();
	l.add(100);
	l.add(90);
	l.add(22);
	l.add(1);
	l.add(5);
	l.add(1);
	System.out.println(l);
	Iterator<Integer>it = l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	

}
}
