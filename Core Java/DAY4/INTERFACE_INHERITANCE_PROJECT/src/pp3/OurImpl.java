package pp3;

import pp2.Derived;

public class OurImpl implements Derived {

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
		System.out.println("Base Interface fun1() implemented ....");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("Derived Interface fun2() implemented ....");
	}

}
