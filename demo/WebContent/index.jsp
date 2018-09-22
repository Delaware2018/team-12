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
	<nav class="navbar navbar-expand-lg navbar-light">
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
	
	<div id="page-wrapper" class="container my-5" >
		<div id="featured-items" class="carousel slide" data-ride="carousel">
		<h1>Featured Items</h1>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="d-block w-100"
						width="100"
						height="100"
						src="./img/bed.svg"
						alt="First slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100"
						width="100"
						height="100"
						src="./img/clock.svg"
						alt="Second slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100"
						width="100"
						height="100"
						src="./img/cutlery.svg"
						alt="Third slide">
				</div>
			</div>
			<a class="carousel-control-prev" href="#featured-items"
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
			<!-- Populate cards -->
			<div class="container my-3">
				<div class="card" >
					<div class="card-body">
					
					<div >
						<img src="http://www.goodwill.org/wp-content/uploads/2009/10/bobmay_hs.jpg" style="border-radius: 50%; margin: auto;">
						<br/>
					</div>
						
						<h5 class="card-title">Bob May</h5>
						<h6 class="card-subtitle mb-2 text-muted">#GoodwillStories</h6>
						<p class="card-text">Robert “Bob” May is a veteran of the U.S. armed services and spent a decade homeless, living on riverbanks and wandering along railroad tracks...</p>
						<a class="btn btn-primary" data-toggle="collapse"
							href="#card01" role="button" aria-expanded="false"
							aria-controls="card01">Read More!</a>
						<div class="collapse" id="card01">
							<div class="card card-body bg-light my-3">Robert “Bob” May is a veteran of the U.S. armed services and spent a decade homeless, living on riverbanks and wandering along railroad tracks.  A divorce had triggered severe depression.  He also stopped taking medication for his bi-polar disorder and began drinking heavily and abusing drugs.

One day in 1995, a local organization for American veterans with disabilities discovered May living under a bridge and referred him to the Goodwill Serving Eastern Nebraska and Southwest Iowa in Omaha.  He was initially hired as a custodian and, today, works as an equipment repair technician.  As part of Goodwill’s commercial services program with NISH/AbilityOne, he restores and repairs a wide array of janitorial equipment at Offutt Air Force Base in Nebraska.

In addition to being solely responsible for repairing all janitorial equipment, May’s coworkers rely on him to repair items in a timely manner.  His work literally saves Goodwill thousands of dollars each year in expenses—money that funds Goodwill’s job training programs and career services.  May has the ability to repair almost anything—snow blowers, lawn mowers etc.

“When I repair something, I feel a sense of accomplishment that I was able to help this person,” May said.

Prior to coming to Goodwill, May felt uneasy around people and kept to himself.  Since he joined Goodwill, he has made great strides to overcome his feelings of inadequacy.  He attributes the stability of his Goodwill job for helping him remain sober for more than 14 years.  He often says he is one drink away from living under a bridge and credits his supervisors at Goodwill for keeping him grounded.

In 2004, May suffered a severe knee injury.  After several surgeries and months of physical therapy, May returned to his job at Goodwill.  He will never regain full use of his leg and walks with a cane, but he continues to work hard and maintain a positive attitude.

“Goodwill has given me the opportunity to be all that I can be,” May said.  “Goodwill is my life.  All of my friends are here at Goodwill.”</div>
							<a href="https://twitter.com/intent/tweet?button_hashtag=GoodwillStories&ref_src=twsrc%5Etfw" class="twitter-hashtag-button" data-show-count="false">Tweet #LoveTwitter</a><script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
						</div>
					</div>
				</div>
			</div>
			<div class="container my-3">
				<div class="card" >
					<div class="card-body">
					
					<div >
						<img src="http://www.goodwill.org/wp-content/uploads/2009/09/Candy-Nunez.jpg" style="border-radius: 50%; margin: auto;">
						<br/>
					</div>
						
						<h5 class="card-title">Candy Nunez-Jura</h5>
						<h6 class="card-subtitle mb-2 text-muted">#GoodwillStories</h6>
						<p class="card-text">Alcohol abuse and violence were a part of Candy Nunez-Jura’s childhood. She and her younger sisters would hide in the family car to escape from her father’s abuse. At age 18...</p>
						<a class="btn btn-primary" data-toggle="collapse"
							href="#card02" role="button" aria-expanded="false"
							aria-controls="card02">Read More!</a>
						<div class="collapse" id="card02">
							<div class="card card-body bg-light my-3">Alcohol abuse and violence were a part of Candy Nunez-Jura’s childhood. She and her younger sisters would hide in the family car to escape from her father’s abuse. At age 18, Candy became pregnant and got married. Her new husband was also abusive. After several years and the birth of her second child, Candy left her abusive husband and had a difficult time finding a job and supporting her family as a single mother.

