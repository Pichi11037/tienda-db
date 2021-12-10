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
public class Venta {
private String factura;
private String cliente;
private String fecha;
private int precioTotal;
    public Venta() {
        this.factura = "";
        this.cliente = "";
        this.fecha = "";
        this.precioTotal = 0;
    }
    
    public Venta(String factura, String cliente, String fecha, int precioTotal) {
        this.factura = factura;
        this.cliente = cliente;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Venta{" + "factura=" + factura + ", cliente=" + cliente + ", fecha=" + fecha + ", precioTotal=" + precioTotal + '}';
    }
    
    
}
