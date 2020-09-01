package com.myserv.model;

import java.util.Date;

public class Attendance {
String student_Name;
int	student_Id;
int	semester;
Date attendance_date;
String	attendance_Status;
public String getStudent_Name() {
	return student_Name;
}
public void setStudent_Name(String student_Name) {
	this.student_Name = student_Name;
}
public int getStudent_Id() {
	return student_Id;
}
public void setStudent_Id(int student_Id) {
	this.student_Id = student_Id;
}
public int getSemester() {
	return semester;
}
public void setSemester(int semester) {
	this.semester = semester;
}
public Date getAttendance_date() {
	return attendance_date;
}
public void setAttendance_date(Date attendance_date) {
	this.attendance_date = attendance_date;
}
public String getAttendance_Status() {
	return attendance_Status;
}
public void setAttendance_Status(String attendance_Status) {
	this.attendance_Status = attendance_Status;
}
public Attendance(String student_Name, int student_Id, int semester, Date attendance_date, String attendance_Status) {
	super();
	this.student_Name = student_Name;
	this.student_Id = student_Id;
	this.semester = semester;
	this.attendance_date = attendance_date;
	this.attendance_Status = attendance_Status;
}
public Attendance() {
	
}
@Override
public String toString() {
	return "Attendance [student_Name=" + student_Name + ", student_Id=" + student_Id + ", semester=" + semester
			+ ", attendance_date=" + attendance_date + ", attendance_Status=" + attendance_Status + "]";
}

}
