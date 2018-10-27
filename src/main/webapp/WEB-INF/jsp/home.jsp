<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a AvengersLive Web</h1>
        <ul>
            <li>Usuario : <c:out value="${email}" /></li>
            <li>Contraseña : <c:out value="${contrasena}" /></li>
            
        </ul>
    </body>
</html>
