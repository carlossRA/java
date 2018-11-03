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
<title>Home</title>
</head>
<style>	
	html,body {
	  height: 100%;
	  width: 100%;
	  margin: 0;
	  display: flex;
	  flex-direction: column;
	  flex-wrap: wrap;	  
	}
	
	
	.boton-personalizado-4::before, ..boton-personalizado-4::after {
	  content: '';
	  position: absolute;
	  width: 100%;
		height: 100%;
	  bottom: 0;
		left: 0;
		z-index: 1;
	  transition: all 0.3s;
	  border: 1px solid rgba(255, 255, 255, 0.5);
	  color: black;
	}	
	
	.boton-personalizado-4:hover::after, .boton-personalizado-4:hover::before {
	  left: 96px;
	  width: 64px;
	  color: black;
	  animation-iteration-count: infinite;
	  animation-timing-function: linear;
	}
	
	.boton-personalizado-4 {
	text-decoration:none;
	font-weight: 600;
	font-size: 20px;
	color: white;
	padding-top:15px;
	padding-bottom:15px;
	padding-left:40px;
	padding-right:40px;
	background-color:#FFD27D;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius:35px;
	}
	.boton-salir{
	text-decoration:none;
	font-weight: 600;
	font-size: 20px;
	color: white;
	padding-top:15px;
	padding-bottom:15px;
	padding-left:40px;
	padding-right:40px;
	background-color:red;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius:35px;	
	}
</style>
<body>

	<h1 align="center">Bienvenido a AvengersLive Web</h1>
	<h3 style="padding-right: 20px;" align="right">
		Usuario:
		<c:out value="${email}" />
	</h3>
	</br>

	<p>
	<form action="abrirFichaje.htm" method="post" align="center">
		<input class="btn boton-personalizado-4" type="submit" name="abrirFichaje"
			value="Abrir Fichaje" />
	</form>
	</p>
	<p>
	<form action="cerrarFichaje.htm" method="post" align="center">
		<input class="btn boton-personalizado-4" type="submit" name="cerrarFichaje"
			value="Cerrar Fichaje" / align="center">
	</form>
	</p>
	<p>
	<form action="consulta.htm" method="post" align="center">
		<input class="btn boton-personalizado-4" type="submit" name="consulta"
			value="Consulta de Fichajes" />
	</form>
	</p>

	<br></br>
	<p>
	<h4 align="center">
		Estado:
		<c:out value="${mensaje}" />
	</h4>
	</p>
	<form style="padding-left: 20px;" action="login.htm" method="post">
		<input class="btn boton-salir" value="Salir" type="submit" name="BtnSalir">
	</form>
</body>
</html>
