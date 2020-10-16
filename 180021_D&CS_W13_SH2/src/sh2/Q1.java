package sh2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Write a program for creating a table.  
//relational schema Employees (Emp_ID, First_name, Last_name, Salary, Dept_ID, Email, City)

public class Q1 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/W13sh2";
		String uName = "root";
		String pass = "Asdfghjkl";
		String query = "CREATE table Employee(Emp_ID int, First_name varchar(20), Last_name varchar(20), Salary int, Dept_ID int, Email varchar(25), City varchar(20))";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		
		try {
			st.executeUpdate(query);
			System.out.println("Created table Employee.");
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		st.close();
		con.close();
	}
}
