package association;
import java.util.*;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String> newmap=new LinkedHashMap();


       newmap.put(134,"RAJU");
       newmap.put(111,"BHAVANI");
       newmap.put(247,"BHASKAR");
       newmap.put(109,"MAHESHA");
       newmap.put(79,"SRINIVASA");
       newmap.put(null,"VIVEK");
       newmap.put(null,"KUMAR");
       newmap.put(79,"SHYAM");
       System.out.println(newmap);
	}

}
