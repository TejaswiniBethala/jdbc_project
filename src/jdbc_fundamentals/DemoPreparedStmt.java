package jdbc_fundamentals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class DemoPreparedStmt 
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/mydatabase";// add your database name at myproject
			String username = "root";// add your username of mysql
			String pwd = "Tejaswini@31";// add password of mysql

			// 3.establishing connection
			Connection con = DriverManager.getConnection(url, username, pwd);
			
			PreparedStatement pst=con.prepareStatement("insert into emp_details values(114,'Saara',30000)");
			
			int i=pst.executeUpdate();
			System.out.println("No.of Rows inserted:"+i);
			con.close();
			 pst.close();
		}

	}

