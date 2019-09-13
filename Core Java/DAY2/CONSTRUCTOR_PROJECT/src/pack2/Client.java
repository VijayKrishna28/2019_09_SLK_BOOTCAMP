package pack2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car c1=new Car();
       
    Car c2=new Car(8888,"Jaguar","neon");
    
    c1.display();
    
    System.out.println("------------------");
    
    c2.display();
    
    Car c3=new Car(c1);
       
    System.out.println("------------------");
    c3.display();
       
	}

}
