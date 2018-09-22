<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Home - Goodwill Delaware</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	
	<!-- <nav class="navbar navbar-light bg-light"> -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<span class="navbar-brand mb-0 h1"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Goodwill_Industries_Logo.svg/200px-Goodwill_Industries_Logo.svg.png" width="30" height="30" class="d-inline-block align-top">   Goodwill Delaware</span>
		<a class="navbar-brand"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="home.jsp">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="donate.jsp">Donate</a>
				<!-- Pickup/Dropoff -->
				</li>
				<li class="nav-item"><a class="nav-link" href="profile.jsp">Profile</a></li>
				<li class="nav-item"><a class="nav-link" href="about.jsp">About</a>
				</li>
			</ul>
		</div>
	</nav>
	
	<div id="page-wrapper" class="container" style="border: 1px solid red;">
		<div id="featured-items" class="carousel slide" data-ride="carousel">
		<h1>Featured Items</h1>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="d-block w-100"
						width="100"
						height="100"
						src="../../ui/img/icons/bed.svg"
						alt="First slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100"
						width="100"
						height="100"
						src="../../ui/img/icons/clock.svg"
						alt="Second slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100"
						width="100"
						height="100"
						src="../../ui/img/icons/cutlery.svg"
						alt="Third slide">
				</div>
			</div>
			<a class="carousel-control-prev" href="#featured-vitems"
				role="button" data-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="carousel-control-next"
				href="#featured-items" role="button" data-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<div>
			<h1>Goodwill Stories</h1>
		</div>
	</div>
	

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>