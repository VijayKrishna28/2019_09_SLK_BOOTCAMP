package p1;

import java.util.Date;

@FunctionalInterface
interface I
{
	 void today(String msg,String newmsg);
}


//class Impl implements I
//{
//
//	@Override
//	public void today(String msg) {
//		// TODO Auto-generated method stub
//		
//		Date d=new Date();
//		System.out.println("Today at "+msg+" date = "+ ( d.toString() ) );
//	}
//	
//}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//    I ref=new I()
//    		{  
//    	             public void today(String msg)
//    	             {
//    	            	 Date d=new Date();
//    	            	 System.out.println("Today at "+msg+" date = "+  (d.toString() ));
//    	             }
//    		};
//    	

    	    I ref=(msg,msg1)->System.out.println("Today at "+msg+" "+msg1+" date = "+ new Date());
   
	
    	    	  ref.today("VFISLK","BANGALORE");
	}

}
