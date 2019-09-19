package p1;
import java.util.*;
public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//GENERICS WITH PARAMETERIZED DATA TYPE!!!
		Set<Integer> ourset=new HashSet(); //what is its initial capacity
		                          // by default, initial capacity is 16.
		                          //load factor is 0.75
		
		System.out.println(ourset.isEmpty());
		System.out.println(ourset.size());
		System.out.println(ourset.contains("Ajay"));
		System.out.println(ourset);
		
		
		ourset.add(111);
		ourset.add(90);
		ourset.add(155);
		ourset.add(120);
		ourset.add(5);
//		ourset.add("vfislk");
//		ourset.add('M');
//		ourset.add(3.1414);
		
		System.out.println(ourset);
		System.out.println(ourset.contains(90));
		
		Iterator<Integer> itr=ourset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ourset.remove(90);
		System.out.println(ourset);
		
		Set<Integer> childset=new HashSet();
		childset.add(19);
		childset.add(99);
	
	ourset.addAll(childset);
	
	itr=ourset.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println(ourset);
	
	ourset.removeAll(childset);
	System.out.println(ourset);
	}
	

}
