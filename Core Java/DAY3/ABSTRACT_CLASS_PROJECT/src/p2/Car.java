package p2;

public class Car extends Vehicle{

	
	
	public void start()
	{
		System.out.println("By turning ON the Ignition Key....");
	}
	public void stop()
	{
		System.out.println("By turning OFF the Ignition Key....");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v=new Car();
		v.start();
		v.stop();

	}

}
