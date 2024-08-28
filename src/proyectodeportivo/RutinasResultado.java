/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class RutinasResultado {
    
    public PilaResultado p1 = new PilaResultado();
    
    public boolean encuentra(int x)
    {
        boolean respuesta = false;
        
        if(!p1.esVacia())
        {
            //Recorremos la pila
            
            NodoResultado aux = p1.getCima();
            
            //Una vez que tenemos la cima, comenzamos a recorrer la pila, para buscar el elemento
            
            while(aux != null) // mientras tanto, no se cumpla una condición, entonces vamos a aplicar un proceso
            {
                if(x == aux.getElemento().getIdEventoPR())
                {
                    respuesta = true;
                    break;
                }
                else
                {
                    aux = aux.getSiguiente(); //Si aux es nuestro pivote, tenemos que sobreescribir esta variable
                                              // cada vez que nos movemos.
                }
            }
        }
        else
        {
            respuesta = false; // si la pila está vacía, se sale, porque no vamos a encontrar el valor
        }
        
        return respuesta;
    }
    
}
