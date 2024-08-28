/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class NodoResultado {
    
    private DatoResultado elemento;
    private NodoResultado siguiente;

    public NodoResultado() 
    {
        this.siguiente = null;
    }
    
    public NodoResultado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoResultado siguiente) {
        this.siguiente = siguiente;
    }

    public DatoResultado getElemento() {
        return elemento;
    }

    public void setElemento(DatoResultado elemento) {
        this.elemento = elemento;
    }
    
}
