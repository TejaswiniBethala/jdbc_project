package jdbc_fundamentals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentImp {

	public static void main(String[] args) throws Exception{
		

		
				//2.loading the Driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url="jdbc:mysql://localhost:3306/mydatabase";//add your database name at myproject
				String username="root";//add your username of mysql
				String pwd="Tejaswini@31";//add password of mysql
				
				//3.establishing connection
				Connection con=DriverManager.getConnection(url, username,pwd );
				
				//4.create statement
				Statement st=con.createStatement();
				
				//5.Execute the statement
				ResultSet set=st.executeQuery("select * from student");//create and add student1 table
				 
				 //6.Print the o/p
				 System.out.println("sid:"+"   "+"sname:");
				 while(set.next())
					 System.out.println(set.getInt("sid")+" "+set.getString("sname"));
				 
				 //7.close the connections
				 con.close();
				 st.close();
				 set.close();
				
				
				

			}
		 
		}

