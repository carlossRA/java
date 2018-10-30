<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8" import="com.avengers.proyecto.HomeController"%>
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
<title>Home</title>
</head>
<body>

	<h1 align="center">Bienvenido a AvengersLive Web</h1>
	<h3 align="right">
		Usuario:
		<c:out value="${email}" />
	</h3>
	</br>
	<form action="login/home.htm" method="post">
		<input value="Abrir Fichaje" type="submit" name="BtnAbrir">
	</form>	

	<button type="submit">Cerrar Fichaje</button>
	
	<li>Estado: <c:out value="${mensaje}" /></li>
	<form action="login.htm" method="post">
		<input value="Salir" type="submit" name="BtnSalir">
	</form>
</body>
</html>
