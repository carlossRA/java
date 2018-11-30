<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
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
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
  $( function() {
    $( "#datepickerInicio" ).datepicker({
    	dateFormat: 'dd/mm/yy'
    });
    $( "#datepickerFin" ).datepicker({
    	dateFormat: 'dd/mm/yy'
    });
  } );
  </script>
<title>Consulta Incidencias Gestor</title>
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

.boton-salir {
	text-decoration: none;
	font-weight: 600;
	font-size: 20px;
	color: white;
	padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 40px;
	padding-right: 40px;
	background-color: red;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius: 35px;
}

tr:hover {
	background-color: #D5D5D5;
}

table {
	font-size: 15px;
	width: 50%;
	height: 150px;
	text-align: center;
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

.boton-resolver {
	text-decoration: none;
	font-weight: 600;
	font-size: 20px;
	color: white;
	padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 40px;
	padding-right: 40px;
	background-color: green;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius: 35px;
}

.boton-salir {
	text-decoration: none;
	font-weight: 600;
	font-size: 20px;
	color: white;
	padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 40px;
	padding-right: 40px;
	background-color: red;
	border-color: #d8d8d8;
	border-width: 3px;
	border-style: solid;
	border-radius: 35px;
}

p.rounded {
	border: 1px solid #EAEAEA;
	width: 100;
	heigth: 1000;
	border-radius: 5px;
	color: #000000;
	-webkit-box-sizing: border-box;
}
.select {
	background: white;
	border: outset;
	font-size: 14px;
	height: 30px;
	padding: 5px;
	width: 250px;
}

.select:focus {
	outline: none;
}
</style>
<body>
	<p>
	<h2 align="center">Listado de incidencias</h2>
	</p>

	<p align="center">
		<b>*Seleccione una fila haciendo click sobre ella y después, pulse
			el botón "Consultar" para mostrar la información más detallada </b>
	</p>

	<form action="filtro.htm" method="post">
		<p align="center" >
			<br>
			<b>Filtros</b> 
			<br><br>
			DNI 
			<input type="text" name="filtroDni">
			Email 
			<input type="text" name="filtroEmail"> 
			Fecha Inicio 
			<input type="text" id="datepickerInicio" name="filtroFechaInicio" onChange="copiar()"> 
			Fecha Fin 
			<input type="text" name="filtroFechaFin" id="datepickerFin"> 
			<br><br> 
			Tipo de Incidencia
			
			<select name="tipoIncidencia" class="select select:focus">
				<option></option>
				<option value="Vacaciones">Solicitar vacaciones</option>
				<option value="Bajas Medicas">Comunicar bajas médicas</option>
				<option value="Ausencias">Justificar ausencias</option>
				<option value="Errores">Comunicar errores en el marcaje</option>
			</select>
			
			Estado
			
				<select name="filtroEstado" class="select select:focus">
					<option></option>
					<option value="En espera">En espera</option>
					<option value="Resuelta">Resuelta</option>
				</select>
		<br>
		<br> <input class="btn" type="submit" value="Filtrar">
		</p>
	</form>

	<form name="normal" method="post">
		<table align="center" border="1" id="tab">
			<thead bgcolor="#FFFD86">
				<tr>
					<th width="30">DNI</th>
					<th width="30">Email</th>
					<th width="30">Estado</th>
					<th width="30">Comentario</th>
					<th width="30">Fecha Inicio</th>
					<th width="30">Fecha Fin</th>
				</tr>
			</thead>
			<tbody bgcolor="#FFD27D">

				<c:forEach items="${incidencias}" var="proyecto">
					<tr>

						<td>${proyecto.idEmpleado}</td>
						<td style="display: none">${proyecto.tipo}</td>
						<td>${proyecto.emailEmpleado}</td>
						<td>${proyecto.mensaje}</td>
						<td>${proyecto.comentario}</td>
						<td>${proyecto.fechaInicio}</td>
						<td>${proyecto.fechaFin}</td>


					</tr>
				</c:forEach>
			</tbody>

		</table>

		<input name="idEmpleado" id="dni" value="" style="display: none">
		<input name="tipo" id="tip" value="" style="display: none"> <input
			name="emailEmpleado" id="email" value="" style="display: none">

		<input name="mensaje" id="mens" value="" style="display: none">
		<input name="fechaInicio" id="fechIn" value="" style="display: none">
		<input name="fechaFin" id="fechFin" value="" style="display: none">
		<input name="comentario" id="com" value="" style="display: none">
		<input name="estado" id="est" value="" style="display: none">


		<p>
			<input type="submit" value="Consultar" id="consulta"
				onClick="verIncidencia()" class="btn boton-personalizado"></input>
		</p>

		
	<p>
	<input class="btn boton-salir" type="submit" value="Atrás"
			onclick="atras()">
</p>


	</form>
	
</body>


<script type="text/javascript">
	var seleccionado = null; //tendremos la fila necesaria
	
	function copiar()
    {
        document.getElementById("datepickerFin").value=document.getElementById("datepickerInicio").value;
    }

	function onclickHandler() {
		if (seleccionado == this) {
			this.style.backgroundColor = "transparent";
			seleccionado = null;
		} else {
			if (seleccionado != null)
				seleccionado.style.backgroundColor = "transparent";
			this.style.backgroundColor = "#e1b";
			seleccionado = this;
		}

	}

	var fil = document.getElementById("tab").getElementsByTagName("tr");
	for (var i = 0; i < fil.length; i++) {
		fil[i].onclick = onclickHandler;

	}

	function verIncidencia() {
		if (seleccionado == null) {
			alert("Seleccione una fila haciendo click sobre ella");
			document.normal.action = "incidenciasGestorUsuario.htm";

		}
		var f = seleccionado.getElementsByTagName('td');
		var dni = f[0].textContent;
		var tipo = f[1].textContent;
		var correo= f[2].textContent;
		var mensaje = f[3].textContent;
		var comentario = f[4].textContent;
		var fechaInicio = f[5].textContent;
		var fechaFin = f[6].textContent;
		document.getElementById("dni").value = dni;
		document.getElementById("tip").value = tipo;
		document.getElementById("email").value = correo;
		document.getElementById("mens").value = mensaje;
		document.getElementById("com").value = comentario;
		document.getElementById("fechIn").value = fechaInicio;
		document.getElementById("fechFin").value = fechaFin;

		document.normal.action = "Incidencias.htm";

	}
	
	function resolverIncidencia(){	
		var f = seleccionado.getElementsByTagName('td');
		var dni = f[0].textContent;
		var comentario = f[3].textContent;
		document.getElementById("dni").value = dni;
		document.getElementById("com").value = comentario;
		document.normal.action = "resolucionIncidencias.htm";
	}
	
	function atras(){
		document.normal.action="IrHome.htm";
	}
</script>
</html>
