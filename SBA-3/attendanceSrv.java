package com.mysrv.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.AttendanceDao;
import com.myserv.model.Attendance;

/**
 * Servlet implementation class attendanceSrv
 */
@WebServlet("/attendanceSrv")
public class attendanceSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public attendanceSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
response.setContentType("text/html");
AttendanceDao dao=new AttendanceDao();
	    String[] studentId=request.getParameterValues("attendanceStatus");
	    for(String data:studentId){
	    	int studId=Integer.parseInt(data);
	    	Attendance attendance= new Attendance();
	    	dao.getAttendanceByStudent_Id(studId);
	    	dao.updateAttendance(studId,attendance);
	    }		
	    RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	    rd.forward(request, response);
	    }
		}
	

