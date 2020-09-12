<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/main.css" rel="stylesheet" type="text/css">
<style type="text/css">
body{
font-color:white;
}
h1{
font-color:white;
position:relative;
left:20px;
top:50px;
}
form{
font-size:20;
font-style:bold;
font-family:algerian;
font-color:white;
position:relative;
left:10px;
top:50px;
}
</style> 
<title>Home</title>
</head>
<form  action="validateUser">
<section class="form-dark">
<div class="card card-image"
style=" width: 40rem;">
    <div class="text-white rgba-stylish-strong py-5 px-5 z-depth-4">
      <div class="text-center">
        <h3 class="white-text mb-5 mt-4 font-weight-bold"><strong>WELCOME TO</strong> <a
            class="green-text font-weight-bold"><strong> DXC TECHNOLOGY </strong></a></h3>
      </div>

      <div class="md-form">
        <input type="text" name="userId" placeholder="USER ID" id="Form-email5" class="form-control white-text">
        <label for="Form-email5">USER ID</label>
      </div>
 <div class="md-form pb-3">
        <input type="password" name="password" placeholder="PASSWORD"id="Form-pass5" class="form-control white-text">
        <label for="Form-pass5">PASSWORD</label>
        <div class="form-check my-4">
       
          <input class="form-check-input" type="checkbox" value="" id="defaultCheck17">
          <label class="form-check-label white-text" for="defaultCheck17">Accept the<a href="#"
              class="green-text font-weight-bold"> Terms and Conditions</a></label>
        </div>
      </div>
    
      <div class="row d-flex align-items-center mb-4">
        <div class="text-center mb-3 col-md-12">
          <button type="submit" class="btn btn-success btn-block btn-rounded z-depth-1">Sign in</button><br>

          <p class="font-small-white-text d-flex justify-content-center">Forgot Password?<a href="ForgotPassword" class="text-danger ml-1 font-weight-bold">click here</a></p>

<p class="font-small white-text d-flex justify-content-center">Have an account? <a href="New User"
            class="green-text ml-1 font-weight-bold"> Log in</a></p>
     
        </div>
        </div>
           
      
    </div>
  </div>
 
</section>

<!-- <body class="container">
<h1>Welcome to DXC Technology!</h1>
<form class="form-horizontal"  action="validateUser">
<div class="form-group">
<label class="control-label col-sm-0.5" for="userId">USER ID:</label><input type="text" name="userId" placeholder="USER ID"><br><br><br>
<label class="control-label col-sm-0.5" for="password">PASSWORD:</label><input type="password" name="password" placeholder="PASSWORD"><br><br><br>
<input type="submit" class="btn btn-primary" value="LOGIN"><br><br>
<a href="ForgotPassword" class="text-danger">FORGOT PASSWORD?</a>
<br><br><a href="New User" class="text-primary">NEW USER?REGISTER HERE!</a>
</div>
</form> -->
</form>
</body>
</html>