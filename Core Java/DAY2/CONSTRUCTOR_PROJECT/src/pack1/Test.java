package pack1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		
		Employee e2=new Employee(770,"Richard",25558.55);
		
		Employee e3=new Employee(e1);
		Employee e4=new Employee(e2);
		
		e1.displayAll();
		System.out.println("-----------------------");
		e2.displayAll();
		System.out.println("------------------------");
		e3.displayAll();
		System.out.println("------------------------");
		e4.displayAll();
	}

}
