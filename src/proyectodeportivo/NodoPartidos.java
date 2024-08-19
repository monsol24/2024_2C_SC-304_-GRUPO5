/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class NodoPartidos {
    
    private String dato;
    private NodoPartidos atras;

    public NodoPartidos(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoPartidos getAtras() {
        return atras;
    }

    public void setAtras(NodoPartidos atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return this.dato; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
