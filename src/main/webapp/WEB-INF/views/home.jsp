<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src=" https://code.jquery.com/jquery.js ">	
</script>
<script src=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">
</script>
<link rel="stylesheet" href=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta http-equiv="content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/estilos.css">

<title>Home</title>
</head>
<body>

	<div class="container">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarTogglerDemo01"
					aria-controls="navbarTogglerDemo01" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"> </span>
				</button>
				<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
					<a class="navbar-brand" href="#"><FONT COLOR="red">Avengers
							Live</FONT></a>
					<ul class="navbar-nav mr-auto mt-2 mt-lg-0">


					</ul>

				</div>
			</nav>
		</div>

		<div class="row">

			<div class="col-md-3"></div>
			<div class="col-md-7">
				<h1>Acceso usuarios</h1>
			</div>
		</div>

<!-- Acceso de prueba -->
		<div class="card card-container">

			<p
				style="align-content: center; margin: auto; display: table; font-size: 20px; color: grey;">Login</p>
			<form action="loginUsuario" method="post" class="form-signin">
				<span id="reauth-email" class="reauth-email"></span> <input
					type="text" name="inputEmail" class="form-control"
					placeholder="Username" required autofocus> <input
					type="password" name="inputPassword" class="form-control"
					placeholder="Password" required>
				<div id="remember" class="checkbox"></div>
				<button class="btn btn-lg btn-primary btn-block btn-signin"
					type="submit">Sign in</button>
			</form>
			<!-- /form -->
			<div>

				<form action="forgotPassword" method="get">
					<button
						style="align-content: center; margin: auto; display: table;"
						class="btn btn-warning" type="submit" value="forgotPassword"
						name="forgotPassword">¿Olvidó la Contraseña?</button>
				</form>


			</div>
		</div>
	</div>
	<!--  fin de acceso de prueba -->
	
	
	
	<!-- /card-container -->


		<!-- <div class="row">
		<div class="col-md-3">
		 <img src="https://image.ibb.co/cYTOvq/How-To-Get-Rid-Of-Lice-For-Good-300x300.jpg" />
		</div>
		<div class="col-md-7">
			<form>
				<div class="form-group">
					<label for="formGroupExampleInput">Usuario</label> <input
						type="text" class="form-control" id="formGroupExampleInput"
						placeholder="introduzca su correo electrónico">
				</div>
				<div class="form-group">
					<label for="formGroupExampleInput2">Contraseña</label> <input
						type="text" class="form-control" id="formGroupExampleInput2"
						placeholder="introduzca su contraseña">
				</div>
		


		<div class="row">
			<div class="col-md-8"></div>
			<div class="col-md-4">
				<button type="button" class="btn btn-primary btn-lg">
					Acceder</button>
			</div>
			</form>
		</div>
		
	</div> -->


</body>
</html>


