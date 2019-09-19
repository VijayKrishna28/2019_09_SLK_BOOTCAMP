import java.sql.*; // step 1

public class MetaDataDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		// step 2
		
Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");

//step 3

DatabaseMetaData dbmd=con.getMetaData();

//step 4

System.out.println("Driver Name : "+dbmd.getDriverName());
System.out.println("Driver Version : "+dbmd.getDriverVersion());
System.out.println("User Name : "+ dbmd.getUserName());
System.out.println("Database Product Name : "+dbmd.getDatabaseProductName());
System.out.println("Database Product Version : "+dbmd.getDatabaseProductVersion());
//step 5

System.out.println("Sucess, metadata of DB displayed!!!");
//step 6

con.close();
//step 7

		
	}

}
