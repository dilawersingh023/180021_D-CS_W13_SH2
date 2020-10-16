package sh2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// Write a program for inserting records into table.   

public class Q2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/W13sh2";
		String uName = "root";
		String pass = "Asdfghjkl";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		String query = "Insert Into Employee values (001,'Audrey', 'Hepburn', 100000, 20, 'aud@gmail.com', 'Mustafabad')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (002,'Yuno', 'Zen', 5000, 20, 'zen@gmail.com', 'Indri')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (003,'Noyell', 'Jobs', 80000, 10, 'jobs@gmail.com','Yamunanagar')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (004,'Zeth', 'Cook', 90000, 20, 'cooktv@gmail.com', 'Delhi')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (005,'Arnold', 'Simth', 100000, 50, 'arnold@gmail.com', 'Mumbai')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (006,'Kirito', 'stark', 90000, 20, 'stark@gmail.com','Mumbai')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (007,'Anabell', 'Stone', 70000, 50, 'anabellg@gmail.com','Kolkata')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (008,'Ariana', 'Taylor', 80000, 20, 'ariana@gmail.com', 'Delhi')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (009,'Dua', 'Fox', 1000000, 10, 'bfox@gmail.com','Delhi')";
		st.executeUpdate(query);
		query = "Insert Into Employee values (010,'Nick', 'Blunt', 90000, 50, 'bluntp@gmail.com','mustafabad')";

		try {
			st.executeUpdate(query);
			System.out.println("inserted records into table successfully.");
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}
}
