package teabreak;

public class NumberManipulate {

	
	
	
	static int splitter(int num)
	{
		int res=num%100;
		
		return res;
	}
	
	

public static void main(String[] args) {

//NumberManipulate obj=new NumberManipulate();

int val=NumberManipulate.splitter(2543);

System.out.println(val);
	}

}
