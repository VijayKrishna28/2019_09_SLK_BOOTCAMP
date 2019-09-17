package arrow_functions;

@FunctionalInterface
interface A
{
void show(int i);
}

//class Xyz implements A
//{
//
//	@Override
//	public void show(int i) {
//		// TODO Auto-generated method stub
//	System.out.println("Hello"+i);	
//	}
//	
//}



public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//    A ref=new A()
//    		{
//    	         public void show(int i)
//    	         {
//    	        	 System.out.println("Hello"+i);
//    	         }
//    		};
		
 A ref= i->System.out.println("Hello"+i);

	      
	      
    		ref.show(6);
	

}
}
