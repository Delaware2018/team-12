<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registration</title>
</head>
<body>
	<div class="body-wrapper">
		<form class="form" method="POST" name="registration-form">
			<div class="form-group">
				<label for="name">Name: </label>
				<input type="text" name="name" id="name" placeholder="name"> 
			</div>
			<div class="form-group">
				<label for="age">Age: </label>
				<input type="text" name="age" id="age" placeholder="age"> 
			</div>
			<div class="form-group">
				<label for="gender">Gender: </label> <select
					class="form-control" id="gender">
					<option>???</option>
					<option>Male</option>
					<option>Female</option>
				</select>
			</div>
			<div class="form-group">
				<label for="name">Email: </label>
				<input type="text" name="email" id="email" placeholder="email"> 
			</div>
			<div class="form-group">
				<label for="name">Phone: </label>
				<input type="text" name="phone" id="phone" placeholder="phone"> 
			</div>
			<div class="form-group">
				<label for="name">Zip: </label>
				<input type="text" name="zip" id="zip" placeholder="zip"> 
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