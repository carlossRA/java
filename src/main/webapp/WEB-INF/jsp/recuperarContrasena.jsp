<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8"
	import="com.avengers.proyecto.loginController"%>
<!DOCTYPE html>
<html>
<head>
<script src=" https://code.jquery.com/jquery.js ">
	
</script>
<script
	src=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">
	
</script>
<link rel="stylesheet" href="css/estilos.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<title>Recuperar contraseña</title>
</head>

<style>
.body {
	margin: 0;
	color: #6a6f8c;
	background: #c8c8c8;
	font: 600 16px/18px 'Open Sans', sans-serif;
}

*, :after, :before {
	box-sizing: border-box
}

.clearfix:after, .clearfix:before {
	content: '';
	display: table
}

.clearfix:after {
	clear: both;
	display: block
}

.a {
	color: inherit;
	text-decoration: none
}

.login-wrap {
	width: 100%;
	margin: auto;
	max-width: 525px;
	min-height: 670px;
	position: relative;
	background:
		url(https://raw.githubusercontent.com/khadkamhn/day-01-login-form/master/img/bg.jpg)
		no-repeat center;
	box-shadow: 0 12px 15px 0 rgba(0, 0, 0, .24), 0 17px 50px 0
		rgba(0, 0, 0, .19);
}

.login-html {
	width: 100%;
	height: 100%;
	position: absolute;
	padding: 90px 70px 50px 70px;
	background: rgba(40, 57, 101, .9);
}

.login-html .sign-in, .login-html .sign-up, .login-form .group .check {
	display: none;
}

.login-html .tab, .login-form .group .label, .login-form .group .button
	{
	text-transform: uppercase;
}

.login-html .tab {
	font-size: 22px;
	margin-right: 15px;
	padding-bottom: 5px;
	margin: 0 15px 10px 0;
	display: inline-block;
	border-bottom: 2px solid transparent;
}

.login-html .sign-in:checked+.tab, .login-html .sign-up:checked+.tab {
	color: #fff;
	border-color: #1161ee;
}

.login-form {
	min-height: 345px;
	position: relative;
	perspective: 1000px;
	transform-style: preserve-3d;
}

.login-form .group {
	margin-bottom: 15px;
}

.login-form .group .label, .login-form .group .input, .login-form .group .button
	{
	width: 100%;
	color: #fff;
	display: block;
}

.login-form .group .input, .login-form .group .button {
	border: none;
	padding: 15px 20px;
	border-radius: 25px;
	background: rgba(255, 255, 255, .1);
}

.login-form .group input[data-type="password"] {
	text-security: circle;
	-webkit-text-security: circle;
}

.login-form .group .label {
	color: #aaa;
	font-size: 12px;
}

.login-form .group .button {
	background: #1161ee;
}

.login-form .group label .icon {
	width: 15px;
	height: 15px;
	border-radius: 2px;
	position: relative;
	display: inline-block;
	background: rgba(255, 255, 255, .1);
}

.login-form .group label .icon:before, .login-form .group label .icon:after
	{
	content: '';
	width: 10px;
	height: 2px;
	background: #fff;
	position: absolute;
	transition: all .2s ease-in-out 0s;
}

.login-form .group label .icon:before {
	left: 3px;
	width: 5px;
	bottom: 6px;
	transform: scale(0) rotate(0);
}

.login-form .group label .icon:after {
	top: 6px;
	right: 0;
	transform: scale(0) rotate(0);
}

.login-form .group .check:checked+label {
	color: #fff;
}

.login-form .group .check:checked+label .icon {
	background: #1161ee;
}

.hr {
	height: 2px;
	margin: 60px 0 50px 0;
	background: rgba(255, 255, 255, .2);
}

.foot-lnk {
	text-align: center;
}




<!--HEADER -->

@import
	url("https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css")
	;

html, body {
	padding: 0px;
	margin: 0px;
	width: 100%;
}

.wrapper {
	width: 100%;
	height: auto;
	padding: 0;
	margin: 0;
	overflow: hidden;
	min-height: 100px;
}

header {
	width: 100%;
	height: 80px;
	color: #fff;
	background: #1161ee;
	line-height: 80px;
	position: relative;
	top: 0;
	transition: all 0.5s ease;
	box-shadow: 0px 2px 10px #fff inset;
}

.container {
	width: 100%;
	max-width: 1024px;
	margin: 0 auto;
}

#logo {
	font-family: ubuntu;
	font-size: 40px;
	float: left;
}

nav {
	float: right;
	font-family: ubuntu;
}

nav a {
	color: #fff;
	text-decoration: none;
	font-size: 18px;
	margin: 0 15px;
}

nav a:hover {
	color: red;
}

header.stivky {
	background: rgba(211, 84, 0, 0.9);
	height: 50px;
	line-height: 50px;
	box-shadow: 0px 2px 10px #000;
}

header .stivky #logo {
	font-size: 22px;
}

#scrollToTop {
	font-size: 3em;
	color: #446cB3;
	position: fixed;
	right: 40px;
	bottom: 10%;
	transition: all 0.5s ease;
}

#scrollToTop:hover {
	transform: scale(1.1, 1.1);
	color: rgba(211, 84, 0, 0.9);
}

.hide {
	transition: all 0.5s ease;
	transform: scale(0, 0);
}
</style>


<body>


		<!-- HEADER -->
		<div class="wrapper">
			<header>
				<div class="container">
					<div id="logo">Avengers Live</div>

				</div>
			</header>

		</div>


<div style="background:#1161ee; background-color:transparent">
		<p></p>

		<!-- LOGIN -->
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
					for="tab-1" class="tab">Recuperar contraseña</label>

				<form action="enviarPeticionContrasena.htm" method="post" class="login-form">
					<div class="sign-in-htm">
						<div class="group">
							<label for="user" class="label">Introduzca EMAIL o DNI</label> 
							<input id="user" type="text" name="inputEmail" class="input" required autofocus>
						</div>

						<div class="group">
							<input type="submit" class="button" name="enviarPeticion" value="Recuperar contraseña">
						</div>				 
					</div>

				</form>
				
				<div class="foot-lnk">
							<a href="login.htm">Iniciar sesión</a>
				</div>
			</div>
		</div>	
	</div>



</body>

</html>