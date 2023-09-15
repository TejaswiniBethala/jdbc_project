//Program to insert the values into relation using jdbc
package jdbc_fundamentals;
//importing packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Emp_Update_Info {

	public static void main(String[] args) throws Exception{
		      Connection con = null;
		      PreparedStatement pstmt = null;
		      
		      try {
		    	  Class.forName("com.mysql.cj.jdbc.Driver");
		    	  //adding the url,username,password
		    	  String url = "jdbc:mysql://localhost:3306/mydatabase";
		    	  String user = "root";
		    	  String pwd = "Tejaswini@31";
		    	  
		    	  //Connection establishment
		    	  con=DriverManager.getConnection(url,user,pwd);
		    	  //creating statement
		    	  pstmt=con.prepareStatement("insert into emp_details values(?,?,?)");
		    	  //inserting values
		    	  pstmt.setInt(1, 111);
		    	  pstmt.setString(2, "Rani");
		    	  pstmt.setInt(3,40000);
		    	  int i =pstmt.executeUpdate();
		    	  
		    	  pstmt.setInt(1, 112);
		    	  pstmt.setString(2, "Sita");
		    	  pstmt.setInt(3,30000);
		    	  i+= pstmt.executeUpdate();
		    	  
		    	  pstmt.setInt(1, 113);
		    	  pstmt.setString(2, "Gita");
		    	  pstmt.setInt(3,35000);
		    	  i+= pstmt.executeUpdate();
		    	  //printing output
		    	  System.out.println("No. of rows effected : "+i);
		      }catch(Exception e) {
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


