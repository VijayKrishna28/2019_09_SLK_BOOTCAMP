package errorhandling;

public class ExceptionMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String myname=new String("Vijay Krishna");
		
		//String myname="";
		String myname=null;
		
		String myloc="Bangalore";
		
		//critical operation
		
		try {
		System.out.println(myloc.length());
		System.out.println(myname.length());
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println("Inside catch");
			//FIX
			myname="Vijay Krishna";
			System.out.println(myname.length());		
		}
		finally {
			System.out.println("Inside Finally block ...");
			System.gc();
		}
		System.out.println("Bye Bye!!");
		System.out.println("Exiting .....");
		
		
	}

}
