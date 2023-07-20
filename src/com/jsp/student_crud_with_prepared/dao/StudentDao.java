package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {
	Connection connection = StudentConnection.getStudentConnection();
	
	/*
	 * insertMethod for student
	 */
	public Student insertStudent(Student student) {
		String insertQuery = "insert into student values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, student.getStudentid());
			preparedStatement.setString(2, student.getStudentname());
			preparedStatement.setString(3, student.getStudentemail());
			preparedStatement.setLong(4, student.getStudentphone());
			
			
			preparedStatement.execute();
			return student;
			
		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
