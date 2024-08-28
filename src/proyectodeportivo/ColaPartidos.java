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
            respuesta += "Id del evento: "+actual.getId()+" Equipo 1: "+actual.getEquipo1()+" Equipo 2: "+actual.getEquipo2()+" Horario "+actual.getHorario() + " - \n";
            actual = actual.getAtras();
        }
        
        return respuesta;
    }
    
    //Para ver si el evento ya se programo
    public boolean EventoProgramado(int IdEvento)
    {
        boolean ProgramadoE = false;
        NodoPartidos actual = frente;
        
        while(actual != null)
        {
            //Podemos hacer el recorrido
            
            if (IdEvento==actual.getId()){ //Compara si el evento existe
                ProgramadoE = true; //En caso de que exista y este programado
            }
            actual = actual.getAtras();
            
        }
        
        return ProgramadoE;
    }
    
    //Para tomar el nombre del equipo 1
    public String EventoProgramadoEquipo1(int IdEvento)
    {
        String EPEquipo1 = "";
        NodoPartidos actual = frente;
        
        while(actual != null)
        {
            //Podemos hacer el recorrido
            
            if (IdEvento==actual.getId()){ //Compara si el evento existe
                EPEquipo1 = actual.getEquipo1(); //En caso de que exista y este programado
            }
            actual = actual.getAtras();
            
        }
        
        return EPEquipo1;
    }
    
    //Para tomar el nombre del equipo 2
    public String EventoProgramadoEquipo2(int IdEvento)
    {
        String EPEquipo2 = "";
        NodoPartidos actual = frente;
        
        while(actual != null)
        {
            //Podemos hacer el recorrido
            
            if (IdEvento==actual.getId()){ //Compara si el evento existe
                EPEquipo2 = actual.getEquipo2(); //En caso de que exista y este programado
            }
            actual = actual.getAtras();
            
        }
        
        return EPEquipo2;
    }
    
}