She suffers from dyslexia, therefore, never learned to read or write and struggled with severe arthritis in her hands.

Although she received public assistance, she wanted to work — especially with children with special needs. In 2000, Candy began the START program at Goodwill Industries Serving Eastern Nebraska and Southwest Iowa in Omaha. She filled out applications and searched for a job with the help of an employment specialist. Several months later, Candy applied for an opening in Goodwill’s Commercial Contracts program. The program helps individuals with disabilities excel in employment opportunities in a supportive environment.

Today, she works with high school students with special needs. She takes literacy classes, earns a paycheck and helps support her family which includes her children, four grandchildren and a new husband.

“I have gained a sense of worth and well-being working at Goodwill,” says Candy. “My job at Goodwill has given me the opportunity to work with children with disabilities, something I was told I would never do.”

Candy’s supervisor notes, “Candy has this sense of self-confidence that she did not have when she first came to Goodwill. She is truly a remarkable person.”</div>
							<a href="https://twitter.com/intent/tweet?button_hashtag=GoodwillStories&ref_src=twsrc%5Etfw" class="twitter-hashtag-button" data-show-count="false">Tweet #LoveTwitter</a><script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
						</div>
					</div>
				</div>
			</div>
			<div class="container my-3">
				<div class="card" >
					<div class="card-body">
					
					<div >
						<img src="http://www.goodwill.org/wp-content/uploads/2009/09/successStory_Bennet1.jpg" style="border-radius: 50%; margin: auto;">
						<br/>
					</div>
						
						<h5 class="card-title">James Bennett</h5>
						<h6 class="card-subtitle mb-2 text-muted">#GoodwillStories</h6>
						<p class="card-text">James Bennett dreamed of playing professional basketball. He was a talented player and was scouted by local high schools. But that dream ended in January 2005...</p>
						<a class="btn btn-primary" data-toggle="collapse"
							href="#card03" role="button" aria-expanded="false"
							aria-controls="card03">Read More!</a>
						<div class="collapse" id="card03">
							<div class="card card-body bg-light my-3">James Bennett dreamed of playing professional basketball. He was a talented player and was scouted by local high schools. But that dream ended in January 2005, when he was shot in the head and spine, leaving him with partial paralysis, because he was mistaken for a gang member’s rival.

James spent a month in the hospital and five months in rehabilitation. His school system failed to reassign him to a new school. He sat at home for three years, started using drugs and slipped into depression.

Then, shortly after he turned 18, his mother abandoned James and his younger siblings.

“What I was doing was a dead end,” he says. “I wanted a better life for me and my family.”

James decided to take control of his life. He enrolled in the brain injury program and job training classes at Gulfstream Goodwill Industries (West Palm Beach, FL). He got his first job, opened a bank account, and moved into his own apartment.

Today, James works as a front desk receptionist at the Gulfstream Goodwill and is praised for his customer service skills.

“Goodwill helped put me on the right road,” Bennett says. “I have a future and hope.  It is the best gift I ever got.”</div>
							<a href="https://twitter.com/intent/tweet?button_hashtag=GoodwillStories&ref_src=twsrc%5Etfw" class="twitter-hashtag-button" data-show-count="false">Tweet #LoveTwitter</a><script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>