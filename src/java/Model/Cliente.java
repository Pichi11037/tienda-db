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
public class Cliente {
    
    private String cedula;
    private String nombre;
    private String password;
    private int deuda;
    public Cliente() {
        cedula= null;
        nombre = null;
        password= null;
        deuda = 0;
    }

    public Cliente(String cedula, String nombre, String password, int deuda) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
        this.deuda = deuda;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public String getPassword(){
        return password;
    }
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", password=" + password + ", deuda=" + deuda + '}';
    }

  
    
    
}
