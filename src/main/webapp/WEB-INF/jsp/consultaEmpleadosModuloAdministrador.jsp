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
<title>Interfaz de consulta de empleados del módulo para el
	administrador</title>
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

	<h2 align="center">Listado de empleados</h2>
	
	<br>
	<form name="normal" method="post">
		<table align="center" border="1" width=60%>
			<thead bgcolor="#FFFD86">
				<tr>
					<th width="30">DNI</th>
					<th width="30">Email</th>
					<th width="30">Nombre</th>
					<th width="30">Rol</th>
				</tr>
			</thead>
			<tbody bgcolor="#FFD27D">
				<c:forEach items="${Empleados}" var="proyecto">
					<tr>
						<td>${proyecto.dni}</td>
						<td>${proyecto.email}</td>
						<td>${proyecto.nombre}</td>
						<td>${proyecto.rol}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
	<p>
	<form action="direccionAltaEmpleado.htm" method="post" >
		<input class="btn boton-personalizado" type="submit"
			name="darAltaEmpleado" value="Dar de alta" />
	</form>
	
	</p>
</body>
</html>