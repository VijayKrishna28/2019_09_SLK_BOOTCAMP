package pp1;

import java.sql.*; //step 1


public class CallableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
		
		Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
		//step 3
		
		CallableStatement cst=
	    con.prepareCall(" {call ADDPRODUCT(?,?)   } ");
		
		//step 4
		
		//Setter Methods
		
		cst.setInt(1, 1001);
		cst.setString(2, "Cinthol");
		
		cst.execute(); //Stored procedure finished/completed
		//step 5
		
		System.out.println("Success and congrats!!");
				
		//step 6		
		
		cst.close();
		con.close();
		//step 7 
	}

}
