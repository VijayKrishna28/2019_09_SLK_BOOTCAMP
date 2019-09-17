package p1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inter1 ref; // all reference variables by default 
		            //will be initialized to null
		
		ref=new Inter1Impl();//Implementation Class Object
		
		ref.m1();
		
		System.out.println("-----------------");
		
		ref.m2();
		
		System.out.println("-----------------");
		
		System.out.println("CLASS STRENGTH = "+Inter1.CLASS_STRENGTH);
	
		
	}

}
