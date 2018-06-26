package com.auribises.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.auribises.model.Customer;

/*
  Java Database Coneectivity(JDBC) Procedure
	1. Load the Driver
		1.1 Download the jar file for Type4 Driver
		1.2 Configure Build Path in Eclipse Project
		1.3 Use API Class.forname()

	2. Create the Connection
		2.1 URL to the DB
		2.2 UserName
		2.3 Password
		2.4 Use API's DriverManager and Connection

	3. Write SQL Statement
		3.1 String sql = "insert into Customer values(null,'John','+91 9898989898', 'john@example.com',30)";

	4. Execute SQL Statement
		4.1 Statement or PreparedStatement

	5. Close the Connection
 */

public class Client {

	public static void main(String[] args) {
		
		Customer cRef1 = new Customer(0,"Sia","+91 8787878787","sia@example.com",28);
		
		Customer cRef2 = new Customer();
		cRef2.name = "Fionna";
		cRef2.email = "fionna@example.com";
		cRef2.phone = "+91 76767676767";
		cRef2.age = 24;
		
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pStmt = null;
		
		try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
			
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/GW2018A";
			String username = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, username, password);
			System.out.println("--Connection Created--");
			
			//3. Write SQL Statement
			//String sql = "insert into Customer values(null,'John','+91 9898989898', 'john@example.com', 30)";
			//String sql = "insert into Customer values(null,'"+cRef1.name+"','"+cRef1.phone+"', '"+cRef1.email+"', "+cRef1.age+")";
			
			//String sql = "insert into Customer values(null, ?, ?, ?, ?)";
			
			//String sql = "update Customer set name = ?, email = ?, age = ? where cid = ?";
			String sql = "delete from Customer where cid = ?";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			/*pStmt.setString(1, cRef2.name);
			pStmt.setString(2, cRef2.phone);
			pStmt.setString(3, cRef2.email);
			pStmt.setInt(4, cRef2.age);*/
			
			/*pStmt.setString(1, "John Watson");
			pStmt.setString(2, "john.wt@example.com");
			pStmt.setInt(3, 33);
			pStmt.setInt(4, 1);*/
			
			pStmt.setInt(1, 1);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println("Row Deleted: "+i);
			}else{
				System.out.println("Row Deletion Failed: "+i);
			}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}finally{
			try{
				//5. Close the Connection
				if(con!=null){
					con.close();
					System.out.println("--Connection Closed--");
				}
			}catch(Exception e){
				System.out.println("Exception "+e);
			}
		}
		

	}

}
