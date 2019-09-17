package enumerated;

//USER DEFINED DATATYPE
enum Mobile
{
	APPLE(50000),SAMSUNG,HTC(2000),OPPO(11000);
	int price; //data
	//constructor	
	Mobile()
	{
		this.price=8000;
	}
	
	Mobile(int realprice)
	{
		this.price=realprice;
	}
	
	//method
	public int getPrice()
	{
		return ( this.price + (5*(this.price) )/100);
	}
}

/*
 * class Mobile extends Enum
 * {  public static final Mobile APPLE = new Mobile(5000); 
 *    public static  final Mobile SAMSUNG=new Mobile();
 *    public static final Mobile HTC=new Mobile(2000);
 *    public static final Mobile OPPO=new Mobile(11000);
 *  }
 */


public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Mobile.HTC);
		System.out.println("---------------");
		System.out.println(Mobile.APPLE);
		System.out.println("---------------");
		
		
		Mobile m; //null { enum reference }
		m=Mobile.OPPO;
		
		switch(m)
		{
		case APPLE: System.out.println("Best Mobile Phone");
		            break;
		case SAMSUNG: System.out.println("Cheap imitation of APPLE phones");
		            break;
		case HTC: System.out.println("Not liked by Indians..infact everybody"); 
		            break;
		default: System.out.println("Wrong Phone Model");            
		}
		
	
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		
		
		System.out.println(Mobile.HTC.ordinal());
		System.out.println(Mobile.APPLE.ordinal());
	
		
		Mobile[] allmobiles=Mobile.values();
		
		for(Mobile mobile : allmobiles)
		{
			System.out.print(mobile+"  ");
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		
		
		System.out.println(Mobile.SAMSUNG.getPrice());
		System.out.println(Mobile.APPLE.getPrice());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
