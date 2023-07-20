package com.jsp.student_crud_with_prepared.dto;

/*
 * Author@ Fahad Ahmeds
 */

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhone;
	
	public Student(int studentid, String studentname, String studentemail, long studentphone)
	{
		super();
		this.studentId=studentid;
		this.studentName=studentname;
		this.studentEmail=studentemail;
		this.studentPhone=studentphone;
	}
	
	public void setId(int studentid) {
		this.studentId = studentid;
	}
	public void setName(String studentname) {
		this.studentName = studentname;
	}
	public void setEmail(String studentemail) {
		this.studentEmail = studentemail;
	}
	public void setPhone(long studentphone) {
		this.studentPhone = studentphone;
	}
	public int getStudentid() {
		return studentId;
	}
	public String getStudentname() {
		return studentName;
	}
	public String getStudentemail() {
		return studentEmail;
	}
	public long getStudentphone() {
		return studentPhone;
	}
	
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
	@Override
	public String toString() {
		return "";
	}

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		
	}



}
