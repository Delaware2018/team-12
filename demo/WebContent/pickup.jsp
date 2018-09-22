<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<div id="body-wrapper" class="container containder-fluid my-5">
		<h1 class="display-1">Pickup</h1><br>
		<form class="form" method="POST" name="pickup-form" action="Pickup">
			<div class="form-group">
				<label for="Address">Address: </label>
				<input type="text" name="address" id="address" placeholder="address">
				<span id="address_err" style="color:red">${address_err!=null? address_err : ''}</span>
			</div>
			<!-- bottom submit and reset button -->
			<input type="submit" class="btn btn-primary"></input>
			<input type="reset" class="btn btn-outline-danger"></input>
		</form>
	</div>

</body>
</html>