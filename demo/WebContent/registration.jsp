<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registration</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<div id="body-wrapper" class="container containder-fluid my-5">
		<h1>Registration</h1><br>
		<form class="form" method="POST" name="registration-form" action="Registration">
			<div class="form-group">
				<label for="name">Name: </label>
				<input type="text" name="name" id="name" placeholder="name"> 
				<span id="name_err" style="color:red">${name_err!=null? name_err : ''}</span>
			</div>
			<div class="form-group">
				<label for="age">Age: </label>
				<input type="text" name="age" id="age" placeholder="age">
				<span id="age_err" style="color:red">${age_err!=null? age_err : ''}</span>
			</div>
			<%-- <div class="form-group">
				<label for="gender">Gender: </label> <select
					class="form-control" id="gender">
					<option>???</option>
					<option>Male</option>
					<option>Female</option>
				</select>
				<span id="gender_err" style="color:red">${gender_err!=null? gender_err : ''}</span>
			</div> --%>
			<div class="form-group">
				<label for="email">Email: </label>
				<input type="text" name="email" id="email" placeholder="email"> 
				<span id="email_err" style="color:red">${email_err!=null? email_err : ''}</span>
			</div>
			<div class="form-group">
				<label for="phone">Phone: </label>
				<input type="text" name="phone" id="phone" placeholder="phone"> 
				<span id="phone_err" style="color:red">${phone_err!=null? phone_err : ''}</span>
			</div>
			<div class="form-group">
				<label for="zip">Zip: </label>
				<input type="text" name="zip" id="zip" placeholder="zip"> 
				<span id="zip_err" style="color:red">${zip_err!=null? zip_err : ''}</span>
			</div>
			<!-- bottom submit and reset button -->
			<input type="submit" class="btn btn-primary"></input>
			<input type="reset" class="btn btn-outline-danger"></input>
		</form>
	</div>
	

	
	<script>
		var validate = function () {
			console.log('triggered validate function!');
		}
	</script>
</body>
</html>