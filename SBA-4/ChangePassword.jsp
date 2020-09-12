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
<link href="css/ForgotPassword.css" rel="stylesheet" type="text/css">
<style type="text/css">
h1{
position:relative;
left:10px;
top:50px;
}
form{
font-size:20;
font-style:bold;
font-family:algerian;
position:relative;
left:5px;
top:100px;
}
</style>
</head>
<body class="container">
<form action="ChangePassword">
<section class="form-dark">
<div class="card card-image"
style=" width: 40rem;">
    <div class="text-white rgba-stylish-strong py-5 px-5 z-depth-4">
      <div class="text-center">
        <h3 class="white-text mb-5 mt-4 font-weight-bold"><strong>Please Provide your details to</strong> <a
            class="green-text font-weight-bold"><strong> Reset Password! </strong></a></h3>
      </div>
<br>
      <div class="md-form">
        <input type="text" name="userId" placeholder="USER ID" id="Form-email5" class="form-control white-text">
        <label for="Form-email5">USER ID</label>
      </div>
<div class="md-form">
<select name="security_question" id="Form-email5" class="form-control white-text">
<option value="-----------------------------">----------------------------------</option>
<option value="Which is your first school?">Which is your first school?</option>
<option value="Which is your birth place?">Which is your birth place?</option>
<option value="Which is your first college?">Which is your first college?</option>
<option value="Which is your first Name?">Which is your first Name?</option>
<option value="Which is your favorite food?">Which is your favorite food?</option>
<option value="Which is your favorite animal?">Which is your favorite animal?</option>
</select>
<label for="Form-email5">SECURITY QUESTION:</label>
</div>

<div class="md-form">
        <input type="text" name="security_answer" placeholder="SECURITY ANSWER" id="Form-email5" class="form-control white-text">
        <label for="Form-email5">SECURITY ANSWER</label>
  </div>
      </div>

      <div class="row d-flex align-items-center mb-4">
        <div class="text-center mb-3 col-md-12">
          <button type="submit" class="btn btn-warning btn-block btn-rounded z-depth-1">Change Password</button><br>     
        </div>
        </div>
           
      
    </div>
  
 </section>
</form>
<!-- <h1>Please Provide your details to change the password!...</h1>
<form class="form-horizontal" action="ChangePassword">
<div class="form-group">
USER ID:<input type="text" name="userId" placeholder="USER ID"><br><br>
SECURITY QUESTION:<select name="security_question">
<option value="-----------------------------">----------------------------------</option>
<option value="Which is your first school?">Which is your first school?</option>
<option value="Which is your birth place?">Which is your birth place?</option>
<option value="Which is your first college?">Which is your first college?</option>
<option value="Which is your first Name?">Which is your first Name?</option>
<option value="Which is your favorite food?">Which is your favorite food?</option>
<option value="Which is your favorite animal?">Which is your favorite animal?</option>
</select><br><br>
SECURITY ANSWER<input type="text" name="security_answer"placeholder="SECURITY ANSWER"><br><br>
<input type="submit" class="btn btn-warning" value="Change Password">
</div>
</form>
 -->
 </body>
</html>