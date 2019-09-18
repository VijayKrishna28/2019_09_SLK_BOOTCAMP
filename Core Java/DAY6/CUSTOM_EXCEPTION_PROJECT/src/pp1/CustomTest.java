package pp1;

//User Defined Exception Class [ UnChecked Exception ]

class RetirementException extends RuntimeException
{
	RetirementException(String errmsg)
	{
		super(errmsg);//Invoking Exception class's parameterized constructor
		              //Constructor Initialization List
	}
}


//User Defined Exception Class [ Checked Exception ]

class RetirementException1 extends Exception
{
	RetirementException1(String errmsg)
	{
		super(errmsg);//Invoking Exception class's parameterized constructor
		              //Constructor Initialization List
	}
}



public class CustomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=65;
		try {
			
	    if ( age >= 60 )
	    {
	    	throw new RetirementException("Your age exceeds 60");
	    }
		
		}
	    
		catch(RetirementException e)
		{   //FIX
			//e.printStackTrace();
			System.out.println("Please go home !! Don't come back again.");
		}
		
		System.out.println("Bye Bye!!");
	}

}
