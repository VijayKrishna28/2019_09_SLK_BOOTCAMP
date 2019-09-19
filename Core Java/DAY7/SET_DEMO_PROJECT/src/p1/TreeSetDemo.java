package p1;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Double> allset=new TreeSet();
		
		
		allset.add(555.55);
		allset.add(333.33);
		allset.add(999.99);
		allset.add(777.77);
		
		
		Iterator<Double> itr=allset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
