package p1;

import java.sql.*; //step 1 is done 


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 completed.
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		//step 3 is completed.
		
		con.setAutoCommit(false);
		
		Statement st=con.createStatement();
		//step 4 is completed
		
		int rows=st.executeUpdate("insert into allemp values(103,'PJ',1111.11) ");
		
		//step 5 is completed
		
		System.out.println(rows + " row inserted into allemp table successfully");
		//step 6 is completed
		
		con.commit();//permanent save
		
		st.close();
		con.close();
		
	}

}
