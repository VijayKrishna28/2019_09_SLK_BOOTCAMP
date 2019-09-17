package com.slk.parallel;


class Hi extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi ....");
			try{ Thread.currentThread().sleep(1000); } catch(Exception e) {}
		}
	}
	
}

class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello ....");
			try{Thread.currentThread().sleep(1000); } catch(Exception e) {}
		}
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		System.out.println("----------------------");
		
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		System.out.println("----------------------");
		
		obj1.start();
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		
		
	
		
		
		
	
	}

}
