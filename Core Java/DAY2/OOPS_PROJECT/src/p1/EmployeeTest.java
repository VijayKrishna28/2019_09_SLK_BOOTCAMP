package p1;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create Employee object first
		
		Employee e1=new Employee(101,"Vijay",9571.71);
		
		e1.showAllDetails();
		
		System.out.println( Employee.getCompanyName() );
		
		
	}

}
