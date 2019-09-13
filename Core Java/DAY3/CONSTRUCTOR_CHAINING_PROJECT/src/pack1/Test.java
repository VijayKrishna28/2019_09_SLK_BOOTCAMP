package pack1;



class Employee
{
	Employee()
	{   super(); //java.lang.Object's constructor
		System.out.println("Inside Employee Constructor ..............");
	}
	
}

class Manager extends Employee
{
	Manager()
	{
		super();
		System.out.println("Inside Manager Constructor ...............");
	}
}

class Vice_President extends Manager
{
	Vice_President()
	{
		super();
		System.out.println("Inside Vice_President Constructor ..........." );
	}
}
class CEO extends Vice_President
{
	CEO()
	{
		super();
		System.out.println("Inside CEO Constructor ............");
	}
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CEO myceo=new CEO();
	}

}
