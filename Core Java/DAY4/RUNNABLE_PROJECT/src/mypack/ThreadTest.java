package mypack;

import java.util.Scanner;

class Numeric
{
	public void show()
	{
		System.out.println("Inside show () of Numeric .....");
	}
}

class CalcCube extends Numeric implements Runnable
{
	//public void show(){}
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		
		   int val=s.nextInt();
		   
		   System.out.println("Cube of "+val+" is "+ (val*val*val));
		
	}
}



public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Runnable objref=new CalcCube(); //ThreadyReady obj
		                                  //Runnable obj
		  
		  Thread t1=new Thread(objref);  //Actual Thread object is t1
		                                 //objref is only thread ready
		 t1.start();
	}

}
