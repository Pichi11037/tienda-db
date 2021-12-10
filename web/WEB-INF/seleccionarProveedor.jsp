<%-- 
    Document   : menuCliente
    Created on : Nov 3, 2019, 1:30:58 PM
    Author     : afpic
--%>

<%@page import="negocio.ProveedorProducto"%>
<%@page import="Gestion.GestionProveedorProducto"%>
<%@page import="Gestion.GestionProducto"%>
<%@page import="Gestion.GestionProveedor"%>
<%@page import="negocio.Proveedor"%>
<%@page import="negocio.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="negocio.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seleccionar Proveedor</title>
        <%
            ArrayList<Proveedor> proveedores = new ArrayList();
            GestionProveedor gproveedor = new GestionProveedor();
            proveedores = gproveedor.getTodos();
        %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>

    </head>
    <body>
        <h1>Seleccionar Proveedor</h1>
        <form action="seleccionarProveedor" method="post">
            Proveedor:<select name="p" id ="proveedores">
                <% for (int i = 0; i < proveedores.size(); i++) {%>
                <option value="<%=proveedores.get(i).getId()%>" name="<%= proveedores.get(i).getNombre()%>"> <%= proveedores.get(i).getNombre()%> </option>
                <%}%>
            </select>
            <input type="submit" value="Seleccionar el producto">
        </form>
    </body>
</html>
