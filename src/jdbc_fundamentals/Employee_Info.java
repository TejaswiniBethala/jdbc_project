//Program using jdbc to insert records asking for insertion
package jdbc_fundamentals;

//importing required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee_Info {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/mydatabase";// adding url
			String username = "root";// adding user name
			String password = "Tejaswini@31"; // adding password
			// establishing connection
			Connection con = DriverManager.getConnection(url, username, password);
			// creating statement
			PreparedStatement pstmt = con.prepareStatement("insert into Emp_Details values(?,?,?)");
			// printing output
			System.out.println("Would you like to insert your details:Yes/No");

			Scanner sc = new Scanner(System.in);
			String opinion = sc.next();

			if (opinion.equals("Yes")) {
				int emp_id, emp_salary;
				String emp_name;
				System.out.println("Enter the employee Id : ");
				emp_id = sc.nextInt();
				System.out.println("Enter the employee Name : ");
				emp_name = sc.next();
				System.out.println("Enter the employee Salary : ");
				emp_salary = sc.nextInt();

			} else if (opinion.equals("No")) {
				System.out.println("Exit");
			}
			pstmt.close();
			con.close();

		} catch (Exception e)

		{
			System.out.println(e);
		}

	}

}
