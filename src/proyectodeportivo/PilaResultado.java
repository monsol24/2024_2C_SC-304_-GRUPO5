/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

import javax.swing.JOptionPane;

/**
 *
 * @author solor
 */
public class PilaResultado {
    
    private NodoResultado cima;

    public NodoResultado getCima() {
        return cima;
    }

    public void setCima(NodoResultado cima) {
        this.cima = cima;
    }
    
    public PilaResultado() {
        this.cima = null;
    }
    
    public boolean esVacia()
    {
        if(cima == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void apilar(int IdResultadoP, String Equipo1PR, int ResultadosE1PR, String Equipo2PR, int ResultadosE2PR)
    {
        
        DatoResultado d = new DatoResultado();
        
        d.setIdEventoPR(IdResultadoP);
        d.setEquipo1PR(Equipo1PR);
        d.setResultadoE1PR(ResultadosE1PR);
        d.setEquipo2PR(Equipo2PR);
        d.setResultadoE2PR(ResultadosE2PR);
        
        NodoResultado nuevo = new NodoResultado();
        //Si no funciona se intentando pasando los datos completados
        nuevo.setElemento(d);
        
        if(esVacia())
        {
            cima = nuevo;
        }
        else
        {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }
    
    public String imprimirPila()
    {
        String respuesta = "";
        if(!esVacia())
        {
            //Imprimimos los nodos
            NodoResultado temp = cima; 
            while(temp != null) 
                                
            {
                respuesta += "Id Evento: "+temp.getElemento().getIdEventoPR()+" Equipo 1: "+ temp.getElemento().getEquipo1PR()+" Resultado: "+ temp.getElemento().getResultadoE1PR() +" Equipo 2: "+temp.getElemento().getEquipo2PR()+" Resultado: "+temp.getElemento().getResultadoE2PR()+"\n"; 
                                                        
                temp = temp.getSiguiente(); 
            }
        }
        else
        {
            respuesta = "La pila está vacía";
        }
        
        return respuesta;
    }
    
    public String Victorias()
    {
        ListaEquipos laListaEquipos = new ListaEquipos();
        //Arbol arbol = new Arbol();
        String respuesta = "";
        String Equipo1V="";
        int Equipo1NuV=0;
        String Equipo2V="";
        int Equipo2NuV=0;
        int Gane1;
        int Gane2;
        boolean ExisteElEquipo = false;
        
        if(!esVacia())
        {
            NodoResultado temp = cima; 
            while(temp != null) 
            {
                //Obtine resultados equipo1
                Equipo1V=temp.getElemento().getEquipo1PR();
                Equipo1NuV=temp.getElemento().getResultadoE1PR();
                
                //Obtine resultados equipo2
                Equipo2V=temp.getElemento().getEquipo2PR();
                Equipo2NuV=temp.getElemento().getResultadoE2PR();
                
                if(Equipo1NuV>Equipo2NuV){
                    ExisteElEquipo=laListaEquipos.existeEquipo(Equipo1V); //Si ya se ha agregado el equipo
                    if(ExisteElEquipo==true){
                        Gane1=laListaEquipos.NumeroVictorias(Equipo1V); //Se extrae numero de victorias
                        Gane1=Gane1+1; //Se le suma una a las victorias
                        laListaEquipos.CambioVictorias(Equipo1V, Gane1);
                        
                    }else{ //Si no existe se agrega y se pone 1 victoria
                        laListaEquipos.inserta(new Equipos(1,Equipo1V));
                        
                    }
                    
                    //Para agregar al equipo2
                    ExisteElEquipo=laListaEquipos.existeEquipo(Equipo2V); //Si ya se ha agregado el equipo
                    if(ExisteElEquipo==false){ //Si no existe (Es decir no se ha agregado
                        laListaEquipos.inserta(new Equipos(0,Equipo2V));
                        
                    }else{
                        //En caso de que ya exista no se hace nada queda asi
                    }
                        
                }
                
                if(Equipo1NuV<Equipo2NuV){
                    
                    ExisteElEquipo=laListaEquipos.existeEquipo(Equipo2V); //Si ya se ha agregado el equipo
                    if(ExisteElEquipo==true){
                        Gane2=laListaEquipos.NumeroVictorias(Equipo2V); //Se extrae numero de victorias
                        Gane2=Gane2+1; //Se le suma una a las victorias
                        laListaEquipos.CambioVictorias(Equipo2V, Gane2);
                        
                    }else{ //Si no existe se agrega y se pone 1 victoria
                        laListaEquipos.inserta(new Equipos(1,Equipo2V));
                        
                    }
                    
                    //Para agregar al equipo1
                    ExisteElEquipo=laListaEquipos.existeEquipo(Equipo1V); //Si ya se ha agregado el equipo
                    if(ExisteElEquipo==false){ //Si no existe (Es decir no se ha agregado
                        laListaEquipos.inserta(new Equipos(0,Equipo1V));
                        
                    }else{
                        //En caso de que ya exista no se hace nada queda asi
                    }
                    
                }
                if(Equipo1NuV==Equipo2NuV){ //En caso de que queden empate no cuenta como gane para niguno
                    
                    //Para agregar al equipo1
                    ExisteElEquipo=laListaEquipos.existeEquipo(Equipo1V); //Si ya se ha agregado el equipo
                    if(ExisteElEquipo==false){ //Si no existe (Es decir no se ha agregado
                        laListaEquipos.inserta(new Equipos(0,Equipo1V));
                        
                    }else{
                        //En caso de que ya exista no se hace nada queda asi
                    }
                    
                    //Para agregar al equipo2
                    ExisteElEquipo=laListaEquipos.existeEquipo(Equipo2V); //Si ya se ha agregado el equipo
                    if(ExisteElEquipo==false){ //Si no existe (Es decir no se ha agregado
                        laListaEquipos.inserta(new Equipos(0,Equipo2V));
                        
                    }else{
                        //En caso de que ya exista no se hace nada queda asi
                    }
                    
                }
                        
                temp = temp.getSiguiente(); 
            }
        }
        else
        {
            respuesta = "La pila está vacía";
        }
        
        respuesta=laListaEquipos.PasarInfoArbol();
        
        return respuesta;
    }
    
}
