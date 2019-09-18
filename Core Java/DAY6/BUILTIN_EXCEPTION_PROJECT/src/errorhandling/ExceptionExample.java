package errorhandling;

public class ExceptionExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		
		System.out.println("Good Morning to you all !!! Bang...Bang");
		
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//FIX
			System.out.println("inside catch handler of the application");
			return;
		}
		
		
		System.out.println("Good Evening to all of you !!! No Bang ... Bang");
		
		
		
	}

}
