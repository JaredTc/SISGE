package Interfaces;

import Render.Render;
import conexion.Conectar;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Interfaces.MenuControlEscolar;
import javax.swing.JCheckBox;

public class FrmAsignacionDocentes extends javax.swing.JInternalFrame {

    //tbl_registros.setDefaultRenderer(Object.class, new Render());        
    JButton btnm;
    JButton btne;

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    PreparedStatement pst;

    public FrmAsignacionDocentes() throws SQLException {
        initComponents();
        OcultarCampos();
        MostrarSemestres();
        MostrarDocentes("");
        MostrarRegistros("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcb_semestre = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcb_curso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcb_grupo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbl_iddocente = new javax.swing.JLabel();
        lbl_semestre = new javax.swing.JLabel();
        lbl_asignatura = new javax.swing.JLabel();
        lbl_grupo = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lbl_nombredocente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcb_turno = new javax.swing.JComboBox<>();
        lbl_turno = new javax.swing.JLabel();
        btn_cargar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_docentes = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_busqueda2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_registros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Completar formulario"));

        jLabel1.setText("Semestre");

        jcb_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar semestre--" }));
        jcb_semestre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_semestreItemStateChanged(evt);
            }
        });
        jcb_semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_semestreActionPerformed(evt);
            }
        });

        jLabel2.setText("Asignatura");

        jcb_curso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_cursoItemStateChanged(evt);
            }
        });

        jLabel4.setText("Grupo");

        jcb_grupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_grupoItemStateChanged(evt);
            }
        });
        jcb_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_grupoActionPerformed(evt);
            }
        });

        jLabel5.setText("Docente");

        lbl_semestre.setText("jLabel6");

        lbl_asignatura.setText("jLabel8");

        lbl_grupo.setText("jLabel9");

        btn_cancelar.setBackground(new java.awt.Color(255, 51, 51));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setDefaultCapable(false);
        btn_cancelar.setFocusPainted(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(90, 166, 255));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorderPainted(false);
        btn_registrar.setDefaultCapable(false);
        btn_registrar.setFocusPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Turno");

        jcb_turno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_turnoItemStateChanged(evt);
            }
        });

        lbl_turno.setText("jLabel7");

        btn_cargar.setText("Cargar Docente");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_iddocente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_nombredocente, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_cargar)
                                    .addComponent(jcb_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_grupo)
                            .addComponent(lbl_turno)
                            .addComponent(lbl_asignatura)
                            .addComponent(btn_registrar)))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcb_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_semestre)))
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcb_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_semestre)
                    .addComponent(btn_cancelar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_asignatura))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_turno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcb_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_grupo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cargar)
                    .addComponent(btn_registrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombredocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iddocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione una registro"));

        tbl_docentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_docentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_docentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_docentes);

        jLabel10.setText("Ingrese cualquier valor que desea buscar");

        txt_busqueda2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busqueda2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_busqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE ASIGNACIONES"));

        tbl_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_registrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_registros);

        jLabel9.setText("Ingrese cualquier valor que desea buscar");

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if (jcb_semestre.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Falta seleccionar un semestre", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_semestre.getText().equals("") || lbl_asignatura.getText().equals("") || lbl_turno.getText().equals("") || lbl_grupo.getText().equals("") || lbl_iddocente.getText().equals("") || lbl_nombredocente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Existen campos vacíos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Asignar(lbl_asignatura.getText(), Integer.parseInt(lbl_iddocente.getText()), lbl_turno.getText(), Integer.parseInt(lbl_semestre.getText()), lbl_grupo.getText());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void tbl_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_registrosMouseClicked
        int column = tbl_registros.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_registros.getRowHeight();

        if (row < tbl_registros.getRowCount() && row >= 0 && column < tbl_registros.getColumnCount() && column >= 0) {
            Object value = tbl_registros.getValueAt(row, column);
            if (value instanceof JButton jButton) {
                jButton.doClick();
                JButton boton = jButton;

                if (boton.getName().equals("m")) {
                    try {
                        EnviarValores();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "No se puede mostrar la ventana de modificaciones" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex.getMessage());
                        //Logger.getLogger(FrmAsignacionDocentes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (boton.getName().equals("e")) {
                    Eliminar();
                }
            }
            if (value instanceof JCheckBox ch) {
                //((JCheckBox)value).doClick();
                if (ch.isSelected() == true) {
                    ch.setSelected(false);
                }
                if (ch.isSelected() == false) {
                    ch.setSelected(true);
                }

            }
        }
    }//GEN-LAST:event_tbl_registrosMouseClicked

    private void jcb_semestreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_semestreItemStateChanged
        try {
            MostrarIDSemestres();
            jcb_curso.removeAllItems();
            MostrarAsignaturas();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jcb_semestreItemStateChanged

    private void jcb_cursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_cursoItemStateChanged
        try {
            MostrarIDAsignatura();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jcb_cursoItemStateChanged

    private void jcb_turnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_turnoItemStateChanged
        try {
            MostrarIDTurno();
            if (jcb_turno.getSelectedIndex() == 0) {
                jcb_grupo.removeAllItems();
                MostrarGruposMatutinos();
            } else if (jcb_turno.getSelectedIndex() == 1) {
                jcb_grupo.removeAllItems();
                MostrarGruposVespertinos();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcb_turnoItemStateChanged

    private void jcb_grupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_grupoItemStateChanged
        try {
            MostrarIDGrupo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcb_grupoItemStateChanged

    private void jcb_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_semestreActionPerformed
        MostrarCampos();
    }//GEN-LAST:event_jcb_semestreActionPerformed

    private void tbl_docentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_docentesMouseClicked
        int fila = tbl_docentes.getSelectedRow();
        if (fila >= 0) {
            jLabel5.setVisible(true);            
            lbl_iddocente.setText(tbl_docentes.getValueAt(fila, 0).toString());
            lbl_nombredocente.setText(tbl_docentes.getValueAt(fila, 1).toString() + " " + tbl_docentes.getValueAt(fila, 2).toString()
                    + " " + tbl_docentes.getValueAt(fila, 3).toString());
            btn_registrar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debes selecionar una fila de la tabla", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tbl_docentesMouseClicked

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        try {
            MostrarRegistros(txt_busqueda.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrmAsignacionDocentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void jcb_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_grupoActionPerformed
        
    }//GEN-LAST:event_jcb_grupoActionPerformed

    private void txt_busqueda2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busqueda2KeyReleased
        MostrarDocentes(txt_busqueda2.getText());
    }//GEN-LAST:event_txt_busqueda2KeyReleased

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        JOptionPane.showMessageDialog(null, "Debes elegir un registro de la tabla que se muestra a continuación");
        jPanel2.setVisible(true);        
    }//GEN-LAST:event_btn_cargarActionPerformed

    public void MostrarSemestres() {
        try (Statement st = conn.createStatement()){
            String ssql = "SELECT descripcion FROM semestre";
            
            ResultSet rs = st.executeQuery(ssql);
            while (rs.next()) {
                jcb_semestre.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar registros " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDSemestres() {
        try (  Statement st = conn.createStatement()){
            String ssql = "SELECT id_semestre FROM semestre WHERE descripcion='" + jcb_semestre.getSelectedItem().toString() + "'";
          
            ResultSet rs = st.executeQuery(ssql);
            while (rs.next()) {
                lbl_semestre.setText(rs.getString("id_semestre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar registros " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarAsignaturas() throws SQLException {
        String query = "SELECT c.nombre as materia from curso c, semestre s WHERE c.semestre ='" + lbl_semestre.getText() + "'and s.id_semestre=c.semestre order by materia asc";
        try ( Statement st = conn.createStatement()){

           
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                jcb_curso.addItem(rs.getString("materia"));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar registros " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDAsignatura() {
        String sql = "SELECT id_curso FROM curso WHERE nombre ='" + jcb_curso.getSelectedItem().toString() + "'";
        try (   Statement st = conn.createStatement() ) {
         
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_asignatura.setText(rs.getString("id_curso"));
                jcb_turno.removeAllItems();
                MostrarTurnos();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los id " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarTurnos() {
        String sql = "SELECT descripcion as turno from turno";
        try ( Statement st = conn.createStatement() ) {
           
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_turno.addItem(rs.getString("turno"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar turnos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDTurno() {
        String sql = "SELECT id_turno FROM turno WHERE descripcion ='" + jcb_turno.getSelectedItem().toString() + "'";
        try ( Statement st = conn.createStatement() ){
           
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_turno.setText(rs.getString("id_turno"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los id " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarGruposMatutinos() {
        String sql = "select g.grupo as grupo from grupos g, carrera c, semestre s where carrera='ISC' and semestre='"
                + Integer.parseInt(lbl_semestre.getText()) + "' and g.grupo not like '%21' and s.id_semestre=g.semestre and c.id_carrera=g.carrera";
        try ( Statement st = conn.createStatement()) {
           
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grupo.addItem(rs.getString("grupo"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarGruposVespertinos() {
        String sql = "select g.grupo as grupo from grupos g, carrera c, semestre s where carrera='ISC' and semestre='"
                + Integer.parseInt(lbl_semestre.getText()) + "' and g.grupo like '%21' and s.id_semestre=g.semestre and c.id_carrera=g.carrera";
        try (Statement st = conn.createStatement()){
            
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grupo.addItem(rs.getString("grupo"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDGrupo() {
        String sql = "SELECT id_grupo FROM grupos WHERE grupo ='" + jcb_grupo.getSelectedItem().toString() + "'";
        try (Statement st = conn.createStatement() ){
            
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_grupo.setText(rs.getString("id_grupo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los id " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void OcultarCampos() {
        lbl_asignatura.setVisible(false);
        jPanel2.setVisible(false);
        lbl_grupo.setVisible(false);
        lbl_semestre.setVisible(false);
        lbl_turno.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jcb_curso.setVisible(false);
        jcb_turno.setVisible(false);
        jcb_grupo.setVisible(false);
        btn_cancelar.setVisible(false);
        btn_cargar.setVisible(false);
        btn_registrar.setVisible(false);
    }

    public void MostrarCampos() {
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);        
        jcb_curso.setVisible(true);
        jcb_turno.setVisible(true);
        jcb_grupo.setVisible(true);
        btn_cancelar.setVisible(true);
        btn_cargar.setVisible(true);        
    }

    public void MostrarDocentes(String busqueda) {
        DefaultTableModel modelo_docentes = new DefaultTableModel();
        modelo_docentes.addColumn("Id");
        modelo_docentes.addColumn("Paterno");
        modelo_docentes.addColumn("Materno");
        modelo_docentes.addColumn("Nombre");
        tbl_docentes.setModel(modelo_docentes);
        String sql="";
        if(txt_busqueda2.equals("")){
            sql="SELECT id_docente, paterno, materno, nombre FROM docente ORDER BY id_docente ASC";
        }else {            
            sql="SELECT id_docente, paterno, materno, nombre FROM docente WHERE id_docente LIKE '%" + busqueda + "%' OR paterno LIKE'%" + busqueda + "%'OR materno LIKE'%" + busqueda + "%'OR nombre LIKE'%" + busqueda + "%'";   
        }
        String datos[] = new String[4];
        try (Statement st = conn.createStatement()){           
            
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo_docentes.addRow(datos);
            }
            tbl_docentes.setModel(modelo_docentes);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar docentes", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Asignar(String curso, int docente, String turno, int semestre, String grupo) {
        String sql = "INSERT INTO imparte (id_curso, id_docente, id_turno, id_semestre, grupo) VALUES (?,?,?,?,?)";

        try (Statement st = conn.createStatement()){
            
            ResultSet rs = st.executeQuery("SELECT * FROM imparte WHERE id_curso LIKE '" + curso + "' AND id_docente LIKE '" + docente + "' AND id_turno LIKE '" + turno + "' AND id_semestre LIKE '" + semestre + "' AND grupo = '" + grupo + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El docente ya ha sido asignado a esta asignatura, grupo y curso", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = conn.prepareStatement(sql);
                pst.setString(1, curso);
                pst.setInt(2, docente);
                pst.setString(3, turno);
                pst.setInt(4, semestre);
                pst.setString(5, grupo);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Asignación exitosa");
                Limpiar();
                MostrarRegistros("");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Surgió un error " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Limpiar() {
        jcb_semestre.setSelectedIndex(0);
        jcb_curso.setSelectedIndex(0);
        jcb_turno.setSelectedIndex(0);
        jcb_grupo.setSelectedIndex(0);
        lbl_asignatura.setText("");
        lbl_grupo.setText("");
        lbl_iddocente.setText("");
        lbl_nombredocente.setText("");
        lbl_semestre.setText("");
        lbl_turno.setText("");
        OcultarCampos();
    }

    public void MostrarRegistros(String busqueda) throws SQLException {
        tbl_registros.setDefaultRenderer(Object.class, new Render());
        JButton btnm = new JButton("Modificar");
        btnm.setName("m");
        JButton btne = new JButton("Eliminar");
        btne.setName("e");

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Asignatura");
        modelo.addColumn("Docente");
        modelo.addColumn("Turno");
        modelo.addColumn("Semestre");
        modelo.addColumn("Carrera");
        modelo.addColumn("Accion 1");
        modelo.addColumn("Accion 2");
        tbl_registros.setModel(modelo);
        String sql = "";
        if (busqueda.equals("")) {
            sql = "SELECT * FROM imparte";
        } else {
            sql = "SELECT * FROM imparte WHERE id_curso LIKE '%" + busqueda + "%' OR id_docente LIKE'%" + busqueda + "%'OR id_turno LIKE'%" + busqueda + "%'OR id_semestre LIKE'%" + busqueda + "%' OR grupo LIKE'%" + busqueda + "%'";
        }
        Object puestos[] = new Object[7];
        try ( Statement st = conn.createStatement()) {
           
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                puestos[0] = rs.getString(1);
                puestos[1] = rs.getString(2);
                puestos[2] = rs.getString(3);
                puestos[3] = rs.getString(4);
                puestos[4] = rs.getString(5);
                puestos[5] = btnm;
                puestos[6] = btne;
                modelo.addRow(puestos);
            }
            tbl_registros.setModel(modelo);
        } catch (SQLException e) {
        }
    }

    public void EnviarValores() throws SQLException {
        try {
            ModificarAsignaciones modificar = new ModificarAsignaciones();
            modificar.setVisible(true);
            int fila = tbl_registros.getSelectedRow();
            if (fila >= 0) {
                String id_curso = (String) tbl_registros.getValueAt(fila, 0).toString();
                modificar.recibir(id_curso);
                modificar.MostrarDatosCurso();
            } else {
                JOptionPane.showMessageDialog(null, "Debes selecionar una fila de la tabla", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        }
    }

    public void Eliminar() {
      pst = null;
        int fila = tbl_registros.getSelectedRow();
        String id = tbl_registros.getValueAt(fila, 0).toString();
        //Object id = btne;
        try  {
            pst = conn.prepareStatement("DELETE FROM imparte WHERE id_curso='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el registro?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarRegistros("");
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar este registro", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcb_curso;
    private javax.swing.JComboBox<String> jcb_grupo;
    private javax.swing.JComboBox<String> jcb_semestre;
    private javax.swing.JComboBox<String> jcb_turno;
    private javax.swing.JLabel lbl_asignatura;
    private javax.swing.JLabel lbl_grupo;
    private javax.swing.JLabel lbl_iddocente;
    private javax.swing.JLabel lbl_nombredocente;
    private javax.swing.JLabel lbl_semestre;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JTable tbl_docentes;
    private javax.swing.JTable tbl_registros;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_busqueda2;
    // End of variables declaration//GEN-END:variables
}
