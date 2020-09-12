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
<link href="css/ChangePassword.css" rel="stylesheet" type="text/css">
<style type="text/css">
h1{
position:relative;
right:20px;
top:50px;
}
form{
font-size:20;
font-style:bold;
font-family:algerian;
position:relative;
left:800px;
top:50px;
}
</style>
</head>
<body class="container">
<form  action="CheckPassword">
<section class="form-dark">
<div class="card card-image"
style=" width: 40rem;">
    <div class="text-white rgba-stylish-strong py-5 px-5 z-depth-4">
      <div class="text-center">
        <h3 class="white-text mb-5 mt-4 font-weight-bold"><strong>Please Provide your details to</strong> <a
            class="green-text font-weight-bold"><strong> Update Password! </strong></a></h3>
      </div>

      <div class="md-form">
        <input type="hidden"  name="userId" value="${userId}" placeholder="USER ID" id="Form-email5" class="form-control white-text">
        <label for="Form-email5">USER ID</label>
      </div>

      <div class="md-form pb-3">
        <input type="password" name="password" placeholder="PASSWORD"id="Form-pass5" class="form-control white-text">
        <label for="Form-pass5">PASSWORD</label>
        <div class="form-check my-4">
 <div class="md-form pb-3">
        <input type="password" name="confirmPassword" placeholder="CONFIRM PASSWORD"id="Form-pass5" class="form-control white-text">
        <label for="Form-pass5">CONFIRM PASSWORD</label>
        <div class="form-check my-4">
 
 
 </div>
      </div>
      <div class="row d-flex align-items-center mb-4">
        <div class="text-center mb-3 col-md-12">
          <button type="submit" class="btn btn-success btn-block btn-rounded z-depth-1">Update Password</button><br>
        </div>
        </div>
           
      
    </div>
  </div>
 
</section>
</body>
</html>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script type="text/javascript">
function pwdvalidate(){
	var pwd=document.getElementById('pwd').value;
	var isCaps=false;
	var isNum=false;
	var isSmall=false;
	var isSpl=false;
	if(pwd.length<16){
		return false;
	}
	else{
		for(i=0;i<pwd.length;i++){
			if(pwd[i]>='A'&&pwd[i]<='Z'){
				isCaps=true;
				break;
			}
		}
		for(i=0;i<pwd.length;i++){
			if(pwd[i]>='a'&&pwd[i]<='z'){
				isSmall=true;
				break;
			}
		}
		for(i=0;i<pwd.length;i++){
			if(!(pwd[i]>='a'&&pwd[i]<='z')||(pwd[i]>='0'&&pwd[i]<='9')||(pwd[i]>='A'&&pwd[i]<='Z')){
				isSpl=true;
				break;
			}
		}
		if(isNum && isCaps && isSmall && isSpl){
			alert('password accepted');
			return true;
		}
		else{
			alert('Invalid password');
			return false;
		}
	}
}
</script>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/main.css" rel="stylesheet" type="text/css">
<style type="text/css">
h1{
position:relative;
left:20px;
top:50px;
}
form{
font-size:20;
font-style:bold;
font-family:algerian;
position:relative;
left:20px;
top:100px;
}
</style>

</head>
<body class="container">
<h1>Please provide your details to update the password!...</h1>
<form class="form-horizontal" action="CheckPassword">
<div class="form-group">
USER ID:<input type="text" name="userId" placeholder="USER ID"><br><br>
PASSWORD:<input type="password" name="password" id="pwd" placeholder="PASSWORD"><br><br>
CONFIRM PASSWORD:<input type="password" name="confirmPassword" placeholder="CONFIRM PASSWORD"><br><br>
<input type="submit" value="Change Password" class="btn btn-success" onclick="pwdvalidate()">
</div>
</form>
</body>
</html> --%>