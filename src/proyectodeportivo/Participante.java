/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class Participante {
    
    private int idparticipante;
    private String nombre;
    private String equipo;
    private int edad;
    
    public Participante(int idparticipante, String nombre, String equipo, int edad){
        this.idparticipante = idparticipante;
        this.nombre = nombre;
        this.equipo = equipo;
        this.edad = edad;
    }

    public int getIdparticipante() {
        return idparticipante;
    }

    public void setIdparticipante(int idparticipante) {
        this.idparticipante = idparticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Id de participante: " + this.idparticipante + " - Nombre: " + this.nombre + " - Equipo: " + this.equipo + " - edad: " + this.edad;
    }
    
}
