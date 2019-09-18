package dynamicqueries;

import java.sql.*; //step 1
import java.util.*;
public class InsertDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        
		Class.forName("com.mysql.cj.jdbc.Driver"); //step 2
		Connection con=
		DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
	    //step 3
		
		PreparedStatement pst=
	    con.prepareStatement("   insert into allemp values(?,?,?)   ");
		//step 4 
		
		//setter methods used below
		
		pst.setInt(1,s.nextInt());
		pst.setString(2,s.next());
		pst.setDouble(3,s.nextDouble());
		
		int rows=pst.executeUpdate();
		//step 5
		
		System.out.println(rows + " row inserted successfully!!");
		
		//step 6
		
		pst.close();
		con.close();
		//step 7
		
		
	
	}

}
