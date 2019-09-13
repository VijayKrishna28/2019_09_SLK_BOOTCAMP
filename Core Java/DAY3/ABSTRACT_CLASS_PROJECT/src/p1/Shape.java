package p1;

abstract public class Shape
{
	protected int len;
	protected int bre;
	
	public Shape(int i,int j)
	{
		this.len=i;
		this.bre=j;
	}
	
	abstract public int area();
    abstract public int perimeter();
  
	public void sayHello()
	{
		System.out.println("Hello from Shape class");
	}
	
	public static void main(String[] args)
	{
		//Shape s=new Shape();
	}
	
}