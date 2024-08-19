/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class Nodoparticipante {
    
    private Participante dato;
    private Nodoparticipante siguiente;
    private Nodoparticipante anterior;
    
    public Nodoparticipante(Participante dato){
        this.dato = dato;
    }

    public Participante getDato() {
        return dato;
    }

    public void setDato(Participante dato) {
        this.dato = dato;
    }

    public Nodoparticipante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodoparticipante siguiente) {
        this.siguiente = siguiente;
    }

    public Nodoparticipante getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodoparticipante anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public String toString(){
        return "\n" + this.dato.toString();
    } 
    
}
