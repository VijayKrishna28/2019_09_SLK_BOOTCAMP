package p2;

class Student {


	//static data
	private static String subject;
	
	
	//special block - static
	
	static {
		Student.subject="Java";
	}
	
	//instance data
	private int rollNo;
	private String name;
	private float marks;
	
	
	//special method - constructor
	
	Student(int rno , String sname, float mks)
	{
		this.rollNo=rno;
		this.name=sname;
		this.marks=mks;
		
	}
	
	//static methods
	
	public static String getSubject()
	{
		return Student.subject;
	}
	
	//instance methods
	void showGrade()
	{
		if ( (this.marks>60) && (this.marks<=100) )
			System.out.println("First Division");
		else if ( (this.marks>40) && (this.marks<=60) )
			System.out.println("Second Division");
		else
			System.out.println("Failed");
	}
	
}
