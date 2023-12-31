package com.jsp.jdbc_preparedstatement_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdateController {
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
			String UpdateColorQuery = "update product set productcolor = ? where productid=?";
			
			PreparedStatement preparedStatement=connection.prepareStatement(UpdateColorQuery);
			
			preparedStatement.setString(1,"white");
			preparedStatement.setInt(2, 100);
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
