package fetchrows;

import java.sql.*;//step 1


public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	
	
	Class.forName("com.mysql.cj.jdbc.Driver"); // step 2
	
Connection con=	
DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
	//step 3

Statement st=con.createStatement();
//step 4
	
	ResultSet rs=st.executeQuery("select * from allemp");
	//select * from allemp where empName LIKE 'JJ'
	//step 5
	
	
	while(rs.next())
	{
	System.out.println(rs.getInt("empId")+ "   "+rs.getString("empName")+"   "+rs.getDouble("empSal"));	
	}
	//step 6
	
	st.close();
	con.close();
	//step 7
	
} 
catch(Exception e) {}
	


	}

}
