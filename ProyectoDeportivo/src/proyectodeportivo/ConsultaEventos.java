/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */

   

public class ConsultaEventos extends javax.swing.JFrame {

    private ListaEventos listaEventos;

    public ConsultaEventos() {
        initComponents();  // Inicializa los componentes del formulario
        
        // Inicia la lista de eventos y 
        listaEventos = new ListaEventos(10); // Máximo de 10 eventos

        // Crear algunos participantes de ejemplo
        Participante p1 = new Participante("Juan Pérez");
        Participante p2 = new Participante("Ana Gómez");

        // Crear algunos eventos de ejemplo
        Evento evento1 = new Evento("Evento 1");
        Evento evento2 = new Evento("Evento 2");

        evento1.addParticipante(p1);
        evento1.addParticipante(p2);

        evento2.addParticipante(p2);

        listaEventos.addEvento(evento1);
        listaEventos.addEvento(evento2);
    }

    private void btnConsultaEventoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // Mostrar la lista de eventos en un cuadro de diálogo
        if (listaEventos != null) {
            String eventos = listaEventos.mostrarEventos(); // Usa el método para mostrar eventos
            JOptionPane.showMessageDialog(this, eventos, "Lista de Eventos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No hay eventos disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
 

