/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author solor
 */
public class Evento {
    
    private int IdEvento;
    private String NombreEvento;
    private String FechaEvento;
    private String Ubicacion;
    private String NombreEquipo1;
    private String ParticipanteEquipo1; 
    private String NombreEquipo2;
    private String ParticipanteEquipo2;

    public Evento(int IdEvento, String NombreEvento, String FechaEvento, String Ubicacion, String NombreEquipo1, String ParticipanteEquipo1, String NombreEquipo2, String ParticipanteEquipo2) {
        this.IdEvento = IdEvento;
        this.NombreEvento = NombreEvento;
        this.FechaEvento = FechaEvento;
        this.Ubicacion = Ubicacion;
        this.NombreEquipo1 = NombreEquipo1;
        this.ParticipanteEquipo1 = ParticipanteEquipo1;
        this.NombreEquipo2 = NombreEquipo2;
        this.ParticipanteEquipo2 = ParticipanteEquipo2;
    }

    public int getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(int IdEvento) {
        this.IdEvento = IdEvento;
    }

    public String getNombreEvento() {
        return NombreEvento;
    }

    public void setNombreEvento(String NombreEvento) {
        this.NombreEvento = NombreEvento;
    }

    public String getFechaEvento() {
        return FechaEvento;
    }

    public void setFechaEvento(String FechaEvento) {
        this.FechaEvento = FechaEvento;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombreEquipo1() {
        return NombreEquipo1;
    }

    public void setNombreEquipo1(String NombreEquipo1) {
        this.NombreEquipo1 = NombreEquipo1;
    }

    public String getParticipanteEquipo1() {
        return ParticipanteEquipo1;
    }

    public void setParticipanteEquipo1(String ParticipanteEquipo1) {
        this.ParticipanteEquipo1 = ParticipanteEquipo1;
    }

    public String getNombreEquipo2() {
        return NombreEquipo2;
    }

    public void setNombreEquipo2(String NombreEquipo2) {
        this.NombreEquipo2 = NombreEquipo2;
    }

    public String getParticipanteEquipo2() {
        return ParticipanteEquipo2;
    }

    public void setParticipanteEquipo2(String ParticipanteEquipo2) {
        this.ParticipanteEquipo2 = ParticipanteEquipo2;
    }
    
    
    
    @Override
    public String toString(){
        return "\n Id Evento: "+ this.IdEvento + "- Nombre evento: " + this.NombreEvento + " - Fecha evento: " + this.FechaEvento + " - Ubicacion: " + this.Ubicacion + "- Equipo 1: " + this.NombreEquipo1 + "- Participantes: "+this.ParticipanteEquipo1 + "- Equipo 2: " + this.NombreEquipo2 + "- Participantes: " + this.ParticipanteEquipo2;
    }
    
}
