/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class Equipos {
    
    private int idEquipo;
    private String NombreEquipo;

    public Equipos(int idEquipo, String NombreEquipo) {
        this.idEquipo = idEquipo;
        this.NombreEquipo = NombreEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }
    
    @Override
    public String toString(){
        return "Victorias: "+this.idEquipo+"Nombre equipo: "+this.NombreEquipo+"\n";
    }
    
}
