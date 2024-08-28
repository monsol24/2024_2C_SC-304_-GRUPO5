/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class NodoRelacion {
    
    String nombre;
    NodoRelacion siguiente;

    public NodoRelacion(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoRelacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRelacion siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
