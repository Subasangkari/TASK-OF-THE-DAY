<%@page import="java.util.Date"%>
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
<title>Insert title here</title>
</head>
<body>
<center>
<form action="displayAttendanceSrv">
SELECT DATE TO DISPLAY ATTENDANCE:<input type="date" name="attendanceDate">
<br>
<br>
<br>
SELECT SEMESTER TO DISPLAY ATTENDANCE:<select name="semester">
<option>-------------------</option>
<option value="1">SEMESTER-1</option>
<option value="2">SEMESTER-2</option>
<option value="3">SEMESTER-3</option>
<option value="4">SEMESTER-4</option>
<option value="5">SEMESTER-5</option>
</select>
<br>
<br>
<br>
<input type="submit" value="Display Attendance">

</form>
</center>
</body>
</html>