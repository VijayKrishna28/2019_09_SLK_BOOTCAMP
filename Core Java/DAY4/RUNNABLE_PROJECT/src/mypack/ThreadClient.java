package mypack;

class Number
{
	public void show()
	{
		System.out.println("Inside show() of Number ....");
	}
}



class EvenNums extends Number implements Runnable
{
	//public void show()
	public void run()
	{
		for(int i=50;i<=60;i+=2)
		{
			System.out.print(i+"  ");
		}
	}
}



public class ThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenNums objref=new EvenNums(); //Thread Ready Object
		
		objref.show();
		
		Thread t1=new Thread(objref); // Actual Thread Object
		
		t1.start();
		
	}

}
