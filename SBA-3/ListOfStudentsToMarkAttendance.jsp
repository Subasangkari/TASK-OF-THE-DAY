<%@page import="com.myserv.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body{
background-color:pink;
}
h1{
font-color:black;
font-family:Algerian;
}
td
{
background-color: White;
font-color:Black;
font-family:Bahnschrift Condensed;
}
table{
border:1px;
border-color:black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display students list to mark attendance</title>
</head>
<body>
<center>
<h1>MARK YOUR ATTENDANCE</h1>
</center>
<form action="attendanceSrv">
<center>
<table width="90%">
<tr> <td>Student Id </td> <td>Student Name </td> <td>Attendance</td></tr>
<c:forEach var="student" items="${studentList}">
<tr>
<td><c:out value="${student.getStudent_Id()}"/></td>
<td>${student.getStudent_Name()}</td>
<td><input type="checkbox" name="attendanceStatus" value="${student.getStudent_Id()}"></td>
 </tr>
</c:forEach>
</table>
</center>
<center>
<input type="submit" value="submit Attendance"></center>
</form>
</body>
</html>





