//Program to delete records from table using jdbc
package jdbc_fundamentals;
//importing packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Emp_delete
{

	public static void main(String[] args)throws Exception
	{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	  //adding url,username,password 
	    	  String url = "jdbc:mysql://localhost:3306/mydatabase";
	    	  String user = "root";
	    	  String pwd = "Tejaswini@31";
	    	  
	    	//connection establishment
	    	  con=DriverManager.getConnection(url,user,pwd);
	    	//create statement
	    	  pstmt=con.prepareStatement("delete from emp_details where emp_id=113");
	    	  int i= pstmt.executeUpdate();
	    	  //printing output
	    	  System.out.println("No. of rows effected : "+i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			//closing connections
			pstmt.close();
			con.close();
		}
		

	}

}
