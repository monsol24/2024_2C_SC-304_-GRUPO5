/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class Arbol {
    
    private NodoArbol raiz;
    
    public void inserta(int x, String Equipo){
        if(raiz == null){
            raiz = new NodoArbol(x,Equipo);
        } else {
            insertaR(raiz, x, Equipo);
        }        
    }
    
    private void insertaR(NodoArbol n, int x, String Equipo){
        if(x <= n.getId()){
            if(n.getHijoIzq() == null){
                n.setHijoIzq(new NodoArbol(x,Equipo));
            } else {
                insertaR(n.getHijoIzq(), x, Equipo);
            }
        } else {
            if(n.getHijoDer() == null){
                n.setHijoDer(new NodoArbol(x, Equipo));
            } else {
                insertaR(n.getHijoDer(), x, Equipo);
            }            
        }
    }
    
    public void inOrden(){
        if(raiz != null){
            inOrdenR(raiz);
        } else {
            System.out.println("Árbol vacío");
        }        
    }
    
    private void inOrdenR(NodoArbol n){
        if(n != null){
            inOrdenR(n.getHijoIzq());
            System.out.println(" Victorias: "+n.getId()+ " Equipo: "+n.getEquipo() + "\n ");
            inOrdenR(n.getHijoDer());
        }
    }
    
    //Nos muestra el arbol en formato String
    public String MostrarInfo(){
        String Respuesta="";
        if(raiz != null){
            Respuesta+=MostrarInfoR(raiz);
        } else {
            Respuesta="Árbol vacío";
        }   
        return Respuesta;
    }
    
    private String MostrarInfoR(NodoArbol n){
        String Respuesta="";
        if(n != null){
            Respuesta+=MostrarInfoR(n.getHijoDer());
            Respuesta+=" Victorias: "+n.getId()+ " Equipo: "+n.getEquipo() + "\n ";
            Respuesta+=MostrarInfoR(n.getHijoIzq());
        }
        return Respuesta;
    }
    
}
