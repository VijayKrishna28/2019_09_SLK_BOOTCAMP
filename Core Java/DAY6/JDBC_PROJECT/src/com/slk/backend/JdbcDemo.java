package com.slk.backend;

import java.sql.*; //step 1 done

public class JdbcDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	try {
		
		
Class.forName("com.mysql.jdbc.Driver");//step 2 done
		
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
	//step 3 is done


        Statement st= con.createStatement();
        //step 4 is done
        
              int rows=st.executeUpdate(" insert into allemp values(101,'VJ',9999.99) ");
        //step 5 is done
	
              
               System.out.println(rows + " row inserted successfully");
               
        //step 6 is done     
               
               st.close();
               con.close();
               
       //step 7 is done        
	}
	catch(Exception e)
	{
		
	}
		
		
	}

}
