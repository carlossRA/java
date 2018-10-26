<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados de formulario</h1>
        <ul>
            <li>E-mail : <c:out value="${email}" /></li>
            <li>Correo : <c:out value="${correo}" /></li>
            <li>Edad : <c:out value="${edad}" /></li>
        </ul>
    </body>
</html>
