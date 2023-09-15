//JDBC program to illustrate the table,database and driver details
package jdbc_fundamentals;
//importing packages

import java.sql.DriverManager;
//class
public class MetaData_database 
{
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydatabase";//adding url
		String userName="root";//username
		String pwd="Tejaswini@31";//password
		//establishing connection
		java.sql.Connection con=DriverManager.getConnection(url, userName, pwd);
		//Creating statement
	    java.sql.DatabaseMetaData dbmd=con.getMetaData();
	    //printing the output
	    System.out.println("DriverName:"+dbmd.getDriverName());
	    System.out.println("Driver Version:"+dbmd.getDriverVersion());
	    System.out.println("Product Name:"+dbmd.getDatabaseProductName());
	    System.out.println("Product Version:"+dbmd.getDatabaseProductVersion());
	    System.out.println(dbmd.getURL());
	    System.out.println(dbmd.getUserName());
	    System.out.println(dbmd.getTimeDateFunctions());
	    System.out.println(dbmd.getMaxTableNameLength());
	    System.out.println(dbmd.getJDBCMajorVersion());
	    System.out.println(dbmd.getMaxRowSize());
		

	}

}
