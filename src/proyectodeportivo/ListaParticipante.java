/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class ListaParticipante {
    
    private Nodoparticipante cabeza;
    private Nodoparticipante ultimo;
    
    //Nos inserta el participante
    public void inserta(Participante p)
    {
        if(cabeza == null){
            cabeza = new Nodoparticipante(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else if (p.getIdparticipante()< cabeza.getDato().getIdparticipante()){
            Nodoparticipante aux = new Nodoparticipante(p);
            aux.setSiguiente(cabeza);
            aux.getSiguiente().setAnterior(aux);
            cabeza = aux;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else if (ultimo.getDato().getIdparticipante() <= p.getIdparticipante()){
            ultimo.setSiguiente(new Nodoparticipante(p));
            ultimo.getSiguiente().setAnterior(ultimo);
            ultimo = ultimo.getSiguiente();
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else {
            Nodoparticipante aux = cabeza;
            
            while(aux.getSiguiente().getDato().getIdparticipante() < p.getIdparticipante()){
                aux = aux.getSiguiente();
            }
            
            Nodoparticipante temp = new Nodoparticipante(p);
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
            Nodoparticipante aux = cabeza;            
            do{
                if(aux.getDato().getEquipo().equals(NombreEquipo)){  //Si el nombre de Equipo existe              
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
    
    //Si el id del participante existe
    
    public boolean ExisteIdParticipante(int id){
        boolean encontrado = false;
        if(cabeza != null){
            Nodoparticipante aux = cabeza;            
            do{
                if(aux.getDato().getIdparticipante()==id){  //Si el id del participante existe                   
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
    
    //Participantes para equipo
    
    public String ParticipantesEquipo(String NombreEquipo) {
        Nodoparticipante aux = cabeza;
        String s = " ";
        if (aux != null){
            //s += aux + "\n ";
            //s += aux.getDato().getNombre() + ",";
            if(aux.getDato().getEquipo().equals(NombreEquipo)){
                s += aux.getDato().getNombre() + ","; //Va haciendo la fila para los participantes
            }
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                //s += aux + "\n ";
                //s += aux.getDato().getNombre() + ",";
                if(aux.getDato().getEquipo().equals(NombreEquipo)){
                    s += aux.getDato().getNombre() + ","; //Va haciendo la fila para los participantes
                }
                aux = aux.getSiguiente();
            } 
        } else {
            s += "vacia";
        }
        return s;
    }
    
    public void modifica(Participante p){
        if(cabeza != null){
            Nodoparticipante aux = cabeza;
            boolean modificado = false;
            do{
                if(aux.getDato().getIdparticipante() == p.getIdparticipante()){ //Modifica todas la informacion del participante excepto el id
                    aux.getDato().setNombre(p.getNombre());
                    aux.getDato().setEquipo(p.getEquipo());
                    aux.getDato().setEdad(p.getEdad());
                    modificado = true;
                }
                else {
                    aux = aux.getSiguiente();
                }
            }
            while(aux != cabeza && !modificado);
        }
    }
    
    public void elimina(int id){
        if(cabeza != null){
            Nodoparticipante aux = cabeza;

            boolean eliminado = false;

            do{
                if(aux.getDato().getIdparticipante() == id){
                    if(aux == cabeza){
                        if(ultimo == cabeza){ //Cuando solo hay un elemento
                            cabeza = null;
                            ultimo = null;
                        }else {
                            cabeza = cabeza.getSiguiente();
                            ultimo.setSiguiente(cabeza);                    
                            cabeza.setAnterior(aux.getAnterior());
                        }                        
                    } else if(aux == ultimo){
                        ultimo = ultimo.getAnterior();
                        ultimo.setSiguiente(cabeza);
                        cabeza.setAnterior(ultimo);
                    }
                    else{
                        aux.getAnterior().setSiguiente(aux.getSiguiente());                    
                        aux.getAnterior().getSiguiente().setAnterior(aux.getAnterior());
                    }
                    aux.setSiguiente(null);
                    aux.setAnterior(null);
                    eliminado = true;
                }else {                
                    aux = aux.getSiguiente();
                }    
            }
            while(aux != cabeza && !eliminado);
        }
    }
    
    @Override
    public String toString() {
        Nodoparticipante aux = cabeza;
        String s = "\n Lista: ";
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
    
}
