package com.slk.concurrency;



class OurThread extends Thread
{
	//data
	
  int[] newarr= {50,100};
  
	
	//methods
  
  public void run()
  {
	  int temp=newarr[0];
	  newarr[0]=newarr[1];
	  newarr[1]=temp;
	  
	  System.out.print("{ ");
	  for(int val : newarr)
	  {
		  System.out.print(val+"  ");
	  }
	  System.out.print(" } ");
  }
}




public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new OurThread();
		
		t.start();
	}

}
