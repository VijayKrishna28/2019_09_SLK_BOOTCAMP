package manyforms;

public class Sample {

	static void add()
	{
		System.out.println(5 + 5);
	}
	static void add(int a)
	{
		System.out.println(a + 100);
	}
	static void add(String data)
	{
		System.out.println(data + " added with "+data);
	}
	
	static  void add(int a , double b)
	{
		System.out.println(a+b);
	}
	static void add(double d,int i)
	{
		System.out.println(d + i);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add("SLK");
		add();
		add(2.2, 2);
		add(7);

	}

}
