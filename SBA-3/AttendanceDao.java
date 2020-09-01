package com.myserv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.myserv.dbutil.DBConnection;
import com.myserv.model.Attendance;


public class AttendanceDao {
	public String saveAttendance(Attendance attendance)
	{

	try{ 
	Connection con= DBConnection.getConnect(); 
	String sql="insert into attendance values(?,?,?,?,?)"; 
	PreparedStatement stat=con.prepareStatement(sql);

	stat.setString(1, attendance.getStudent_Name());
	stat.setInt(2,attendance.getStudent_Id());
	stat.setInt(3, attendance.getSemester());
	stat.setDate(4, new java.sql.Date(attendance.getAttendance_date().getTime()));
	stat.setString(5, attendance.getAttendance_Status());
	
	int res= stat.executeUpdate();
	if(res>0)
	return "Attendance Created";

	}

	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return "cannot create Attendance";
	}
	
public Attendance getAttendanceByStudent_Id(int studentId){
		try
		{
		Connection con= DBConnection.getConnect(); 
			
		String sql="select * from attendance where student_Id="+studentId;
		PreparedStatement stat=con.prepareStatement(sql);
ResultSet rs= stat.executeQuery();
		if(rs.next())
		{
        String student_Name=rs.getString(1);
        int student_Id=rs.getInt(2);
        int semester=rs.getInt(3);
        Date attendance_Date=rs.getDate(4);
        String attendance_Status=rs.getString(5);
		Attendance attendance=new Attendance(student_Name,student_Id,semester,attendance_Date,attendance_Status);
		return attendance;
		}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return null;
		}

public int updateAttendance(int studentId,Attendance attendance){
try
{
Connection con= DBConnection.getConnect(); 
Attendance existingAttendance= getAttendanceByStudent_Id(studentId);
String sql="update attendance set attendance_Status='PRESENT' where student_Id="+studentId;
PreparedStatement stat=con.prepareStatement(sql);
existingAttendance.setAttendance_Status("PRESENT");
System.out.println("\nExecuting"+sql);
int res= stat.executeUpdate();
if(res>0){
return res;
}
}
catch (Exception e) {
e.printStackTrace();
}
return 0;
}

public ArrayList<Attendance> displayAttendanceList(String sem,String attendanceDate)
	{
	int semes=Integer.parseInt(sem);
	System.out.println(attendanceDate);
	System.out.println(semes);
	try
	{
Connection con=DBConnection.getConnect();
	String sql="select *from attendance where semester="+semes+" and attendance_Date=to_date('"+attendanceDate+"','yyyy-mm-dd')";
 	PreparedStatement stat=con.prepareStatement(sql);
	System.out.println("\nExecuting"+sql);
	
	ResultSet rs= stat.executeQuery();
	ArrayList<Attendance> attendanceList=new ArrayList<>();

	while(rs.next())
	{
        String student_Name=rs.getString(1);
        int student_Id=rs.getInt(2);
        int semester=rs.getInt(3);
        Date attendance_Date=rs.getDate(4);
        String attendance_Status=rs.getString(5);
		Attendance attendance=new Attendance(student_Name,student_Id,semester,attendance_Date,attendance_Status);
	attendanceList.add(attendance);
	}
	return attendanceList;
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return null;
	}


}
