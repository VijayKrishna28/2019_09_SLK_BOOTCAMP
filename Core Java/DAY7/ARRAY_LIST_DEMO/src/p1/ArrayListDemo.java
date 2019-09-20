package p1;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> mylist=new ArrayList(20);//initial capacity is 20
		
		
		mylist.add("Vijay");
		mylist.add("Sanjay");
		mylist.add("Dhananjay");
		mylist.add("Mrityunjay");
		
		mylist.add(2,"jayjay");
		mylist.remove(4);
		mylist.set(1, "S.jay");
		System.out.println(mylist.get(3));
		
		//enhanced for loop for printing array list
		for(String str:mylist)
		{
			System.out.print(str+"\t");
		}
		
		System.out.println("\n-------------------");
		
		Iterator<String> itr=mylist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
