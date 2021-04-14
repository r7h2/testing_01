package com.hcl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StoredProcedureDemo {

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
			String call = "{call add_product(?,?)}";
			CallableStatement stmt = con.prepareCall(call);
			stmt.setString(1, "keyboard");
			stmt.setBigDecimal(2, new BigDecimal(1900.50));
			stmt.executeUpdate();
			
			//String query = "insert into cat values (3, 'Pooffy', 12)";
			//statement.executeUpdate(query);
			
			
			
			
			String query = "select * from eproduct";
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
		System.out.println(rs.getMetaData());
		/*
		 * while(rs.next()) { System.out.println(rs.getInt("id"));
		 * System.out.println(rs.getString("name"));
		 * System.out.println(rs.getInt("age")); System.out.println("======"); }
		 */
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		

	}


}
