package com.mysrv.demo;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myserv.dao.StudentDao;
import com.myserv.model.Student;

/**
 * Servlet implementation class semesterSrv
 */
@WebServlet("/semesterSrv")
public class semesterSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public semesterSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
StudentDao dao=new StudentDao();
ArrayList<Student> studentList=  dao.displayStudentsListBySemester(request.getParameter("semester"));//getAllStudents();
HttpSession session= request.getSession();
session.setAttribute("studentList", studentList);
System.out.println(studentList.size());
RequestDispatcher rd= request.getRequestDispatcher("ListOfStudentsToMarkAttendance.jsp");
rd.forward(request, response);
}
}

