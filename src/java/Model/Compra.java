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
public class Compra {
    private String factura;
    private String proveedor;
    private String fecha;
    private int precioTotal;

    public Compra() {
        factura = null;
        proveedor = null;
        fecha = null;
        precioTotal = 0;
    }

    public Compra(String factura, String proveedor, String fecha, int precioTotal) {
        this.factura = factura;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
    }

    public String getFactura() {
        return factura;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Compra{" + "factura=" + factura + ", proveedor=" + proveedor + ", fecha=" + fecha + ", precioTotal=" + precioTotal + '}';
    }
    
    
            
}
