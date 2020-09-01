package com.mysrv.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myserv.dao.AttendanceDao;
import com.myserv.model.Attendance;

/**
 * Servlet implementation class displayAttendanceSrv
 */
@WebServlet("/displayAttendanceSrv")
public class displayAttendanceSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayAttendanceSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
	String attStr= request.getParameter("attendanceDate");
		
		AttendanceDao dao=new AttendanceDao();
		ArrayList<Attendance> attendanceList=  dao.displayAttendanceList(request.getParameter("semester"),attStr);
		HttpSession session= request.getSession();
		session.setAttribute("attendanceList", attendanceList);
		System.out.println(attendanceList.size());
		RequestDispatcher rd= request.getRequestDispatcher("DisplayAttendance.jsp");
		rd.forward(request, response);

	}

}
