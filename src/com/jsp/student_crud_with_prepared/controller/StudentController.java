package com.jsp.student_crud_with_prepared.controller;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		
		Student student = new Student(100, "vivek", "vivek@gmail.com", 8545662323l);
		
		StudentDao studentDao = new StudentDao();
		
		studentDao.insertStudent(student);
	}
}

