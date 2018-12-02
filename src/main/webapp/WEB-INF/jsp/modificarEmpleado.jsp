<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8"
	import="com.avengers.proyecto.loginController"%>
<!DOCTYPE html>
<html>
<head>
<script src=" https://code.jquery.com/jquery.js ">
	
</script>
<script type="text/javascript"
	src=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">
	
</script>
<link rel="stylesheet" href="css/estilos.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<title>Resolución Incidencias Gestor</title>
</head>
<style>
html, body {
	height: auto;
	width: 100%;
	margin: 0;
	display: flex;
	flex-direction: column;
	flex-wrap: wrap;
}

.boton-personalizado {
	text-decoration: none;
	font-weight: 600;
	font-size: 20px;
	color: white;
	padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 40px;
	padding-right: 40px;
	background-color: #FFD27D;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius: 35px;
}
</style>
<body>

	<h2 align="center">Modificación de rol del empleado</h2>
	<p align="center">
		<b>*Promocione o deniegue al empleado </b>
	</p>
	<input name="idEmpleado" id="dni" value="" style="display: none">
	<input name="mensaje" id="mens" value="" style="display: none">
	<input name="comentario" id="com" value="" style="display: none">

	<br>
	<br>
	<div class="col-sm-12 col-xs-12" align="center">

		<form action="promocionarEmpleado.htm" method="post">
			<p>
				<input type="submit" value="Promocionar a admin" id="promocionar"
					class="btn boton boton-personalizado"></input>
			</p>			
			<input name="emailEmpleado" id="email" value="${emailEmpleado}" style="display: none"> 
			<input name="rol" id="rol" value="Administrador" style="display: none">
		</form>

		<form action="promocionarEmpleado.htm" method="post">
			<p>
				<input type="submit" value="Degradar a usuario" id="degradar"
					class="btn boton boton-personalizado"></input>
			</p>
			<input name="emailEmpleado" id="email" value="${emailEmpleado}" style="display: none"> 
			<input name="rol" id="rol" value="Usuario" style="display: none">
		</form>
		
		<form action="promocionarEmpleado.htm" method="post">
			<p>
				<input type="submit" value="Promocionar a gestor" id="degradar"
					class="btn boton boton-personalizado"></input>
			</p>
			<input name="emailEmpleado" id="email" value="${emailEmpleado}" style="display: none"> 
			<input name="rol" id="rol" value="Gestor" style="display: none">
		</form>
	</div>
</body>

</html>