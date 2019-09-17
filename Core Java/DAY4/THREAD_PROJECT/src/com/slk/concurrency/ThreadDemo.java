package com.slk.concurrency;



class MyThread extends Thread
{
	//run() of Thread, we override in the derived class
	
	//instance data
	int[] arr= {4,11,6,3,9};
	
	//instance method
	public void run()
	{
	
		for(int i=0;i<=4;i++)
		{
			arr[i]=arr[i]*2;
		}
		
		
		for(int val : arr)
		{
			System.out.print(val+"\t" );
		}
	}
	
}




public class ThreadDemo {

	//main is a thread called by JVM.
	//Its priority is 5.
	//its name is Main Thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new MyThread();
		t1.start();
	}

}
