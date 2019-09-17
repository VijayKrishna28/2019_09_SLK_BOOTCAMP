package streamline;




class Callme
{
	//instance method is now synchronized
	//shared resource is now streamlined!!
	synchronized  void call(String msg) throws InterruptedException
	{
		System.out.print(" [ " +msg);
		
		Thread.currentThread().sleep(10000);
		System.out.println(" ] ");
	}
	
}


class Caller implements Runnable
{

	//data
	Thread tref; //null
	
	String realmsg;//null
	
	Callme target;//null
	
	Caller(Callme trg,String data)
	{
		this.target=trg;
		this.realmsg=data;
		this.tref=new Thread(this); // this is same "new Caller()" object
		
		tref.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try{ target.call(realmsg); } catch(Exception e) {}
	
	}
	
}





public class SynchronizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Callme target=new Callme();
		Caller obj1=new Caller(target,"Hello");
		Caller obj2=new Caller(target,"Synchronized");
		Caller obj3=new Caller(target,"World");
	}

}
