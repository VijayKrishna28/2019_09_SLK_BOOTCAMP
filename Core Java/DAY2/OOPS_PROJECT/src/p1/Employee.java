package p1;

class Employee {
	
	//static data
	
	private static String compName;
	
	//special block
	static {
		Employee.compName="SLK";
	}
	
	//instance data
	
	private int empId;
	private String empName;
	private double empSal;
	
	//special method - constructor
	
	Employee(int eid,String ename,double esal)
	{
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}
	
	
	
	//static methods
	
    public static String getCompanyName()
    {
    	return Employee.compName;
    }
	
	//instance methods
    void showAllDetails()
    {
    	System.out.println("Id = "+this.empId);
    	System.out.println("Name  = "+this.empName);
    	System.out.println("Salary = "+this.empSal);
    	System.out.println("Company = "+Employee.compName);
    }

}
