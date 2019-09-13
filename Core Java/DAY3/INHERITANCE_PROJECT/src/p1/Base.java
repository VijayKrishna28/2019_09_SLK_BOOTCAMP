package p1;

public class Base {
 
	
	public Base()
	{
		System.out.println("Inside Base");
	}
	//instance data
	protected int i;
	protected int j;
	
	//instance methods
	//setter method
	public void setIJ(int v1,int v2)
	{
		this.i=v1;
		this.j=v2;
		
	}
	//getter method
	public void showIJ()
	{
		System.out.println("i = "+this.i);
		System.out.println("j = "+this.j);
	}
	
	
	
}
