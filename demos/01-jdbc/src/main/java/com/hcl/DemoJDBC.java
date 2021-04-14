package com.hcl;
import java.sql.*;

public class DemoJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement statement = null;
		
		try {
			
			// conn =
		      // DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                      // "user=minty&password=greatsqldb");
			String url = "jdbc:mysql://localhost:3306/testdb";
			String userName = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("======");
			statement = con.createStatement();
			String query = "insert into cat values (3, 'Pooffy', 12)";
			//statement.executeUpdate(query);
			
			query = "update cat set name = 'fluffy_cat' where id = 1";
			statement.executeUpdate(query);
			
			
			query = "select * from cat";
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				System.out.println("======");
			}
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		

	}

}
