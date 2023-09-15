package jdbc_fundamentals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BatchDemo {
	
		public static void main(String[] args) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Tejaswini@31");
			java.sql.PreparedStatement pst=con.prepareStatement("select * from emp_details");
			ResultSet rset=pst.executeQuery();
			while(rset.next())
				System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getInt(3));
			
			//inserting records into the Employee table
			pst.addBatch("insert into emp_details values(117,'Sam',40000)");
			pst.addBatch("insert into emp_details values(118,'John',60000)");
			pst.addBatch("insert into emp_details values(119,'Rahim',100000)");
			
			
			int[] i=pst.executeBatch();
	        System.out.println("No.of Records inserted :" + i.length);

	     }

	}
	
	