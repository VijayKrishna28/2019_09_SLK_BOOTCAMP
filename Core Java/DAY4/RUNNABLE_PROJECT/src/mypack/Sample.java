package mypack;

import java.util.Scanner;

class StrConcat implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first name:");
		
		String fname=s.next();
		
		System.out.println("Enter last name:");
	    String lname=s.next();
	    
	    System.out.println("Full Name = "+ (fname.concat(lname) ) );
	}
	
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj=new StrConcat();
		Thread t1=new Thread(obj);
		
		t1.start();
		
	}

}
