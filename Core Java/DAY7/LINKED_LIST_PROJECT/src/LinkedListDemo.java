
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> newlist=new LinkedList();
		
		newlist.add("monday");
		newlist.add("wednesday");
		newlist.add("friday");
		newlist.addFirst("sunday");
		newlist.addLast("saturday");
		
		
		for(String str: newlist)
		{
			System.out.println(str);
		}
		
		System.out.println("First Element : "+newlist.getFirst());

		System.out.println("Last Element : "+newlist.getLast());
		
		newlist.removeFirst();
		newlist.removeLast();
		 
		newlist.add(2,"thursday");
		newlist.add(1,"tuesday");
		newlist.set(1, "TUESDAY");
      	

		for(String str: newlist)
		{
			System.out.println(str);
		} //mon, wed , fri
	
		System.out.println("----------------");
		System.out.println(newlist.get(4));	
		
		newlist.remove(1);
	
		for(String str: newlist)
		{
			System.out.println(str);
		} 
	}

}
