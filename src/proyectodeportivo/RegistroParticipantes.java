/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectodeportivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author solor
 */
public class RegistroParticipantes extends javax.swing.JFrame {

    /**
     * Creates new form RegistroParticipantes
     */
    public RegistroParticipantes() {
        initComponents();
        //Para que los spinner (Los resultados) no puedan bajar de 0
        SpinnerNumberModel Spinner1 = new SpinnerNumberModel();
        Spinner1.setMinimum(0);
        Txt_ResulE1.setModel(Spinner1);
        SpinnerNumberModel Spinner2 = new SpinnerNumberModel();
        Spinner2.setMinimum(0);
        Txt_ResulE2.setModel(Spinner2);
        
        EscondeBotones(); // Para que los botones no se muestren a no ser que ingrese como administrador
        
    }
    
    //Se realizan las declaraciones
    ListaParticipante laLista = new ListaParticipante();
    ListaEvento laListaEvento = new ListaEvento();
    ColaPartidos colapartidos = new ColaPartidos();
    PilaResultado nuevaPila = new PilaResultado();
    RutinasResultado rutinasresultadosP = new RutinasResultado();
    String ResultadoRelacion="";
    String Prueba="";
    
    public void EscondeBotones(){
        
        //Administrar Participantes
        Btn_RegisParti.setVisible(false);
        Txt_NombreParti.setVisible(false);
        jLabel8.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        Txt_EdadParti.setVisible(false);
        Btn_ModiParti.setVisible(false);
        jLabel4.setVisible(false);
        Txt_EquiParti.setVisible(false);
        jLabel5.setVisible(false);
        Txt_IdParti.setVisible(false);
        Btn_EliParti.setVisible(false);
        
        //Administrar Eventos
        jLabel6.setVisible(false);
        jLabel12.setVisible(false);
        Txt_IdEven.setVisible(false);
        Btn_RegiEven.setVisible(false);
        jLabel7.setVisible(false);
        Txt_NombreEven.setVisible(false);
        Txt_DiaEven.setVisible(false);
        cmb_DiaEvento.setVisible(false);
        cmb_MesEvento.setVisible(false);
        Btn_ModiEven.setVisible(false);
        jLabel9.setVisible(false);
        Txt_UbiEven.setVisible(false);
        Btn_EliEven.setVisible(false);
        jLabel10.setVisible(false);
        Txt_Equipo1Even.setVisible(false);
        jLabel11.setVisible(false);
        Txt_Equipo2Even.setVisible(false);

        //Programar Partidos
        jLabel13.setVisible(false);
        jLabel15.setVisible(false);
        Txt_IdEvenPro.setVisible(false);
        jLabel14.setVisible(false);
        cmb_HoraApertura.setVisible(false);
        jLabel18.setVisible(false);
        cmb_MAperturaS.setVisible(false);
        cmb_MAperturaP.setVisible(false);
        cmb_HorarioA.setVisible(false);
        Btn_Programar.setVisible(false);
        
        //Resultados Partidos
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        Txt_IdEvenResul.setVisible(false);
        jLabel19.setVisible(false);
        Txt_ResulE1.setVisible(false);
        jLabel20.setVisible(false);
        Txt_ResulE2.setVisible(false);
        Btn_Resultados.setVisible(false);
        
        //Titulo
        jLabel1.setVisible(false);
        
        //Salir Modo Administrador
        jButton7.setVisible(false);
        
        
    }
    
