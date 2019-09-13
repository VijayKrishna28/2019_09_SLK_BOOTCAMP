package pack1;

class Employee {
    // Instance data
	private int empId;
	private String empName;
	private double empSal;
	
	//Parameterless constructor
	Employee(         )
	{
		this.empId=0;
		this.empName=null;
		this.empSal=0.0;
		
		
	}
	
	//Parameterized Constructor
	Employee(int eid,String ename,double esal)
	{
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}
	
	//Copy Constructor
	Employee(Employee old)
	{
		this.empId=old.empId;
		this.empName=old.empName;
		this.empSal=old.empSal;
	}
	
	public void displayAll()
	{
		System.out.println(this.empId+" "+this.empName+" "+this.empSal);
	}
}
