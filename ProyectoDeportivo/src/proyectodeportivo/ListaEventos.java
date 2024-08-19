/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author HP
 */



public class ListaEventos {
    private Evento[] eventos;
    private int numEventos;

    public ListaEventos(int maxEventos) {
        eventos = new Evento[maxEventos];
        numEventos = 0;
    }

    public void agregarEvento(Evento evento) {
        if (numEventos < eventos.length) {
            eventos[numEventos++] = evento;
        }
    }

    public Evento buscarEventoPorId(int id) {
        for (int i = 0; i < numEventos; i++) {
            if (eventos[i].getId() == id) {
                return eventos[i];
            }
        }
        return null; // Evento no encontrado
    }

    void addEvento(Evento evento1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String mostrarEventos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
