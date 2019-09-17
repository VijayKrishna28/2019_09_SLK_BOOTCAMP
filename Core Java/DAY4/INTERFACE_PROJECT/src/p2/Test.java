package p2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Circle c=new Circle();
		
		Shape s; //null {Interface reference}
		
		s=new Circle();//Implementation Class Object
		
		System.out.println("AREA = "+s.area());
		System.out.println("PERIMETER = "+s.perimeter());
	}

}
