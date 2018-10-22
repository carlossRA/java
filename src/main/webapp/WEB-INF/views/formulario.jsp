<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1>UCLM </h1>


<form:form action="agregar.html" method="POST" commandName="cmdForm">
     <form:label path="nombre">Usuario+"  "</form:label>
     <form:input path="nombre" />
<br/>
<form:label path="apellido">Contraseña</form:label>
<form:input path="apellido"/>
<br/>

 <a href="#" class="btn-3d red">Registrarse</a>
 

<input type="submit" value="Acceder"/>
</form:form>
<div class="vid-container">
  <video class="bgvid" autoplay="autoplay" muted="muted" preload="auto" loop>
      <!--<source src="css/images/background_video.webm" type="video/webm">-->
       
        <source src="src/main/resources/images/videoplayback.mp4" type="video/mp4">
  </video>
  <div class="inner-container">
    <div class="box">
      <h1>UCLM BlackJack</h1>
      <a href="#" class="btn-3d red">Crear una partida</a>


      <a href="#" class="btn-3d green">Únete a la partida</a>
      <!--
        //TODO: BOTÓN ACCEDER
      -->
    </div>
  </div>
</div>
</body>
</html>

