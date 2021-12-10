/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author afpic
 */
public class ClienteProducto {
    
    private String cliente;
    private String producto;

    public ClienteProducto() {
        cliente = null;
        producto = producto;
    }

    public ClienteProducto(String cliente, String producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ClienteProducto{" + "cliente=" + cliente + ", producto=" + producto + '}';
    }
    
        
}
