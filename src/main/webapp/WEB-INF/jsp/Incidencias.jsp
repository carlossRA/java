<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
  <head>
<meta http-equiv="content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
   
    

    <title>Incidencias</title>

  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" media="screen">
  <!–Llamamos al archivo CSS a través de CDN –>
  </head>

  <body class="bg-light">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <!– Importante llamar antes a jQuery para que funcione bootstrap.min.js   –>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <!– Llamamos al JavaScript  a través de CDN –>
    <div class="container">
      <div class="py-5 text-center">
        <div class="banner-img">
                            <img src="https://image.ibb.co/fGNNeq/User-icon-2-svg.png" alt="Image 1" width="72" height="72">
                        </div>
     
        <h2>Incidencias</h2>
        <p class="lead">Se muestra una vision detallada de las diferentes incidencias</p>
      </div>

      <div class="row">
        <div class="col-md-4 order-md-2 mb-4">
      
        </div>
        <div class="col-md-8 order-md-1">
          <h4 class="mb-3">Datos personales</h4>
          <form class="needs-validation" novalidate>
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="firstName">DNI</label>
                <input type="text" readonly=”readonly” value= "${id}" class="form-control" id="dni">
                
              </div>
              <div class="col-md-6 mb-3">
                <label for="lastName">Tipo Incidencia</label>
                <input type="text" readonly=”readonly” value= "${tip}" class="form-control" id="tipo" >
                
              </div>
            </div>
             <div class="row">
              <div class="col-md-6 mb-3">
                <label for="firstName">Fecha Inicio</label>
                <input type="text" readonly=”readonly” value= "${fechaIn}" class="form-control" id="Fecha Inicio">
                
              </div>
              <div class="col-md-6 mb-3">
                <label for="lastName">Fecha Fin</label>
                <input type="text" readonly=”readonly” value= "${fechaFin}" class="form-control" id="Fecha Fin" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
            </div>

            <div class="mb-3">
              <label for="username">E-mail</label>
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">@</span>
                </div>
                <input type="text" readonly=”readonly” value= "${email}"  class="form-control" id="email" >
                
              </div>
            </div>

            <div class="mb-3">
              <label for="email">Comentario </label>
              <input type="text" readonly=”readonly” value= "${comentario}"  class="form-control" id="comentario" >
              <div class="invalid-feedback">
                Please enter a valid email address for shipping updates.
              </div>
            </div>

            
           <div class="mb-3">
              <label for="address2">Estado</label>
              <input type="text" readonly=”readonly” value= "${men}" class="form-control" id="estado" >
            </div>
           
           
            
          </form>
        </div>
      </div>

      <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-1">&copy; 2018-2019 Avengers Live</p>
        <ul class="list-inline">
         
        </ul>
      </footer>
    </div>

   
  </body>