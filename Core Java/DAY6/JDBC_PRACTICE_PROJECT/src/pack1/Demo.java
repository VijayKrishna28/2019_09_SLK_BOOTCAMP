package pack1;

import java.sql.*; //step 1 is completed


public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("com.mysql.cj.jdbc.Driver"); //step 2 is completed
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
//step 3 is completed

Statement st=con.createStatement();
//step 4 is completed

 int rows=st.executeUpdate("delete from allemp where empid=105");
 //step 5 is completed
 
 System.out.println(rows + " row deleted from allemp table successfully!!!");
 //step 6 is completed
 
 st.close();
 con.close();

	}

}
