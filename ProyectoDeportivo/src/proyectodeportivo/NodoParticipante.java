/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 * 
 */
public class NodoParticipante {
    
    private Participante participante; // 
    private NodoParticipante siguiente;
    private NodoParticipante anterior;

    public NodoParticipante(Participante participante) {
        this.participante = participante;
        this.siguiente = null;
        this.anterior = null;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public NodoParticipante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoParticipante siguiente) {
        this.siguiente = siguiente;
    }

    public NodoParticipante getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoParticipante anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public String toString(){
        return "Nodo{" + "participante=" + this.participante.toString() + "}";
    } 
}
