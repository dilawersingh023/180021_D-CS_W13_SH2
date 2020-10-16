package sh2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Write a program to display all records from table where city name is 'Delhi, 'Chandigarh' and 'Mumbai'. 

public class Q8 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/W13sh2";
		String uName = "root";
		String pass = "Asdfghjkl";


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		String query = "select * from employee where City='Delhi' || City='Mumbai' || City='Chandigarh'";
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
