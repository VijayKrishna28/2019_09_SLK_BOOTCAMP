package dynamicqueries;

import java.sql.*; //step 1
import java.util.*;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in); 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
		
		Connection con=
		DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		//step 3
		
		PreparedStatement pst=
				
	    con.prepareStatement(" update allemp set empSal=? where empName LIKE ? ");
		//step 4 
		
		//setter methods
		pst.setDouble(1,s.nextDouble());
		pst.setString(2,s.next());
		
		int rows=pst.executeUpdate();
		
		//step 5
		
		System.out.println(rows + " row updated correctly!!!");
		//step 6
		
		pst.close();
		con.close();
		
	}

}
