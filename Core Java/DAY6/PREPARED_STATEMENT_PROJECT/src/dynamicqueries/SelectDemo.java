package dynamicqueries;
import java.sql.*;//step 1
public class SelectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver"); //step 2
		
		Connection con=
		DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");		
	    //step 3
		
		PreparedStatement pst=
	    con.prepareStatement(" select * from allemp ");	
		
		//step 4
		
		ResultSet rs=pst.executeQuery();
		//step 5
	
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getDouble(3));
		}
		//step 6
		
		pst.close();
		con.close();
		//step 7
	
	}

}
