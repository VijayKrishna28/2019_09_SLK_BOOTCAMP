package association;
import java.util.*;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> mymap=new HashMap();
		
		System.out.println(mymap);
		System.out.println(mymap.isEmpty());
		System.out.println(mymap.size());
		System.out.println(mymap.containsKey(77));
		System.out.println(mymap.containsValue("SLK"));
		mymap.clear();
		System.out.println(mymap);
		
		
		mymap.put(111,"INDIA");
		mymap.put(77,"KARNATAKA");
		mymap.put(55,"BANGALORE");
		mymap.put(1000,"SLK");
		mymap.put(500,"EXTRA");
		
		System.out.println("----------------------");
		System.out.println( mymap.get(1000) );
		System.out.println(mymap.get(111));
		
		System.out.println(mymap);
		
		System.out.println("----------------------");
		
		mymap.replace(500, "VFI");
	
		System.out.println(mymap);
		
		System.out.println("----------------------");
		
		mymap.remove(500);
		System.out.println(mymap);
		
		System.out.println("Keys of the map are "+ mymap.keySet());
		
		Set<Integer> allkeys=mymap.keySet();
		
		System.out.println("Values of the map are "+mymap.values());
		
		Collection<String> allvalues=mymap.values();
		System.out.println(mymap.containsKey(77));
		System.out.println(mymap.containsValue("SLK"));
	}

}
