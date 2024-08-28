/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class NodoPartidos {
    
    private int id;
    private String Horario;
    private String Equipo1;
    private String Equipo2;
    private NodoPartidos atras;

    public NodoPartidos(int id, String Horario, String Equipo1, String Equipo2) {
        this.id = id;
        this.Horario = Horario;
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public NodoPartidos getAtras() {
        return atras;
    }

    public void setAtras(NodoPartidos atras) {
        this.atras = atras;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(String Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(String Equipo2) {
        this.Equipo2 = Equipo2;
    }

    @Override
    public String toString() {
        String PartidosCalendario = "Id Evento: "+this.id+" Equipo 1: "+Equipo1+" Equipo 2: "+Equipo2+" Horario: "+Horario+"\n";
        return PartidosCalendario; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