    public void MostrarBotones(){
        
        //Administrar Participantes
        Btn_RegisParti.setVisible(true);
        Txt_NombreParti.setVisible(true);
        jLabel8.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        Txt_EdadParti.setVisible(true);
        Btn_ModiParti.setVisible(true);
        jLabel4.setVisible(true);
        Txt_EquiParti.setVisible(true);
        jLabel5.setVisible(true);
        Txt_IdParti.setVisible(true);
        Btn_EliParti.setVisible(true);
        
        //Administrar Eventos
        jLabel6.setVisible(true);
        jLabel12.setVisible(true);
        Txt_IdEven.setVisible(true);
        Btn_RegiEven.setVisible(true);
        jLabel7.setVisible(true);
        Txt_NombreEven.setVisible(true);
        Txt_DiaEven.setVisible(true);
        cmb_DiaEvento.setVisible(true);
        cmb_MesEvento.setVisible(true);
        Btn_ModiEven.setVisible(true);
        jLabel9.setVisible(true);
        Txt_UbiEven.setVisible(true);
        Btn_EliEven.setVisible(true);
        jLabel10.setVisible(true);
        Txt_Equipo1Even.setVisible(true);
        jLabel11.setVisible(true);
        Txt_Equipo2Even.setVisible(true);
        
        //Programar Partidos
        jLabel13.setVisible(true);
        jLabel15.setVisible(true);
        Txt_IdEvenPro.setVisible(true);
        jLabel14.setVisible(true);
        cmb_HoraApertura.setVisible(true);
        jLabel18.setVisible(true);
        cmb_MAperturaS.setVisible(true);
        cmb_MAperturaP.setVisible(true);
        cmb_HorarioA.setVisible(true);
        Btn_Programar.setVisible(true);
        
        //Resultados Partidos
        jLabel16.setVisible(true);
        jLabel17.setVisible(true);
        Txt_IdEvenResul.setVisible(true);
        jLabel19.setVisible(true);
        Txt_ResulE1.setVisible(true);
        jLabel20.setVisible(true);
        Txt_ResulE2.setVisible(true);
        Btn_Resultados.setVisible(true);
        
        //Titulo
        jLabel1.setVisible(true);
        
        //Salir Modo Administrador
        jButton7.setVisible(true);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_NombreParti = new javax.swing.JTextField();
        Txt_EdadParti = new javax.swing.JTextField();
        Txt_EquiParti = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txt_IdParti = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Btn_RegisParti = new javax.swing.JButton();
        Btn_ModiParti = new javax.swing.JToggleButton();
        Btn_EliParti = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_NombreEven = new javax.swing.JTextField();
        Txt_DiaEven = new javax.swing.JLabel();
        cmb_MesEvento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Txt_UbiEven = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Txt_Equipo1Even = new javax.swing.JTextField();
        Btn_RegiEven = new javax.swing.JButton();
        Btn_ModiEven = new javax.swing.JButton();
        Btn_EliEven = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmb_DiaEvento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Txt_IdEven = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Txt_Equipo2Even = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Txt_IdEvenPro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmb_HoraApertura = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmb_MAperturaP = new javax.swing.JComboBox<>();
        cmb_MAperturaS = new javax.swing.JComboBox<>();
        Btn_Programar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Txt_IdEvenResul = new javax.swing.JTextField();
        Txt_ResulE1 = new javax.swing.JSpinner();
        Txt_ResulE2 = new javax.swing.JSpinner();
        Btn_Resultados = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cmb_HorarioA = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton7 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Equipo:");

        Txt_NombreParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombrePartiActionPerformed(evt);
            }
        });

        Txt_EdadParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_EdadPartiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Id de Participante:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Ver lista participantes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Btn_RegisParti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_RegisParti.setText("Registrar");
        Btn_RegisParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegisPartiActionPerformed(evt);
            }
        });

        Btn_ModiParti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_ModiParti.setText("Modificar");
        Btn_ModiParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModiPartiActionPerformed(evt);
            }
        });

        Btn_EliParti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_EliParti.setText("Eliminar");
        Btn_EliParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliPartiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Administrar eventos");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombre:");

        Txt_DiaEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txt_DiaEven.setText("Fecha:");

        cmb_MesEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ubicacion:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Equipo 1:");

        Btn_RegiEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_RegiEven.setText("Registrar");
        Btn_RegiEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegiEvenActionPerformed(evt);
            }
        });

        Btn_ModiEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_ModiEven.setText("Modificar");
        Btn_ModiEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModiEvenActionPerformed(evt);
            }
        });

        Btn_EliEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_EliEven.setText("Eliminar");
        Btn_EliEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliEvenActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Ver Lista de Eventos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Administrar Participantes");

        cmb_DiaEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Id Evento:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Equipo 2:");

        Txt_Equipo2Even.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Equipo2EvenActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Programar partidos");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Hora:");

        Txt_IdEvenPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdEvenProActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Id Evento:");

        cmb_HoraApertura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel18.setText(":");

        cmb_MAperturaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        cmb_MAperturaS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        cmb_MAperturaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_MAperturaSActionPerformed(evt);
            }
        });

        Btn_Programar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Programar.setText("Programar");
        Btn_Programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProgramarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Resultados partidos");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Id Evento:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Resultado Equipo 1:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Resultado Equipo 2:");

        Txt_IdEvenResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdEvenResulActionPerformed(evt);
            }
        });

        Btn_Resultados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Resultados.setText("Resultados");
        Btn_Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResultadosActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Resultados Partidos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Calendario Partidos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cmb_HorarioA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Relacion equipos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setText("Victorias");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("Salir modo Administrador");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Administrador");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel21.setText("Ingrese a Administrador para poder administrar el sistema");

        jLabel22.setText("Contraseña: Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Btn_ModiEven, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_NombreParti, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_EquiParti, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_EdadParti, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_IdParti, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Btn_EliParti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Btn_ModiParti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Btn_RegisParti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Btn_RegiEven, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Btn_EliEven, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cmb_HoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmb_MAperturaS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(Btn_Programar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmb_MAperturaP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(Txt_IdEvenPro)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_HorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_UbiEven, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_DiaEven, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmb_DiaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(cmb_MesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(Txt_IdEven, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Txt_NombreEven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_ResulE2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_IdEvenResul, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_ResulE1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(46, 46, 46)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Equipo2Even, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Equipo1Even, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Txt_NombreParti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_RegisParti))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Txt_EdadParti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_EquiParti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_IdParti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Btn_EliParti)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_ModiParti)
                            .addComponent(jButton6)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jToggleButton1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Txt_IdEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_RegiEven)
                            .addComponent(Txt_IdEvenPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_NombreEven)
                                    .addComponent(jLabel7))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_DiaEven)
                                    .addComponent(cmb_DiaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_MesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_ModiEven))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(Btn_EliEven)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Txt_Equipo1Even, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Txt_UbiEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Btn_Programar))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(cmb_HoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_MAperturaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_MAperturaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_HorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(115, 115, 115)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(Txt_IdEvenResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(Txt_ResulE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_Equipo2Even, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21))
                            .addComponent(Txt_ResulE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton2)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Resultados)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton Mostrar Lista de participantes
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Muestra la Lista de participantes
        JOptionPane.showMessageDialog(null,"\n Participantes: \n" + laLista);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Btn_RegisPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegisPartiActionPerformed
        // TODO add your handling code here:
        
        //Si los espacios estan en blanco muestra mensaje
        if(Txt_NombreParti.getText().equals("") || Txt_IdParti.getText().equals("") || Txt_EdadParti.getText().equals("") || Txt_EquiParti.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene la informacion");
        }else{
            //Se pasa la informacion de los campos de texto a variables
            String NombreParticipante = Txt_NombreParti.getText();
            int IdParticipante = Integer.parseInt(Txt_IdParti.getText());
            int EdadParticipante = Integer.parseInt(Txt_EdadParti.getText());
            String EquipoParticipante = Txt_EquiParti.getText();
            
            Boolean ExisteIdParticipante = laLista.ExisteIdParticipante(IdParticipante); //Nos guarda el resultado si el participante existe
            
            if(ExisteIdParticipante==false){ //Si el participante no existe
                laLista.inserta(new Participante(IdParticipante, NombreParticipante, EquipoParticipante, EdadParticipante));
                System.out.println(laLista); 

                //Para agregar la informacion en el archivo txt

                File Old_File = new File ("Participante.txt");
                Old_File.delete();
                File New_File = new File ("Participante.txt");
                String InfoParticipantes = laLista.toString();

                try {
                    FileWriter OverWritten_File = new FileWriter(New_File, false);
                    OverWritten_File.write(InfoParticipantes);
                    OverWritten_File.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "Se agrego la informacion");
                
                //Si reinicia los campos
                Txt_NombreParti.setText("");
                Txt_IdParti.setText("");
                Txt_EdadParti.setText("");
                Txt_EquiParti.setText("");
                
            }else{ //Si el participante existe
                JOptionPane.showMessageDialog(null, "El id del participante ya existe");
            }
            
            
        }
        
        
    }//GEN-LAST:event_Btn_RegisPartiActionPerformed

    private void Btn_ModiPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModiPartiActionPerformed
        // TODO add your handling code here:
        //Muestra mensaje si la informacion esta vacia
        if(Txt_NombreParti.getText().equals("") || Txt_IdParti.getText().equals("") || Txt_EdadParti.getText().equals("") || Txt_EquiParti.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene la informacion");
        }else{
            
            String NombreParticipante = Txt_NombreParti.getText();
            int IdParticipante = Integer.parseInt(Txt_IdParti.getText());
            int EdadParticipante = Integer.parseInt(Txt_EdadParti.getText());
            String EquipoParticipante = Txt_EquiParti.getText();
            
            Boolean ExisteIdParticipante = laLista.ExisteIdParticipante(IdParticipante); //Nos guarda la informacion de si el participante existe
            
            if(ExisteIdParticipante==false){
                JOptionPane.showMessageDialog(null, "El participante no existe");
            }
            else{
                laLista.modifica(new Participante(IdParticipante, NombreParticipante, EquipoParticipante, EdadParticipante));

                System.out.println(laLista); 

                //Para pasar la infromacion al archivo txt

                File Old_File = new File ("Participante.txt");
                Old_File.delete();
                File New_File = new File ("Participante.txt");
                String InfoParticipantes = laLista.toString();

                try {
                    FileWriter OverWritten_File = new FileWriter(New_File, false);
                    OverWritten_File.write(InfoParticipantes);
                    OverWritten_File.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "Se modifico la informacion");
                
                //Si reinicia los campos
                Txt_NombreParti.setText("");
                Txt_IdParti.setText("");
                Txt_EdadParti.setText("");
                Txt_EquiParti.setText("");
                
            }
            
        }
        
        
    }//GEN-LAST:event_Btn_ModiPartiActionPerformed

    private void Btn_EliPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliPartiActionPerformed
        // TODO add your handling code here:
        
        if(Txt_IdParti.getText().equals("")){ //Si el espacio esta vacio
            JOptionPane.showMessageDialog(null, "Por favor llene la informacion");
        }else{

            int IdParticipante = Integer.parseInt(Txt_IdParti.getText()); //Guarda la informacion si el participante existe
            
            Boolean ExisteIdParticipante = laLista.ExisteIdParticipante(IdParticipante);
            
            if(ExisteIdParticipante==false){
                JOptionPane.showMessageDialog(null, "El participante no existe");
            }
            else{
                laLista.elimina(IdParticipante);
                
                System.out.println(laLista); 

                //Pasa al informacion al archivo txt
                File Old_File = new File ("Participante.txt");
                Old_File.delete();
                File New_File = new File ("Participante.txt");
                String InfoParticipantes = laLista.toString();

                try {
                    FileWriter OverWritten_File = new FileWriter(New_File, false);
                    OverWritten_File.write(InfoParticipantes);
                    OverWritten_File.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Se elimino la informacion");

                //Se reincia la informacion
                Txt_IdParti.setText("");
            }

        }
        
    }//GEN-LAST:event_Btn_EliPartiActionPerformed

    private void Txt_EdadPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_EdadPartiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_EdadPartiActionPerformed

    private void Btn_RegiEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegiEvenActionPerformed
        // TODO add your handling code here:
        //Muestra el mensaje si los espacios estan en blanco
        if(Txt_NombreEven.getText().equals("")||Txt_IdEven.getText().equals("")||Txt_UbiEven.getText().equals("")||Txt_Equipo1Even.getText().equals("")||Txt_Equipo2Even.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene la informacion");
        }else{
            
            String NombreEvento = Txt_NombreEven.getText();
            int IdEvento = Integer.parseInt(Txt_IdEven.getText());
            String DiaEvento = cmb_DiaEvento.getSelectedItem().toString();
            String MesEvento = cmb_MesEvento.getSelectedItem().toString();
            String FechaEvento = " Dia " + DiaEvento + " Mes " + MesEvento;
            String UbicacionEvento = Txt_UbiEven.getText();
            String NombreEquipo1 = Txt_Equipo1Even.getText();
            String NombreEquipo2 = Txt_Equipo2Even.getText();
            
            boolean ExisteEvento = laListaEvento.existe(IdEvento); //Guarda la informacion si existe el id del evento
            
            if(ExisteEvento==false){
                //Obtiene si el equipo existe o no
                boolean ExisteEquipo1 = laLista.existeEquipo(NombreEquipo1);

                if (ExisteEquipo1==true){ //Si el equipo 1 existe
                    String ParticipantesEquipo1 = laLista.ParticipantesEquipo(NombreEquipo1);
                    boolean ExisteEquipo2 = laLista.existeEquipo(NombreEquipo2);
                    if (ExisteEquipo2==true){ //Si el equipo 2 existe entra para agregarla informacion del evento
                        String ParticipantesEquipo2 = laLista.ParticipantesEquipo(NombreEquipo2);
                        laListaEvento.insertar(new Evento (IdEvento, NombreEvento, FechaEvento,UbicacionEvento, NombreEquipo1, ParticipantesEquipo1, NombreEquipo2, ParticipantesEquipo2));
                        File Old_File = new File ("Eventos.txt");
                        Old_File.delete();
                        File New_File = new File ("Eventos.txt");
                        String InfoEventos = laListaEvento.toString();

                        try {
                            FileWriter OverWritten_File = new FileWriter(New_File, false);
                            OverWritten_File.write(InfoEventos);
                            OverWritten_File.close();
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                        JOptionPane.showMessageDialog(null, "La informacion se agrego");
                        
                        //Se limpia la informacion
                        Txt_NombreEven.setText("");
                        Txt_IdEven.setText("");
                        Txt_UbiEven.setText("");
                        Txt_Equipo1Even.setText("");
                        Txt_Equipo2Even.setText("");

                    }else{
                        JOptionPane.showMessageDialog(null,"El equipo no existe"); //Equipo 2
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"El equipo no existe"); //Equipo 1
                }
            }else{
                JOptionPane.showMessageDialog(null,"El evento ya existe");
            }
            
        }
        
    }//GEN-LAST:event_Btn_RegiEvenActionPerformed

    private void Txt_Equipo2EvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Equipo2EvenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Equipo2EvenActionPerformed
