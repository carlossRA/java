<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
  <meta charset="utf-8">
  <title>Informacion de incidencias.</title>

  <!-- BOOTSTRAP -->
  <script src="https://code.jquery.com/jquery.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

  <!-- ANGULAR JS-->
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>

  <style type="text/css">
		
		.EstiloBoton{
		padding: 1em;
		background:#04EFFC;
		color:white;
		border:none;
		font-family:arial;
		border-radius:3px;
		font-size:13px;
		
		}
		}
		</style>
</head>

<body>
  <div class="container">

    <div class="page-header" >
      <h1>
        <span class="glyphicon glyphicon-user"></span>
        Informacion Incidencia
      </h1>
    </div>
    <div >
     
     
       

	
	<br>
 		<label>DNI</label>
        <input name="id"   readonly=”readonly” value= "${id}" class="form-control" id="id">
        
        <br>
 		
 		<label>Tipo</label>
        <input name="nameTarea" readonly=”readonly” value= "${tipo}" class="form-control" id="nameTarea">
        
        <br>
 		<label>Estado</label>
        <input name="id"   readonly=”readonly” value= "${men}" class="form-control" id="id">
        
        <br>
 		
 		<label>Fecha Inicio</label>
        <input name="nameTarea" readonly=”readonly” value= "${fechaIn}" class="form-control" id="nameTarea">
        <br>
 		<label>Fecha Fin</label>
        <input name="id"   readonly=”readonly” value= "${fechaFin}" class="form-control" id="id">
        
        <br>
 		
 		<label>Comentario</label>
        <input name="nameTarea" readonly=”readonly”  value= "${comentario}" class="form-control" id="nameTarea">
       
       
        
       
           <br>
        
         
            
              
         
        </form>
        
        
          </div>

    </div>

    
  </div>
 
</body>

<script type="text/javascript">

function retroceder(){
	
		document.normal.action ="GestConlInc.htm";

	}
	
</script>


</html>