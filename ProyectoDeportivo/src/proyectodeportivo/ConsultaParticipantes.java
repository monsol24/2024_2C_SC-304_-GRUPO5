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
public class ConsultaParticipantes extends javax.swing.JFrame {
  
    private ListaParticipante listaParticipantes;

    public ConsultaParticipantes() {
        initComponents();
        
        // Inicializa la lista de participantes y añade algunos participantes de ejemplo
        listaParticipantes = new ListaParticipante();
        listaParticipantes.inserta(new Participante("Juan Pérez"));
        listaParticipantes.inserta(new Participante("Ana Gómez"));
        listaParticipantes.inserta(new Participante("Luis Rodríguez"));
    }


    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   private void ConsultarParticipantesActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    // Asegúrate de que la lista de participantes esté inicializada y cargada
    if (listaParticipantes != null) {
        String participantes = listaParticipantes.toString(); // Usa el método toString() recursivo
        JOptionPane.showMessageDialog(this, participantes, "Lista de Participantes", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No hay participantes disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}
  

