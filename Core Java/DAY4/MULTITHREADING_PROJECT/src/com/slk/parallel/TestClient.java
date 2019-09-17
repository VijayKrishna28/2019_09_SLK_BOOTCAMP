package com.slk.parallel;


class Hii implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Hii ....");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Helloo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Helloo ....");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class TestClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new Hii());
		Thread t2=new Thread(new Helloo());
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println("----------------------------");
		
		t1.setName("Hii Thread");
		t2.setName("Helloo Thread");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println("----------------------------");
		
		t1.start();
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		System.out.println("t1 is alive ? "+ t1.isAlive());
		t1.join();
		t2.join();
		
		
		System.out.println("t1 is alive ? "+ t1.isAlive());
		System.out.println("Bye ....");
	}

}
