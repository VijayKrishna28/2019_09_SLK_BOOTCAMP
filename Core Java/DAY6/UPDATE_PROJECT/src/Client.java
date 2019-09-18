
import java.sql.*;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=
	    DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
		con.setAutoCommit(false);
		
		Statement st=con.createStatement();
		
int rows=
//st.executeUpdate("update allemp set empSal=empSal + 2222.22 where empName LIKE 'AJ' ");
st.executeUpdate("update allemp set empSal=empSal + 1000  ");
	
	System.out.println("No. of rows updated successfully is "+rows);
	
	con.commit();
	st.close();
	con.close();
	}

}
