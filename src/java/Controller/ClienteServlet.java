/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * @author johan
 */
@WebServlet(name = "servletCrearCliente", urlPatterns = {"/crearCliente"})
public class ClienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ClienteDAO clienteDAO;

    public void init() {
        clienteDAO = new ClienteDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String Name = request.getParameter("firstName");
        String cedula = request.getParameter("lastName");
        String password = request.getParameter("password");

        Cliente cliente = new Cliente();
        cliente.setCedula(cedula);
        cliente.setNombre(Name);
        cliente.setPassword(password);
        cliente.setDeuda(0);

        try {
            clienteDAO.registerCliente(cliente);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("index.html");
    }
}
