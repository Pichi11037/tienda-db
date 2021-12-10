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
public class HistorialVenta {
    private String venta;
    private String producto;
    private int cantidad;

    public HistorialVenta() {
        venta = null;
        producto = null;
        cantidad = 0;
    }

    public HistorialVenta(String venta, String producto, int cantidad) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getVenta() {
        return venta;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "HistorialVenta{" + "venta=" + venta + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }
        
    
}
