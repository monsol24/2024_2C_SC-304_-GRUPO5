/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class NodoEquipos {
    
    private Equipos dato;
    private NodoEquipos siguiente;
    private NodoEquipos anterior;
    
    public NodoEquipos(Equipos dato){
        this.dato = dato;
    }

    public Equipos getDato() {
        return dato;
    }

    public void setDato(Equipos dato) {
        this.dato = dato;
    }

    public NodoEquipos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEquipos siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEquipos getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEquipos anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public String toString(){
        return "\n" + this.dato.toString();
    } 
    
}
