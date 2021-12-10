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
public class HistorialCompra {
    private String compra;
    private String producto;
    private int cantidad;

    public HistorialCompra() {
        this.compra = null;
        this.producto = null;
        this.cantidad = 0;
    }
    
    public HistorialCompra(String compra, String producto, int cantidad) {
        this.compra = compra;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getCompra() {
        return compra;
    }

    public String getProducto() {
        return producto;
    }
    
    public int getCantidad(){
        return cantidad;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public void setCantidad(int nCantidad){
        this.cantidad = nCantidad;
    }

    @Override
    public String toString() {
        return "HistorialCompra{" + "compra=" + compra + ", producto=" + producto + '}';
    }
    
    
    
}
