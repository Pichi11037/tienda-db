<%-- 
    Document   : asignarProductos
    Created on : Nov 10, 2019, 9:32:48 PM
    Author     : afpic
--%>

<%@page import="negocio.Producto"%>
<%@page import="negocio.Proveedor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Gestion.GestionProducto"%>
<%@page import="Gestion.GestionProveedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <%
            GestionProveedor gproveedor = new GestionProveedor();
            GestionProducto gproducto = new GestionProducto();
            ArrayList<Proveedor> proveedores = new ArrayList();
            ArrayList<Producto> productos = new ArrayList();
            proveedores = gproveedor.getTodos();
            productos = gproducto.getTodos();
        %>

    </head>
    <body>
        <form action="asignarProducto" method="post">
            Proveedor:<select name="proveedor">
                <% for (int i = 0; i < proveedores.size(); i++) {%>
                <option value="<%=proveedores.get(i).getId()%>"> <%= proveedores.get(i).getNombre()%> </option>
                <%}%>
            </select>
            Producto:<select name="producto">
                <% for (int i = 0; i < productos.size(); i++) {%>
                <option value="<%=productos.get(i).getId()%>"> <%= productos.get(i).getNombre()%> </option>
                <%}%>
            </select>
            <input type="submit" value="Asignar">
        </form>
        <a href="menuAdministrador.html"<input type="button" value="Regresar"></a> 
    </body>
</html>