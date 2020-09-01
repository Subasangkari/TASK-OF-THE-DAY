<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Attendance Portal</title>
</head>
<body>
<center>
<h1>WELCOME TO ATTENDANCE PORTAL</h1>
<form action="semester.jsp">
<input type="submit" value="Mark attendance">
</form>
<br>
<br>
<form action="SelectDateToDisplayAttendance.jsp">
<input type="submit" value="Display attendance">
</form>
</center>
</body>
</html>