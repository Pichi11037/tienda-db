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
public class Producto {
    private String id;
    private String nombre;
    private int precioCompra;
    private String foto;
    public Producto() {
        this.id = "";
        this.nombre = "";
        this.precioCompra = 0;
        this.foto = "";
    }
    
    public Producto(String id, String nombre, int precioCompra, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.foto = foto;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precioCompra=" + precioCompra + ", foto=" + foto + '}';
    }
    
    
    
}
