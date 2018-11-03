<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta</title>
</head>
<body>
	<h2 align="center">Listado de fichajes</h2>
	
	<table align="center" border="2">
		<thead bgcolor="#66CC99">
		<tr><th>HoraApertura</th><th>HoraCierre</th><th>Fecha</th><th>EstadoFichaje</th></tr>
		</thead>
		<tbody  bgcolor="#FFCC99">
		<c:forEach items="${model.fichajes}" var="fich" }>
			<tr><td>${fich.horaEntrada}</td>
			<td>${fich.horaCierre}</td>
			<td>${fich.fechaFichaje}</td>		
		</c:forEach>
		</tbody>
	</table>
	
	<form action="home.htm" method="post">
		<input value="Atrás" type="submit" name="BtnAtras">
	</form>
	
</body>
</html>