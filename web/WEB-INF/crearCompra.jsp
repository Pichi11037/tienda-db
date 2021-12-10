<%-- 
    Document   : crearCompra
    Created on : Nov 16, 2019, 2:25:50 AM
    Author     : afpic
--%>

<%@page import="negocio.ProveedorProducto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Realizar Compra</title>
        <%
            session = request.getSession();
            ArrayList<ProveedorProducto> inventario = (ArrayList<ProveedorProducto>) session.getAttribute("inventario");
        %>
    </head>
    <body>
        <h1>Escoge tus productos</h1>
        
        <form action="Compra" method="post">
            Producto:<select name="producto" id ="producto">
                <% for (int i = 0; i < inventario.size(); i++) {%>
                <option value="<%=inventario.get(i).getProducto()%>" name="<%= inventario.get(i).getProducto()%>"> <%= inventario.get(i).getProducto()%> </option>
                <%}%>
            </select>
            <input type="number" name="cantidad" id="cantidad">
            <input type="submit" value="Seleccionar el producto">
        </form>
    </body>
</html>
