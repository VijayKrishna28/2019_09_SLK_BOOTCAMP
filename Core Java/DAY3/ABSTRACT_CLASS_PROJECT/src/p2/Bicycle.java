package p2;

public class Bicycle extends Vehicle {

	
	
	
	public void start()
	{
		System.out.println("By Pedalling.....");
	}
	public void stop()
	{
	
		System.out.println("By applying brakes.....");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v=new Bicycle();
		v.start();
		v.stop();
		
	}

}
