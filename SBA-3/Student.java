package com.myserv.model;

import java.util.Date;

public class Student {   
	 int	student_Id ;
	String	student_Name ;
	 int	semester;
	 Date student_DOB;
	int student_Age;
	 String	student_Address;
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Date getStudent_DOB() {
		return student_DOB;
	}
	public void setStudent_DOB(Date student_DOB) {
		this.student_DOB = student_DOB;
	}
	public int getStudent_Age() {
		return student_Age;
	}
	public void setStudent_Age(int student_Age) {
		this.student_Age = student_Age;
	}
	public String getStudent_Address() {
		return student_Address;
	}
	public void setStudent_Address(String student_Address) {
		this.student_Address = student_Address;
	}
	public Student(int student_Id, String student_Name, int semester, Date student_DOB, int student_Age,
			String student_Address) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.semester = semester;
		this.student_DOB = student_DOB;
		this.student_Age = student_Age;
		this.student_Address = student_Address;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", semester=" + semester
				+ ", student_DOB=" + student_DOB + ", student_Age=" + student_Age + ", student_Address="
				+ student_Address + "]";
	}
	


}
