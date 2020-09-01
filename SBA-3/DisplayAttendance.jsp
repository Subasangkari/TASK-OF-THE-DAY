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
<title>DISPLAY ATTENDANCE</title>
</head>
<body>
<form>
<center>
<table width="90%">
<tr> <td>STUDENT NAME </td> <td>STUDENT ID </td> <td>ATTENDANCE STATUS</td> </tr>
<c:forEach var="attendance" items="${attendanceList}">
<tr>
<td><c:out value="${ attendance.getStudent_Id()}"/></td>
<td>${attendance.getStudent_Name()}</td>
<td>${attendance.getAttendance_Date()}</td>
 </tr>
</c:forEach>
</table>
</center>
</form>


</body>
</html>