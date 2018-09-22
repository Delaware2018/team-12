<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Donate</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<div id="body-wrapper" class="container containder-fluid my-5">
		<h1 class="display-1">Donate</h1>
		<form class="form" method="POST" name="donate-form" action="Donate">
			<button name="pickup" type="button" class="btn btn-primary btn-lg btn-block my-5">Pickup</button>
			<button name="dropoff" type="button" class="btn btn-danger btn-lg btn-block my-5">Dropoff</button>
		</form>
	</div>
</body>
</html>