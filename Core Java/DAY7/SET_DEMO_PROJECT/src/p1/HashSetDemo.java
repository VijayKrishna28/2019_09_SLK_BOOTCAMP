package p1;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set myset=new HashSet();
		
		
		System.out.println(myset.add("Vijay"));
		myset.add(9999.99);
		myset.add('M');
		myset.add(true);
		myset.add(10101);
		System.out.println(myset.add("Vijay"));
		myset.add(null);
		
		System.out.println("size = "+myset.size());
		
		myset.add(null);
		System.out.println(myset);
		
		myset.remove(true);
		
		System.out.println(myset);
		
		System.out.println("myset contains 10101 ? "+myset.contains(10102));
		
		myset.clear();//clears all the values from the set
		
		System.out.println(myset);
		System.out.println(myset.isEmpty());
		System.out.println("size = "+myset.size());
	}

}
