package com.myserv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.myserv.dbutil.DBConnection;
import com.myserv.model.Student;

public class StudentDao {
	public String saveStudent(Student student)
	{

	try{ 
	Connection con= DBConnection.getConnect(); 
	String sql="insert into students values(?,?,?,?,?,?)"; 
	PreparedStatement stat=con.prepareStatement(sql);

	stat.setInt(1, student.getStudent_Id());
	stat.setString(2,student.getStudent_Name());
	stat.setFloat(3, student.getSemester());
	stat.setDate(4, new java.sql.Date(student.getStudent_DOB().getTime()));
	stat.setInt(5, student.getStudent_Age());
	stat.setString(6,student.getStudent_Address());

	int res= stat.executeUpdate();
	if(res>0)
	return "student Created";

	}

	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return "cannot create student";
	}
	public ArrayList<Student> getAllStudents()
	{
	try
	{

	Connection con=DBConnection.getConnect();
	String sql="select * from students";

	PreparedStatement stat=con.prepareStatement(sql);
	ResultSet rs= stat.executeQuery();

	ArrayList<Student> studentList=new ArrayList<>();

	while(rs.next())
	{
		 int student_Id = rs.getInt(1) ;
		 String	student_Name = rs.getString(2) ;
		 int semester = rs.getInt(3);
	     Date student_DOB = rs.getDate(4);
	     int student_Age = rs.getInt(5);
	     String	student_Address = rs.getString(6);
		
		Student student=new Student(student_Id,student_Name,semester,student_DOB,student_Age,student_Address);


	studentList.add(student);

	}

	return studentList;

	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return null;
	}

public ArrayList<Student> displayStudentsListBySemester(String sem)
	{
	try
	{
		int semes=Integer.parseInt(sem);
Connection con=DBConnection.getConnect();
	String sql="select *from students where semester="+semes;

	PreparedStatement stat=con.prepareStatement(sql);
	ResultSet rs= stat.executeQuery();
	ArrayList<Student> studentList=new ArrayList<>();

	while(rs.next())
	{
	 int student_Id = rs.getInt(1) ;
	 String	student_Name = rs.getString(2) ;
	 int semester =rs.getInt(3);
     Date student_DOB = rs.getDate(4);
     int student_Age = rs.getInt(5);
     String	student_Address = rs.getString(6);
	
	Student student=new Student(student_Id,student_Name,semester,student_DOB,student_Age,student_Address);

	studentList.add(student);

	}

	return studentList;

	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return null;
	}
}
