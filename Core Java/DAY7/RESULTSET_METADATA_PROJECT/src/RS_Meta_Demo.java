import java.sql.*; //STEP 1

public class RS_Meta_Demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		// STEP 2
		
		Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		//STEP 3
		
		PreparedStatement pst=
		con.prepareStatement("select * from allemp");
		//STEP 4
		
		ResultSet rs=pst.executeQuery();
		//STEP 5
		
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println("Column Count : "+rsmd.getColumnCount());
		
System.out.println("Column DataType of empSal : "+rsmd.getColumnTypeName(3));

System.out.println("Coumn Name of 2nd attribute : "+rsmd.getColumnName(2));

System.out.println("Table Name of 1st attribute : "+rsmd.getTableName(1));

//step 6

pst.close();
con.close();
//step 7
	}

}
