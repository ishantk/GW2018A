package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.auribises.model.Customer;

public class JDBCHelper {
	
	Connection con;
	PreparedStatement pStmt;

	public JDBCHelper() {
		
		try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	
	public void createConnection(){
		try {
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/GW2018A";
			String username = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, username, password);
			System.out.println("--Connection Created--");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
	// Create deleteCustomer and updateCustomer methods
	
	public int addCustomer(Customer cRef){
		
		int i = 0;
		
		try {
			//3. Write SQL Statement
			String sql = "insert into Customer values(null, ?, ?, ?, ?)";
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, cRef.name);
			pStmt.setString(2, cRef.phone);
			pStmt.setString(3, cRef.email);
			pStmt.setInt(4, cRef.age);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		return i;
	}
	
	public ArrayList<Customer> queryCustomers(){
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		try {
			
			String sql = "select * from Customer";
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery(); // is to retrieve
			
			while(rs.next()){
				Customer cRef = new Customer();
				cRef.cid = rs.getInt(1);
				cRef.name = rs.getString(2);
				cRef.phone = rs.getString(3);
				cRef.email = rs.getString(4);
				cRef.age = rs.getInt(5);
				//System.out.println(cRef);
				//System.out.println("=========================================");
				
				customerList.add(cRef);
			}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		return customerList;
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
}
