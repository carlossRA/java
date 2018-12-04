<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8"
	import="com.avengers.proyecto.loginController"%>


<!DOCTYPE html>
<html>
<head>

<link href="src/main/webapp/WEB-INF/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" media="screen">

<script src=" https://code.jquery.com/jquery.js">
	
</script>
<script
	src=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">
	
</script>


<title>Resolucion Incidencias Gestor</title>
</head>
<style>
body {
	/* Aquí el origen de la imagen */
	background-image:
		url(https://i2.wp.com/plagi.es/wp-content/uploads/2016/01/FONDO-Web-2016-OK-1.jpg);
	/* Fijar la imagen de fondo este vertical y
    horizontalmente y centrado */
	background-position: center center;
	/* Esta imagen no debe de repetirse */
	background-repeat: no-repeat;
	/* COn esta regla fijamos la imagen en la pantalla. */
	background-attachment: fixed;
	/* La imagen ocupa el 100% y se reescala */
	background-size: cover;
	/* Damos un color de fondo mientras la imagen está cargando  */
	background-color: #464646;
}

.boton-personalizado {
	text-decoration: none;
	font-weight: 600;
	font-size: 15px;
	color: black;
	padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 40px;
	padding-right: 40px;
	background-color: #c0d6e4;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius: 35px;
	width: 350px;
}

.divCentro1 {
	background-color: rgba(0, 0, 0, 0.8);;
	font-size: 14px;
	border: outset;
	margin: 20px auto 40px auto;
	height: 500px;
	width: 800px;
	overflow: hidden;
	position: relative;
	color: white;
	text-align: center;
	padding: 20px;
}

.divCentro2 {
	background-color: rgba(0, 0, 0, 0.8);;
	font-size: 14px;
	border: outset;
	margin: 20px auto 40px auto;
	height: 350px;
	width: 800px;
	overflow: hidden;
	position: relative;
	color: white;
	text-align: center;
	padding: 20px;
}


</style>

<jsp:include page="menu.jsp" />

<body>
<div class="divCentro1">
<form  name="form" class="form-horizontal">
<fieldset>

         
<legend></legend>


<h2 align="center">Modificacion de datos del empleado</h2>
<br></br>
<div class="form-group">
  <label class="col-md-4 control-label" for="nombre">DNI</label>  
  <div class="col-md-5">
      <input type="text" style="height:30px; width: 700px; align:center;" name="idEmpleado" readonly=”readonly” value= "${dni}"  class="form-control" id="email" >
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="nombre">Nombre y Apellidos</label>  
  <div class="col-md-5">
  <input id="nombree" name="nombre" type="text" style="height:30px; width: 700px;" placeholder="Nombre" class="form-control input-md"  value ="${nombre}" pattern="[A-Za-z ]{1,20}" title="Ej:Jose Luis" required >
    
  </div>
</div>





<div class="form-group">
  <label class="col-md-4 control-label" for="email">Email</label>  
  <div class="col-md-5">
  <input id="email" name="emailEmpleado" type="text" style="height:30px; width: 700px;" placeholder="email@esi.uclm.es" class="form-control input-md" value ="${emailEmpleado}" required>
    
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="enviar"></label>
  <div class="col-md-4">
     <button type="submit" onClick="modificar()"  style="width: 700px;" class="btn boton-personalizado">Editar</button>
  </div>
</div>

</div>


<div class="divCentro2">

</fieldset>

	<h2 align="center">Modificacion de rol del empleado</h2>
	<p align="center">
		<b>*Promocione o deniegue al empleado </b>
	</p>
	<input name="idEmpleado" id="dni" value="" style="display: none">
	<input name="mensaje" id="mens" value="" style="display: none">
	<input name="comentario" id="com" value="" style="display: none">

	<br>
	<br>
	<input name="email" id="email" value="${emailEmpleado}" style="display: none"> 
    <input name="dni" id="email" value="${dni}" style="display: none"> 
	<input name="nombree" id="email" value="${nombr}" style="display: none"> 
    <input name="rol" id="email" value="${rol}" style="display: none"> 
	</form>
	<div  align="center">

		<form action="promocionarEmpleado.htm" method="post">
			
		<p>
				
			<input name="emailEmpleado" id="email" value="${emailEmpleado}" style="display: none"> 
			<input name="rol" id="rol" value="administrador" style="display: none">
			<input class="btn boton-personalizado" type="submit" name="consulta"
			value="Promocionar a administrador" />
		</p>
		</form>

		<form action="promocionarEmpleado.htm" method="post">
			<input name="emailEmpleado" id="email" value="${emailEmpleado}" style="display: none"> 
			<input name="rol" id="rol" value="usuario" style="display: none">
			<p>
			<input class="btn boton-personalizado" type="submit" name="consulta"
			value="Degradar a usuario"  />
				
			</p>
			
		</form>

		<form action="promocionarEmpleado.htm" method="post">
			<input name="emailEmpleado" id="email" value="${emailEmpleado}" style="display: none"> 
			<input name="rol" id="rol" value="gestor" style="display: none">
			<p>
				<input class="btn boton-personalizado" type="submit" name="consulta"
			value="Promocionar a gestor"  />
			</p>
			
		</form>
	</div>
	</div>
</body>
<script>
function modificar(){
	
	document.form.action = "modEmpleado.htm";
}
</script>
</html>