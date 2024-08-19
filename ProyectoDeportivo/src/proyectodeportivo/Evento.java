/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author HP
 */


public class Evento {
    private int id;
    private String nombre;
    private int capacidad;
    private String calendario;
    private ListaParticipante participantes;
    private Partido[] partidos;
    private int numPartidos;

    public Evento(String nombre, int id, String calendario, int maxPartidos) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.calendario = calendario;
        this.participantes = new ListaParticipante();
        this.partidos = new Partido[maxPartidos];
        this.numPartidos = 0;
    }

    Evento(String evento_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void addParticipante(Participante participante) {
        participantes.inserta(participante);
    }

    public void agregarPartido(Partido partido) {
        if (numPartidos < partidos.length) {
            partidos[numPartidos++] = partido;
        }
    }

    public String mostrarResultados() {
        if (numPartidos == 0) {
            return "No hay partidos para este evento.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numPartidos; i++) {
            sb.append(partidos[i].toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Evento: " + nombre + "\n" +
               "Capacidad: " + capacidad + "\n" +
               "Calendario: " + calendario + "\n" +
               "Participantes:\n" + participantes.toString() + 
               "Resultados de los partidos:\n" + mostrarResultados();
    }
}
