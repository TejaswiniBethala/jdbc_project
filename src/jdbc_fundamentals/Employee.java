package jdbc_fundamentals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String pwd = "Tejaswini@31";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("select emp_id,emp_name,emp_salary from emp_details");
		System.out.println("emp_id"+"  "+"emp_name"+"  "+"emp_salary");
		while(rset.next())
			System.out.println(rset.getInt("emp_id")+"      "+rset.getString("emp_name")+"      "+rset.getInt("emp_salary"));
		
		con.close();
		stmt.close();
		rset.close();

	}

}
