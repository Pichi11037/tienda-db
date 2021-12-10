<%-- 
    Document   : crearCliente
    Created on : 7/12/2021, 9:18:34 a. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear Cliente</h1>
        <form action="<%= request.getContextPath() %>/crearCliente"method="post">
        Cedula: <input type="number" name="cedula" required><br>
        Nombre: <input type="text" name="nombre" required><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Crear">
        </form>
        <a href="index.html"><input type="button" value="Regresar"></a>
    </body>
</html>