//Para mostrar la lista de eventos
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"\n Participantes: \n" + laListaEvento);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Btn_ModiEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModiEvenActionPerformed
        // TODO add your handling code here:
        
        //Si el espacio del id del evento esta vacio
        if(Txt_IdEven.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene la informacion");
        }else{
            int IdEvento = Integer.parseInt(Txt_IdEven.getText());
            boolean ExisteEvento = laListaEvento.existe(IdEvento); //Guarda si el id del evento existe

            if(ExisteEvento==true){ //Si el equipo 1 existe
                String NombreEvento = Txt_NombreEven.getText();
                String DiaEvento = cmb_DiaEvento.getSelectedItem().toString();
                String MesEvento = cmb_MesEvento.getSelectedItem().toString();
                String FechaEvento = " Dia " + DiaEvento + " Mes " + MesEvento;
                String UbicacionEvento = Txt_UbiEven.getText();
                String NombreEquipo1 = Txt_Equipo1Even.getText();
                String NombreEquipo2 = Txt_Equipo2Even.getText();

                boolean ExisteEquipo1 = laLista.existeEquipo(NombreEquipo1); //Guarda si el equipo existe

                if (ExisteEquipo1==true){
                    String ParticipantesEquipo1 = laLista.ParticipantesEquipo(NombreEquipo1);
                    boolean ExisteEquipo2 = laLista.existeEquipo(NombreEquipo2);
                    if (ExisteEquipo2==true){ //Si el equipo 2 existe modifica la informacion
                        String ParticipantesEquipo2 = laLista.ParticipantesEquipo(NombreEquipo2);
                        laListaEvento.modifica(new Evento (IdEvento, NombreEvento, FechaEvento,UbicacionEvento, NombreEquipo1, ParticipantesEquipo1, NombreEquipo2, ParticipantesEquipo2));
                        File Old_File = new File ("Eventos.txt");
                        Old_File.delete();
                        File New_File = new File ("Eventos.txt");
                        String InfoEventos = laListaEvento.toString();
                        
                        JOptionPane.showMessageDialog(null, "El evento ha sido modificado");

                        try {
                            FileWriter OverWritten_File = new FileWriter(New_File, false);
                            OverWritten_File.write(InfoEventos);
                            OverWritten_File.close();
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"El equipo 2 no existe");
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"El equipo 1 no existe");
                }
            }else{
                JOptionPane.showMessageDialog(null,"El evento no existe");
            }
        }
        
    }//GEN-LAST:event_Btn_ModiEvenActionPerformed

    private void Btn_EliEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliEvenActionPerformed
        // TODO add your handling code here:
        
        //Si los espacios estan vacios
        if(Txt_IdEven.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene la informacion");
        }else{
            int IdEvento = Integer.parseInt(Txt_IdEven.getText());
            boolean ExisteEvento = laListaEvento.existe(IdEvento);

            if(ExisteEvento==true){ //Si el evento existe
                laListaEvento.elimina(IdEvento);
                File Old_File = new File ("Eventos.txt");
                    Old_File.delete();
                    File New_File = new File ("Eventos.txt");
                    String InfoEventos = laListaEvento.toString();
                    
                    JOptionPane.showMessageDialog(null, "El evento ha sido eliminado");

                    try {
                        FileWriter OverWritten_File = new FileWriter(New_File, false);
                        OverWritten_File.write(InfoEventos);
                        OverWritten_File.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
            }else{
                JOptionPane.showMessageDialog(null, "El evento no existe");
            }
        }
        
    }//GEN-LAST:event_Btn_EliEvenActionPerformed

    private void Txt_IdEvenProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdEvenProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdEvenProActionPerformed

    private void Txt_NombrePartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombrePartiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombrePartiActionPerformed

    private void cmb_MAperturaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_MAperturaSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_MAperturaSActionPerformed

    private void Txt_IdEvenResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdEvenResulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdEvenResulActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Resultados: "+ nuevaPila.imprimirPila());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Calendario: "+colapartidos.imprimirCola());
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Btn_ProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProgramarActionPerformed
        // TODO add your handling code here:
        //Si la informacion esta vacia
        if(Txt_IdEvenPro.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor llene la informacion");
        }else{
            
            String IdEvento = Txt_IdEvenPro.getText();
            String Hora = cmb_HoraApertura.getSelectedItem().toString();
            String Minuto1 = cmb_MAperturaP.getSelectedItem().toString();
            String Minuto2 = cmb_MAperturaS.getSelectedItem().toString();
            String HorarioApertura = cmb_HorarioA.getSelectedItem().toString();
            int IdEventoComprueba = Integer.parseInt(Txt_IdEvenPro.getText());
            boolean ExisteIdEvento=laListaEvento.existe(IdEventoComprueba); //Para que nos devuelva el resultado si existe el evento en evento
            boolean ExisteEventoPorgramado = colapartidos.EventoProgramado(IdEventoComprueba); //Nos guarda el resultado si ya el evento esta programado
            
            //Si el numero de evento existe
            if(ExisteIdEvento==true & ExisteEventoPorgramado==false){
                //Junta la informacion para pasarla a la cola de partidos
                //Pasamos el numero de evento para que nos de los nombes de los equipos
                String Prueba =  "Hora "+Hora+":"+Minuto1+Minuto2+" "+HorarioApertura;
                String Equipo1C=laListaEvento.Resultados1(IdEventoComprueba);
                String Equipo2C=laListaEvento.Resultados2(IdEventoComprueba);
                colapartidos.hacerFila(new NodoPartidos(IdEventoComprueba, Prueba, Equipo1C, Equipo2C));
                
                //Para agregar la informacion en el archivo txt

                File Old_File = new File ("Calendario.txt");
                Old_File.delete();
                File New_File = new File ("Calendario.txt");
                //String InfoParticipantes = laLista.toString();
                String CalendarioPartidos = colapartidos.imprimirCola();

                try {
                    FileWriter OverWritten_File = new FileWriter(New_File, false);
                    OverWritten_File.write(CalendarioPartidos);
                    OverWritten_File.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null,"Se programo el evento");

                ResultadoRelacion = laListaEvento.NombreDeEquipos();
                
                Txt_IdEvenPro.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"No existe el numero de evento o ya esta programado");
            }
            
        }
        
    }//GEN-LAST:event_Btn_ProgramarActionPerformed

    private void Btn_ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResultadosActionPerformed
        // TODO add your handling code here:
        
        if(Txt_IdEvenResul.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor llene la informacion");
        }
        else{
            int IdResultadoP = Integer.parseInt(Txt_IdEvenResul.getText());

            boolean ExisteEventoPorgramado = colapartidos.EventoProgramado(IdResultadoP); //Nos guarda el resultado si ya el evento esta programado
            boolean ExisteResultadosEevento;
            
            rutinasresultadosP.p1 = nuevaPila;
            
            //Nos encuentra si ya los resultados de ese evento fueron enviados
            if(rutinasresultadosP.encuentra(IdResultadoP)) //Si nos encuentra que ya se registro los puntos de este evento
            {
                System.out.println("Encontrado");
                ExisteResultadosEevento=true;
            }
            else
            {
                System.out.println("No Encontrado"); //Si no se encontro
                ExisteResultadosEevento=false;
            }

            System.out.println(ExisteResultadosEevento);
            
            //Si el numero de evento existe y esta programado
            if(ExisteEventoPorgramado==true & ExisteResultadosEevento==false){
                String IdEventoPR = Txt_IdEvenResul.getText();
                String ResultadosE1 = Txt_ResulE1.getValue().toString(); //Pasa a string el resultado E1
                int ResultadosE1PR = Integer.parseInt(ResultadosE1); //Pasa a int el resultado E1
                String ResultadosE2 = Txt_ResulE2.getValue().toString(); //Pasa a string el resultado E2
                int ResultadosE2PR = Integer.parseInt(ResultadosE2); //Pasa a int el resultado E2
                //Equipos
                String Equipo1PR=laListaEvento.Resultados1(IdResultadoP);
                String Equipo2PR=laListaEvento.Resultados2(IdResultadoP);

                nuevaPila.apilar(IdResultadoP, Equipo1PR, ResultadosE1PR, Equipo2PR, ResultadosE2PR);

                System.out.println(nuevaPila.imprimirPila());

                String ResultadosPartidos = nuevaPila.imprimirPila();

                //Para agregar la informacion en el archivo txt

                File Old_File = new File ("Resultados.txt");
                Old_File.delete();
                File New_File = new File ("Resultados.txt");
                try {
                    FileWriter OverWritten_File = new FileWriter(New_File, false);
                    OverWritten_File.write(ResultadosPartidos);
                    OverWritten_File.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                
                Prueba=nuevaPila.Victorias(); //Nos devuelve el arbol de las victorias manejado a traves de pilas
                System.out.println(Prueba);

                JOptionPane.showMessageDialog(null,"Se agregaron los resultados exitosamente");
                
                Txt_IdEvenResul.setText("");
                

            }else{
                JOptionPane.showMessageDialog(null,"El evento no ha sido programado, no existe o ya se ha registrado el marcador");
            }
        }
        
    }//GEN-LAST:event_Btn_ResultadosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //Para agregar la informacion en el archivo txt

        File Old_File = new File ("RelacionEquipos.txt");
        Old_File.delete();
        File New_File = new File ("RelacionEquipos.txt");
        try {
            FileWriter OverWritten_File = new FileWriter(New_File, false);
            OverWritten_File.write(ResultadoRelacion);
            OverWritten_File.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(null,"\n Equipos: \n" + ResultadoRelacion);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
        File Old_File = new File ("Victorias.txt");
        Old_File.delete();
        File New_File = new File ("Victorias.txt");
        try {
            FileWriter OverWritten_File = new FileWriter(New_File, false);
            OverWritten_File.write(Prueba);
            OverWritten_File.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(null,"\n Victorias: \n" + Prueba);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        EscondeBotones();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        //Nos pregunta por la contraseña
        String Contraseña=JOptionPane.showInputDialog("\n Escriba la contraseña para entrar al modo Administrador \n");
        //Si la contraseña es correcta ingresa al modo administrador
        if(Contraseña.equals("Admin")){
            JOptionPane.showMessageDialog(null,"Bienvenido Administrador");
            MostrarBotones();
        }//Si la contraseña es incorrecta no nos entra al modo administrador
        else{
             JOptionPane.showMessageDialog(null,"Contraseña invalida, intente de nuevo");
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
    public void toStringParticipantes() {
        JOptionPane.showMessageDialog(null,"\n Participantes: \n" + laLista);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroParticipantes().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_EliEven;
    private javax.swing.JToggleButton Btn_EliParti;
    private javax.swing.JButton Btn_ModiEven;
    private javax.swing.JToggleButton Btn_ModiParti;
    private javax.swing.JButton Btn_Programar;
    private javax.swing.JButton Btn_RegiEven;
    private javax.swing.JButton Btn_RegisParti;
    private javax.swing.JButton Btn_Resultados;
    private javax.swing.JLabel Txt_DiaEven;
    private javax.swing.JTextField Txt_EdadParti;
    private javax.swing.JTextField Txt_EquiParti;
    private javax.swing.JTextField Txt_Equipo1Even;
    private javax.swing.JTextField Txt_Equipo2Even;
    private javax.swing.JTextField Txt_IdEven;
    private javax.swing.JTextField Txt_IdEvenPro;
    private javax.swing.JTextField Txt_IdEvenResul;
    private javax.swing.JTextField Txt_IdParti;
    private javax.swing.JTextField Txt_NombreEven;
    private javax.swing.JTextField Txt_NombreParti;
    private javax.swing.JSpinner Txt_ResulE1;
    private javax.swing.JSpinner Txt_ResulE2;
    private javax.swing.JTextField Txt_UbiEven;
    private javax.swing.JComboBox<String> cmb_DiaEvento;
    private javax.swing.JComboBox<String> cmb_HoraApertura;
    private javax.swing.JComboBox<String> cmb_HorarioA;
    private javax.swing.JComboBox<String> cmb_MAperturaP;
    private javax.swing.JComboBox<String> cmb_MAperturaS;
    private javax.swing.JComboBox<String> cmb_MesEvento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
