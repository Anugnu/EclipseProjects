<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
		<h2>Hello <%out.print(session.getAttribute("userName"));%></h2>
		
		</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
	</head>
	<body class="landing">

		<!-- Header -->
			<header id="header" class="alt">
			  <h1><a href="user.jsp"><%out.print(session.getAttribute("userName"));%></a></h1>
			</header>



		<!-- Banner -->
			<section id="banner">
				<i class="icon fa-diamond"></i>
				<h3>Hello</h3>
				<h2><%out.print(session.getAttribute("firstName")); %></h2>
				
				<div>
					<h5>Ur Details:</h5>
					<div>
						User Name: <%out.print(session.getAttribute("userName")); %>
					</div>
					
					<div>
						Email: <%out.print(session.getAttribute("lastName")); %>
					</div>
				</div>
				<ul class="actions">
					<a href="logout.jsp">LOGOUT</a>
				</ul>
				
			</section>

		<!-- One -->
		<!-- Two -->
		<!-- Three -->
		<!-- Four -->
		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<ul class="icons">
						<li><a href="#" class="icon fa-facebook">
							<span class="label">Facebook</span>
						</a></li>
						<li><a href="#" class="icon fa-twitter">
							<span class="label">Twitter</span>
						</a></li>
						<li><a href="#" class="icon fa-instagram">
							<span class="label">Instagram</span>
						</a></li>
						<li><a href="#" class="icon fa-linkedin">
							<span class="label">LinkedIn</span>
						</a></li>
					</ul>
					<ul class="copyright">
					  <li>&copy; FRIZZYBLUES.</li>
					  <li>Design: <a href="http://designscrazed.org/">ANEFECIOUZ</a>.</li>
					</ul>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>