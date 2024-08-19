/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class ColaPartidos {
    
    private NodoPartidos frente;
    private NodoPartidos ultimo;

    public NodoPartidos getFrente() {
        return frente;
    }

    public void setFrente(NodoPartidos frente) {
        this.frente = frente;
    }

    public NodoPartidos getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoPartidos ultimo) {
        this.ultimo = ultimo;
    }
    
    public void hacerFila(NodoPartidos elemento)
    {
        if(frente == null) // La fila está vacía
        {
            frente = elemento;
            ultimo = elemento;
        }
        else
        {
            
            ultimo.setAtras(elemento);
            ultimo = elemento;
            
        }
    }
    
    public NodoPartidos atender()
    {
        NodoPartidos actual = frente;
        
        if(frente != null)
        {
            frente = frente.getAtras();
            actual.setAtras(null);
        }
        
        return actual;
    }
    
    public String imprimirCola()
    {
        String respuesta = ""; // En esta respuesta vamos a ir concatenando los nodos, para poder imprimirlos juntos
        NodoPartidos actual = frente;
        
        while(actual != null)
        {
            //Podemos hacer el recorrido
            respuesta += actual.getDato() + " - ";
            actual = actual.getAtras();
        }
        
        return respuesta;
    }
    
}
