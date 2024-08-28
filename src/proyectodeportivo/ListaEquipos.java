/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class ListaEquipos {
    
    private NodoEquipos cabeza;
    private NodoEquipos ultimo;
    
    //Nos inserta el Equipo
    public void inserta(Equipos p)
    {
        if(cabeza == null){
            cabeza = new NodoEquipos(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else if (p.getIdEquipo()< cabeza.getDato().getIdEquipo()){
            NodoEquipos aux = new NodoEquipos(p);
            aux.setSiguiente(cabeza);
            aux.getSiguiente().setAnterior(aux);
            cabeza = aux;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else if (ultimo.getDato().getIdEquipo() <= p.getIdEquipo()){
            ultimo.setSiguiente(new NodoEquipos(p));
            ultimo.getSiguiente().setAnterior(ultimo);
            ultimo = ultimo.getSiguiente();
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else {
            NodoEquipos aux = cabeza;
            
            while(aux.getSiguiente().getDato().getIdEquipo() < p.getIdEquipo()){
                aux = aux.getSiguiente();
            }
            
            NodoEquipos temp = new NodoEquipos(p);
            temp.setSiguiente(aux.getSiguiente());
            temp.setAnterior(aux);
            aux.setSiguiente(temp);
            temp.getSiguiente().setAnterior(temp);
        }
    }
    
    //Existe el equipo
    public boolean existeEquipo(String NombreEquipo){
        boolean encontrado = false;
        if(cabeza != null){
            NodoEquipos aux = cabeza;            
            do{
                if(aux.getDato().getNombreEquipo().equals(NombreEquipo)){  //Si el nombre de Equipo existe              
                    encontrado = true;
                }
                else {
                    aux = aux.getSiguiente();
                }
            }
            while(aux != cabeza && !encontrado);
        }
        return encontrado;
    }
    
    //Numero Victorias
    public int NumeroVictorias(String NombreEquipo){
        int Victorias=0;
        Boolean encontrado = false;
        
        if(cabeza != null){
            NodoEquipos aux = cabeza;            
            do{
                if(aux.getDato().getNombreEquipo().equals(NombreEquipo)){  //Si el nombre de Equipo existe              
                    encontrado = true;
                    Victorias=aux.getDato().getIdEquipo();
                }
                else {
                    aux = aux.getSiguiente();
                }
            }
            while(aux != cabeza && !encontrado);
        }
        return Victorias;
    }
    
    //Cambiar Numero de Victorias
    public void CambioVictorias(String NombreEquipo, int NumeroVictorias){

        Boolean encontrado = false;
        
        if(cabeza != null){
            NodoEquipos aux = cabeza;            
            do{
                if(aux.getDato().getNombreEquipo().equals(NombreEquipo)){  //Si el nombre de Equipo existe              
                    encontrado = true;
                    aux.getDato().setIdEquipo(NumeroVictorias);
                }
                else {
                    aux = aux.getSiguiente();
                }
            }
            while(aux != cabeza && !encontrado);
        }
    }
    
    @Override
    public String toString() {
        NodoEquipos aux = cabeza;
        String s = "\n Victorias: ";
        if (aux != null){
            s += aux + "\n ";
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                s += aux + "\n ";
                aux = aux.getSiguiente();
            } 
        } else {
            s += "vacia";
        }
        return s;
    }
    
    public String PasarInfoArbol() {
        NodoEquipos aux = cabeza;
        String s = "\n Victorias: ";
        int Ganes;
        String Equipo;
        Arbol arbol = new Arbol();
        String Clasificacion="";
        
        if (aux != null){
            s += aux.getDato().getIdEquipo() + aux.getDato().getIdEquipo() + "\n ";
            
            Ganes=aux.getDato().getIdEquipo();
            Equipo= aux.getDato().getNombreEquipo();
            arbol.inserta(Ganes, Equipo);
            
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                s += aux + "\n ";
                Ganes=aux.getDato().getIdEquipo();
                Equipo= aux.getDato().getNombreEquipo();
                arbol.inserta(Ganes, Equipo);
                aux = aux.getSiguiente();
                
            } 
        } else {
            s += "vacia";
        }
        
        Clasificacion=arbol.MostrarInfo();
        
        return Clasificacion;
    }
    
    
}
