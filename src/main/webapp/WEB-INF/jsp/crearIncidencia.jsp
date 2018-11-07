<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Crear incidencia</title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
<script>
	$.datepicker.regional['es'] = {
		closeText : 'Cerrar',
		prevText : '< Ant',
 nextText: 'Sig >',
		currentText : 'Hoy',
		monthNames : [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
				'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre',
				'Diciembre' ],
		monthNamesShort : [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul',
				'Ago', 'Sep', 'Oct', 'Nov', 'Dic' ],
		dayNames : [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves',
				'Viernes', 'Sábado' ],
		dayNamesShort : [ 'Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb' ],
		dayNamesMin : [ 'Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá' ],
		weekHeader : 'Sm',
		dateFormat : 'dd/mm/yy',
		firstDay : 1,
		isRTL : false,
		showMonthAfterYear : false,
		yearSuffix : ''
	};
	$.datepicker.setDefaults($.datepicker.regional['es']);
	$(function() {
		$("#fecha").datepicker();
	});
</script>
<script>
	$(function() {
		$("#fechaInicio").datepicker();
	});
</script>
<script>
	$(function() {
		$("#fechaFin").datepicker();
	});
</script>
</head>
<style>
.body {
	background-image:
		url(https://i2.wp.com/plagi.es/wp-content/uploads/2016/01/FONDO-Web-2016-OK-1.jpg);
	background-size: 100% 100%;
	background-attachment:fixed;
	margin:0;
	font-family: helvetica;
		

	
}

.form {width 450px;
	margin: auto;
	baackground: rgba(0, 0, 0, 0.4);
	padding: 10px 20px;
	box-sizing: border-box;
	margin-top: 20px;
	border-radtios: 7px;
}

.h2 {
	color: #31384A;
	text-align: center;
	margin: 0;
	font-size: 40px;
	margin-botton: 20px;
}

.input {
	width: 100%;
	margin-botton: 20px;
	padding: 2px;
	box-sizing: border-box;
	font-size: 17px;
	border: none;
}

.textarea {
	width: 100%;
	margin-botton: 20px;
	padding: 2px;
	box-sizing: border-box;
	font-size: 17px;
	border: outset;
	min-height: 100px;
	max-height: 200px;
	max-width: 100%;
}

.boton {
	width: 100%;
	background: #31384A;
	color: #fff;
	padding: 20px;
	font-size: 17px;
}

.boton:hover {
	cursor: pointer;
}

@media ( max-width :480px) {
	form {
		width: 100%;
	}
}

.caja {
	margin: 20px auto 40px auto;
	border: 1px solid #d9d9d9;
	height: 30px;
	overflow: hidden;
	width: 230px;
	position: relative;
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

.caja::after {
	content: "\025be";
	display: table-cell;
	padding-top: 7px;
	text-align: center;
	width: 30px;
	height: 30px;
	background-color: #31384A;
	position: absolute;
	top: 0;
	right: 0px;
	pointer-events: none;
}
.fechas{
	background-color: #31384A;
	font-size: 14px;
	border: outset;
	margin: 20px auto 40px auto;
	height: 100px;
	width: 500px;
	overflow: hidden;
	width: 230px;
	position: relative;
	color: white;
	text-align: center;
	padding: 20px;

}

</style>

<body>
	<div class="body">

		<form action="" class="form">
			<h2 class="h2">INCIDENCIAS</h2>
			<br></br>
			<div class="caja caja::after">
				<select class="select select:focus">
					<option value=" ">--Tipo de incidencia--</option>
					<option value="Aceptada">Aceptada</option>
					<option value="Espera">En espera</option>
					<option value="Denegada">Denegada</option>
				</select>
			</div>
			<br></br>

			<div class="fechas">
				<label>Fecha de inicio</label> 
				<input type="text" name="fechaInicio" id="fechaInicio"><br></br>
				<label>Fecha de fin</label>
				<input type="text" name="fechaFin" id="fechaFin">
			</div>
			<br></br>
			<textarea class="textarea" name="observaciones"
				placeholder="Observaciones"></textarea>
			<input type="button" class="boton boton:hover" value="ENVIAR"
				id="botonEnviar">

		</form>
	</div>
</body>
</html>
