<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
	
</head>
<body class="container">
<center>
<h1>Welcome to DXC Technology!</h1>
<div class="table-striped">
<table width="90%">
<tr> <td><h4>USER NAME</h4> </td> <td><h4>USER ID</h4> </td> <td><h4>PASSWORD</h4></td> <td><h4>SECURITY QUESTION</h4></td> <td><h4>SECURITY ANSWER</h4></td> </tr>
<c:forEach items="${DxcUsers}" var="dxcuser">
<tr>
<td>${dxcuser.userName}</td>
<td>${dxcuser.userId}</td>
<td>${dxcuser.password}</td>
<td>${dxcuser.security_question}</td>
<td>${dxcuser.security_answer}</td>

</tr>
</c:forEach>

</table>
</div>
</center>
</body>
</html>