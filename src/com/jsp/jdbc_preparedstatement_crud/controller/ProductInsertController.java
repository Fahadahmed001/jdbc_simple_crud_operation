package com.jsp.jdbc_preparedstatement_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsertController {
	public static void main(String[] args) {
		
		Connection connection=null;
		
		try {
			
			//step 1- load/register driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2- create connection
			
			String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "Fahmed@123";
			
		   connection = DriverManager.getConnection(url, user, pass);
			
			String insertQuery = "insert into product values(?,?,?,?)";
			
			
			//step 3- create statement
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, 102);
			preparedStatement.setString(2, "chair");
			preparedStatement.setDouble(3, 300);
			preparedStatement.setString(4, "Brown");
			
			preparedStatement.execute();
			
			System.out.println("Data-----Stored");
			
		}catch (ClassNotFoundException | SQLException e) {
			
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch (SQLException e) { 
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 	}

}
