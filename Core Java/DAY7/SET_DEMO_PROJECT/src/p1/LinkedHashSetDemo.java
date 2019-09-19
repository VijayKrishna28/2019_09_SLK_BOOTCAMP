package p1;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generics with parameterized Type - String
		Set<String> newset=new LinkedHashSet();
		
		newset.add("Temple");
		newset.add("Amphi-theatre");
		newset.add("Restaurant");
		newset.add("Multiplex");
		
		
		  Iterator<String> itr=  newset.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  
		  Object[] myarr=newset.toArray();
		  System.out.println("----------------------------------");
		  for(Object o : myarr)
		  {
			  System.out.println(o);
		  }
		  
	}

}
