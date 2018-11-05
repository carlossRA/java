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
<title>Cambiar contraseña</title>
</head>
<body>
	<h2 style="padding-center: 20px;" align="center">Cambio de
		contraseña</h2>



	<form action="cambiarContrasena.htm" method="post">
		<p align="center">
			<input type="password" name="inputContrasena"
				placeholder="Contraseña actual" required autofocus> <input
				type="password" name="inputContrasenaNueva1"
				placeholder="Nueva contraseña" required> <input
				type="password" name="inputContrasenaNueva2"
				placeholder="Repetir nueva contraseña" required>
		</p>

		<input class="btn btn-success" type="submit" name="cambioContrasena"
			value="Cambiar Contraseña" />
		
		<h4 align="center">
			Estado:
			<c:out value="${mensaje}" />
		</h4>
	</form>
	
	<!--  
	<form action="home.htm" method="post">
			<input class="btn btn-success" type="submit" name="atras"
				value="Atrás" />
	</form>
	-->

</body>
</html>