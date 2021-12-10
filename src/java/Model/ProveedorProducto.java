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
public class ProveedorProducto {

    private String proveedor;
    private String producto;

    public ProveedorProducto() {
        this.proveedor = "";
        this.producto = "";
    }

    public ProveedorProducto(String proveedor, String producto) {
        this.proveedor = proveedor;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ProveedorProducto{" + "proveedor=" + proveedor + ", producto=" + producto + '}';
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

}
