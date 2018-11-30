<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src=" https://code.jquery.com/jquery.js">
	
</script>
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" media="screen">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src=" https://code.jquery.com/jquery.js">	
</script>
<script
	src=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js">
	
</script>
<link rel="stylesheet"
	href=" https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta http-equiv="content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/estilos.css">
<title>Consulta Fichajes</title>
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
.boton-cerrar {
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
</style>
  <body class="bg-light">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
<p>
	<h2 align="center">Listado de fichajes</h2>
	</p>
	
	<form name="fichs" method="post">
		<table align="center" border="1"width: 100% id="tab">
			<thead bgcolor="#FFFD86">
				<tr>
					<th>Fecha</th>
					<th>Apertura</th>
					<th>Cierre</th>
					<th>Estado</th>
				</tr>
			</thead>
			<tbody bgcolor="#FFD27D">
				<c:forEach var="fich" items="${fichajes}">
					<tr>
					
						<td>${fich.fechaFichaje}</td>
						<td>${fich.horaEntrada}</td>
						<td>${fich.horaCierre}</td>
						<td>${fich.estado}</td>
				</c:forEach>
			</tbody>
		</table>
		
		<input name="fechaFichaje" id="fechaFich" value="" style="display: none">
		<input name="horaEntrada" id="horaEnt" value="" style="display: none">
		<input name="horaCierre" id="horaCierr" value="" style="display: none">
		<input name="estado" id="est" value="" style="display: none">
		<input name="id" id="id" value="${id}" style="display: none">
		<input name="mail" id="mail" value="${mail}" style="display: none">
		<p>
		<input class="btn boton-resolver" type="submit" value="Editar fichaje"
			onclick="gestionarFichajes()">
			</p>
			<p>
		<input class="btn boton-salir" type="submit" value="Atrás"
			onclick="atras()">
			
	</p>
	</form>
	

	

</body>
<script type="text/javascript">
var seleccionado = null; //tendremos la fila necesaria

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


function gestionarFichajes(){
	
	if (seleccionado == null) {
		alert("Seleccione una fila haciendo click sobre ella");
		document.fichs.action="incis.htm";

	}
	else{
	var f = seleccionado.getElementsByTagName('td');
	
	document.getElementById("fechaFich").value = f[0].textContent;
	document.getElementById("horaEnt").value = f[1].textContent;
	document.getElementById("horaCierr").value = f[2].textContent;
	document.getElementById("est").value = f[3].textContent;
	document.fichs.action ="formFich.htm";
	
	}
}
	
	function atras(){
		
		
		document.fichs.action ="RellenarIncidencia.htm";
		
		}
		


</script>
</html>