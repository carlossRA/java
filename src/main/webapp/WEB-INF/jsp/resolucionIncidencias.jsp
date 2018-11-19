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

	<h2 align="center">Resolución de incidencias</h2>
	<p align="center">
		<b>*Acepte o deniegue la incidencia seleccionada </b>
	</p>
	<input name="idEmpleado" id="dni" value="" style="display: none">
	<input name="mensaje" id="mens" value="" style="display: none">
	<input name="comentario" id="com" value="" style="display: none">
	
	<br><br>
	<div class="col-sm-12 col-xs-12" align="center">
	
	<form action="incidenciasGestorUsuario.htm" method="post" >
	<p>
		<input type="submit" value="Aceptar" id="aceptar" class="btn boton boton-personalizado"></input>
	</p>
		<input name="mensaje" id="mens" value="Aceptada" style="display: none">
		<input name="idEmpleado" id="dni" value="${id}" style="display: none">
		<input name="comentario" id="com" value="${comentario}" style="display: none">
	</form>
	
	<form action="incidenciasGestorUsuario.htm" method="post" >
	<p>
		<input type="submit" value="Denegar" id="denegar" class="btn boton boton-personalizado"></input>
	</p>
		<input name="mensaje" id="mens" value="Denegada" style="display: none">
		<input name="idEmpleado" id="dni" value="${id}" style="display: none">
		<input name="comentario" id="com" value="${comentario}" style="display: none">
	</form>
	</div>
</body>

</html>