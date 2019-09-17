package com.slk.concurrency;

import java.util.Scanner;

class FactorialThread extends Thread
{
	public void run()
	{
		System.out.println("enter any number between 1 and 10");
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		
		
		System.out.println(factorial(num));
	
	}
	
	public int factorial(int n)
	{
		if((n==0)||(n==1))
			return 1;
		else
			return (n * factorial(n-1));
		
	}
	
	
	
}







public class ThreadSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Thread t=new FactorialThread();
 
 t.start();
	 
	}

}
