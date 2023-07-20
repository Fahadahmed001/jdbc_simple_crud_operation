package com.jsp.jdbc_preparedstatement_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDeleteController {
	public static void main(String[] args) {
Connection connection=null;
		
		try {
			//step-1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create connection
			String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "Fahmed@123";
			
			connection=DriverManager.getConnection(url,user,pass);
			
			//step-3 create statement
			String DeleteColorQuery = "delete from product where productid=?";
			
			PreparedStatement preparedStatement=connection.prepareStatement(DeleteColorQuery);
			
			preparedStatement.setInt(1, 100);
			int a=preparedStatement.executeUpdate();
			
			if(a==1) {
				System.out.println("Data is updated");
			}else {
				System.out.println("Data id is not present");
			}
			
			

			
		} catch (Exception e) {
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

	


