/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class ListaEvento {
    
    private NodoEvento cabeza;
    
    //Para insertar
    public void insertar(Evento even){
        if(cabeza == null){
            cabeza = new NodoEvento(even);
        } else if(even.getIdEvento() < cabeza.getDato().getIdEvento()){ 
            NodoEvento aux = new NodoEvento(even);
            aux.setSiguiente(cabeza);
            cabeza = aux;
        } else if(cabeza.getSiguiente() == null){
            cabeza.setSiguiente(new NodoEvento(even));            
        } else {
            NodoEvento aux = cabeza;            
            while(aux.getSiguiente() != null && 
                    aux.getSiguiente().getDato().getIdEvento() < even.getIdEvento()){
                aux = aux.getSiguiente();
            }
            NodoEvento temp = new NodoEvento(even);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        }        
    }
    
    //Nos imprime la lista
    @Override
    public String toString(){
        NodoEvento aux = cabeza;
        String s = "Lista: ";
        while(aux != null){
            s += aux + ", ";
            aux = aux.getSiguiente();
        }
        return s;            
    }
    
    //Nos comprueba si el evento existe
    public boolean existe(int id){
        boolean respuesta = false;
        
        NodoEvento aux = cabeza;
        
        while(aux != null && !respuesta){
            if(aux.getDato().getIdEvento() == id){ //Si lo que ingresamos es igual al a un id de evento
                respuesta = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return respuesta; //Nos retorna la respuesta false or true
    }
    
    public String Resultados1(int id){
        boolean respuesta = false;
        String ResultadosEquipo="";
        
        NodoEvento aux = cabeza;
        
        while(aux != null && !respuesta){
            if(aux.getDato().getIdEvento() == id){ //Si lo que ingresamos es igual al a un id de evento
                ResultadosEquipo = aux.getDato().getNombreEquipo1(); //Toma e1 nombre del equipo
                respuesta = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return ResultadosEquipo; //Nos retorna el nombre
    }
    
    public String Resultados2(int id){
        boolean respuesta = false;
        String ResultadosEquipo="";
        
        NodoEvento aux = cabeza;
        
        while(aux != null && !respuesta){
            if(aux.getDato().getIdEvento() == id){ //Si lo que ingresamos es igual al a un id de evento
                ResultadosEquipo = aux.getDato().getNombreEquipo2(); //Toma el nombre del equipo2
                respuesta = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return ResultadosEquipo; //Nos retorna el nombre
    }
    
    public void modifica(Evento even){
        NodoEvento aux = cabeza;
        boolean modificado = false;
        while(aux != null && !modificado){
            if(aux.getDato().getIdEvento() == even.getIdEvento()){ //Modifica la informacion de todas las casillas excepto el id del evento
                aux.getDato().setNombreEvento(even.getNombreEvento());
                aux.getDato().setNombreEquipo1(even.getNombreEquipo1());
                aux.getDato().setParticipanteEquipo1(even.getParticipanteEquipo1());
                aux.getDato().setNombreEquipo2(even.getNombreEquipo2());
                aux.getDato().setParticipanteEquipo2(even.getParticipanteEquipo2());
                aux.getDato().setUbicacion(even.getUbicacion());
                aux.getDato().setFechaEvento(even.getFechaEvento());
                //break;
                modificado = true;
            }
            else {
                aux = aux.getSiguiente();
            }
        }
    }
    
    //Elimina el evento
    public void elimina(int id){
        NodoEvento aux = cabeza;
        NodoEvento anterior = null;
        
        boolean eliminado = false;
        
        while(aux != null && !eliminado){
            if(aux.getDato().getIdEvento() == id){
                if(aux == cabeza){
                    cabeza = cabeza.getSiguiente();
                    aux.setSiguiente(null);
                    //break;                    
                }
                else{
                    anterior.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    //break;
                }
                eliminado = true;
            }else {
                anterior = aux;
                aux = aux.getSiguiente();
            }
        }
    }
    
    //PARA HACER EL GRAFO DE LA RELACION ENTRE EQUIPOS
    
    public String NombreDeEquipos(){
        NodoEvento aux = cabeza;
        String Equipo1="";
        String Equipo2="";
        String grafoRepresentacion = " ";
        int contador = 2;
        int ie = 0;
        int je = 1;
        
        while(aux != null){
            
            GrafoRelacion grafo = new GrafoRelacion(contador); // El numero de equipos
            
            Equipo1 = aux.getDato().getNombreEquipo1(); //Toma el nombre del equipo1
            grafo.agregarEquipo(Equipo1);
            
            Equipo2 = aux.getDato().getNombreEquipo2(); //Toma el nombre del equipo2
            grafo.agregarEquipo(Equipo2);
            
            grafo.agregarPartido(ie, je);
            
            aux = aux.getSiguiente();
            
            grafoRepresentacion = grafoRepresentacion+grafo.mostrarGrafo();
            
            contador=contador+2;
            
        }
        return grafoRepresentacion;            
    }
           
}
