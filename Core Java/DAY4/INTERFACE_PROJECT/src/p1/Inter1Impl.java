package p1;

import java.util.Date;

class Inter1Impl implements Inter1{

	public void m1()
	{
		
		
		System.out.println("Date and TimeStamp "+new Date().toString());
	}
	
	public void m2()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 * "+i+" = "+(5 *i));
		}
	}
}
