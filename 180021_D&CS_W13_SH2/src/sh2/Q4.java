package sh2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Write a program for updating records into table.

public class Q4 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/W13sh2";
		String uName = "root";
		String pass = "Asdfghjkl";


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		String query = "update employee set First_name = 'Aaany' where Emp_ID = 001";
		st.executeUpdate(query);
		query = "select * from employee";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			int emp_ID = rs.getInt("Emp_ID");
			String fname = rs.getString("First_name");
			String lname = rs.getString("Last_name");
			int sal = rs.getInt("Salary");
			int dept = rs.getInt("Dept_ID");
			String email = rs.getString("Email");
			String city = rs.getString("City");
			
			System.out.print("Employee ID: " + emp_ID + " ");
			System.out.print("First Name: " + fname+ " ");
			System.out.print("Last Name: " + lname+ " ");
			System.out.print("Salary: " + sal+ " ");
			System.out.print("Department ID: " + dept+ " ");
			System.out.print("Email ID: " + email+ " ");
			System.out.print("City ID: " + city+ " ");
			System.out.println();
		}
		rs.close();
		st.close();
		con.close();
	}
}
