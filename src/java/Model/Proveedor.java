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
public class Proveedor {
private String id;
private String nombre;
private int deuda;
    public Proveedor() {
        this.id = "";
        this.nombre = "";
        this.deuda = 0;
    }
    
    public Proveedor(String id, String nombre, int deuda) {
        this.id = id;
        this.nombre = nombre;
        this.deuda = deuda;
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

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", nombre=" + nombre + ", deuda=" + deuda + '}';
    }
    
    
}
