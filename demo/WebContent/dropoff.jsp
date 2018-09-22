<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dropoff</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<div id="body-wrapper" class="container containder-fluid my-5">
		<h1 class="display-1">Dropoff</h1>
		<br>
		<form class="form" method="POST" name="dropoff-form" action="Dropoff">
			<div class="form-group">
				<label for="Dropoff">Location: </label> <input type="text"
					name="location" id="location" placeholder="location"> <span
					id="dropoff_err" style="color: red">${dropoff_err!=null? dropoff_err : ''}</span>
			</div>
			<p>Find a location near you on the map!</p>
			<style>
			/* Set the size of the div element that contains the map */
			#map {
				height: 400px; /* The height is 400 pixels */
				width: 100%; /* The width is the width of the web page */
			}
			</style>
			<!--The div element for the map -->
			<div id="map"></div>
			<script>
				// Initialize and add the map
				function initMap() {
					// The location of Uluru
					var uluru = {
						lat : 39.730013,
						lng : -75.5995241
					};
					// The map, centered at Uluru
					var map = new google.maps.Map(document
							.getElementById('map'), {
						zoom : 9,
						center : uluru
					});
					// The marker, positioned at Uluru
					var marker = new google.maps.Marker({
						position : uluru,
						map : map
					});
				}
			</script>
			<script async defer
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC_IJBX8MCB2mdSWqRP6_cITtakFV3w_aM&callback=initMap">
			</script>
			<!-- bottom submit and reset button -->
			<input type="submit" class="btn btn-primary"></input> <input
				type="reset" class="btn btn-outline-danger"></input>
		</form>
	</div>
</body>
</html>