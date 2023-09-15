package jdbc_fundamentals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DemoPreparedStmt_Insert
{

	public static void main(String[] args) throws Exception
	{
		
				Connection con=null;
				PreparedStatement pstmt=null;
				
				try
				{
				
				    Class.forName("com.mysql.cj.jdbc.Driver");

				    String url = "jdbc:mysql://localhost:3306/mydatabase";// add your database name at myproject
				    String username = "root";// add your username of mysql
				    String pwd = "Tejaswini@31";// add password of mysql

				    // 3.establishing connection
				    con = DriverManager.getConnection(url, username, pwd);
			
				    pstmt=con.prepareStatement("insert into emp_details values(?,?,?)");
				    pstmt.setInt(1,115);
				    pstmt.setString(2, "Lalith");
				    pstmt.setInt(3,35000);
				    int i=pstmt.executeUpdate();
				
				    pstmt.setInt(1,116);
				    pstmt.setString(2, "Rani");
				    pstmt.setInt(3,40000);
			        i+=pstmt.executeUpdate();
				
				    System.out.println("No.of Rows inserted:"+i);
			   }
			   catch(Exception e)
			   {
				   System.out.println(e);
			   }
			   finally
			   {
					con.close();
					pstmt.close();
			   }
				
			}
		
	}


