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
public class Inventario {
private String id;
private String producto;
private int cantidad;
private int precioVenta;
    public Inventario() {
        this.id = "";
        this.producto = "";
        this.cantidad = 0;
        this.precioVenta = 0;
    }
    
    public Inventario(String id, String producto, int cantidad, int precioVenta) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Inventario{" + ", producto=" + producto + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + '}';
    }
    
    
}
