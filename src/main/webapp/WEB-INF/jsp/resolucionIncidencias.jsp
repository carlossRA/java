<!DOCTYPE html>
<html>
<head>
<script src=" https://code.jquery.com/jquery.js">
	
</script>
<script
	src=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">
	
</script>
<link rel="stylesheet"
	href=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta http-equiv="content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/estilos.css">
<title>Resolución Incidencias Gestor</title>
</head>
<style>
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

	<input name="idEmpleado" id="dni" value="" style="display: none">
	<input name="mensaje" id="mens" value="" style="display: none">
	<input name="comentario" id="com" value="" style="display: none">

	<form action="incidenciasGestorUsuario.htm" method="post">
	<p>
		<input type="submit" value="Aceptar" id="aceptar"
			onClick="aceptarIncidencia()" class="btn boton-personalizado"></input>
	</p>
		<input name="mensaje" id="mens" value="Aceptada" style="display: none">
		<input name="idEmpleado" id="dni" value="${id}" style="display: none">
		<input name="comentario" id="com" value="${comentario}" style="display: none">
	</form>
	
	<form action="incidenciasGestorUsuario.htm" method="post">
	<p>
		<input type="submit" value="Denegar" id="denegar"
			onClick="denegarIncidencia()" class="btn boton-personalizado"></input>
	</p>
	</form>

</body>

</html>