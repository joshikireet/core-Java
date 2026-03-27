// use of ArrayList
import java.util.*;
public class Coll 
{public static void main(String[] args) {
	
Set<Integer> l1=new LinkedHashSet<Integer>(); // Typesafe
l1.add(500);
l1.add(30);
l1.add(1);
l1.add(9);
l1.add(1);
System.out.println(l1);
//for(int i=0;i<l1.size();i++)
//	System.out.println(l1.get(i));
//for(Integer x:l1)
//	System.out.println(x);
//l1.set(0, 1000);
//System.out.println(l1.get(3));
//List<Integer> l2=new ArrayList<Integer>(); // Typesafe
//l2.add(900);
//l2.add(23);
//l1.addAll(l2);
//l1.removeAll(l2);
//System.out.println(l1);
System.out.println(l1.isEmpty());
Iterator<Integer> it=l1.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}
}
