//JDBC program to display records from student relation
package jdbc_fundamentals;

//importing the required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// class
public class Students_Info 
{

	public static void main(String[] args) throws Exception
	{
		
		//Loading the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String user = "root";
		String pwd = "Tejaswini@31";
		
		//Connection establishment
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		//Creating Statement
		Statement stmt = con.createStatement();
		
		//Execute the statement
		ResultSet rset = stmt.executeQuery("select * from Student_details");
		
		//Printing the output statement
		System.out.println("stu_id"+"   "+"stu_name"+"  "+"stu_branch"+"  "+"stu_marks");
		//while loop
		while(rset.next()) 
		{
			System.out.println(rset.getInt("stu_id")+"     "+rset.getString("stu_name")+"       "+rset.getString("stu_branch")+"           "+rset.getInt("stu_marks"));
		}
		//close the connections
		rset.close();
		stmt.close();
		con.close();
		

	}

}
