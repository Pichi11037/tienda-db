<%-- 
    Document   : menuCliente
    Created on : Nov 3, 2019, 1:30:58 PM
    Author     : afpic
--%>

<%@page import="negocio.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Cliente</title>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>

    </head>
    <body>
        <%
            session = request.getSession();
            Cliente c = (Cliente) session.getAttribute("cliente");
            String nombre = "error";
            if (c != null) {
                nombre = c.getNombre();
            }
        %>

        <h1>Prueba</h1>
        <p>Bienvenido, <%=nombre%></p><br>
        <a href="crearCompra.jsp"><input type="button" value="Comprar"></a><br>
        <a href="verHistorial.jsp"><input type="button" value="Ver historial"></a><br>
        <a href="verProductos.jsp"><input type="button" value="Ver productos"></a><br>
        <a href="index.html"><input type="button" value="Cerrar cuenta"></a><br>
    </body>
</html>
