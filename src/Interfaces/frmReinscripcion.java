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

public class frmReinscripcion extends javax.swing.JInternalFrame {

    ModificarReinscripcion modificar = new ModificarReinscripcion();

    //tbl_registros.setDefaultRenderer(Object.class, new Render());        
    JButton btnm;
    JButton btne;

    Conectar condb = new Conectar();
    Connection conn = Conectar.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public frmReinscripcion() throws SQLException {
        initComponents();
        MostrarRegistros("");
        MostrarCarreras();
        ObtenerSemestre();
        lbl_idcarrera.setVisible(false);
        lbl_idgrupo.setVisible(false);
        lbl_idturno.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txt_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_registros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        id_alumno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_paterno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_materno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_carrera = new javax.swing.JLabel();
        lbl_dateturno = new javax.swing.JLabel();
        lbl_grupo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcb_grupos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbl_turno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcb_carrera = new javax.swing.JComboBox<>();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lbl_idgrupo = new javax.swing.JLabel();
        lbl_idcarrera = new javax.swing.JLabel();
        lbl_idturno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_semestre = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });

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
        jScrollPane1.setViewportView(tbl_registros);

        jLabel9.setText("Ingrese cualquier valor que desea buscar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 45, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE REINSCRIPCIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 13, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(90, 166, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setBorderPainted(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Buscar por ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, -1, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Apellido Paterno :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));
        jPanel2.add(lbl_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 13, 158, 16));

        jLabel4.setText("Apellido Materno :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, -1, -1));
        jPanel2.add(lbl_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 42, 158, 16));

        jLabel6.setText("Nombre completo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, -1, -1));
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 71, 158, 16));

        jLabel10.setText("Número telefónico:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, -1, -1));
        jPanel2.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 100, 158, 16));

        jLabel11.setText("Carrera:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 129, -1, -1));

        jLabel12.setText("Grupo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, -1, -1));

        jLabel13.setText("Turno");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 187, -1, -1));
        jPanel2.add(lbl_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 129, 158, 16));
        jPanel2.add(lbl_dateturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 189, 158, 18));
        jPanel2.add(lbl_grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 158, 158, 18));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 136, -1, 230));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Datos del Alumno");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("GRUPO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jcb_grupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--ELEGIR GRUPO--" }));
        jcb_grupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_gruposItemStateChanged(evt);
            }
        });
        jcb_grupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_gruposMouseClicked(evt);
            }
        });
        jcb_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_gruposActionPerformed(evt);
            }
        });
        jcb_grupos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcb_gruposKeyReleased(evt);
            }
        });
        jPanel3.add(jcb_grupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 233, -1));

        jLabel5.setText("TURNO:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel3.add(lbl_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 171, 16));

        jLabel8.setText("CARRERA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jcb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--ELEGIR CARRERA--" }));
        jcb_carrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_carreraItemStateChanged(evt);
            }
        });
        jcb_carrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_carreraMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcb_carreraMousePressed(evt);
            }
        });
        jcb_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_carreraActionPerformed(evt);
            }
        });
        jPanel3.add(jcb_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 233, -1));

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
        jPanel3.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        btn_registrar.setBackground(new java.awt.Color(90, 166, 255));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setDefaultCapable(false);
        btn_registrar.setFocusPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 90, 30));

        lbl_idgrupo.setText("jLabel7");
        jPanel3.add(lbl_idgrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lbl_idcarrera.setText("jLabel7");
        jPanel3.add(lbl_idcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lbl_idturno.setText("jLabel7");
        jPanel3.add(lbl_idturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel7.setText("SEMESTRE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel3.add(lbl_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 183, 16));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Complete los Siguientes Campos");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(665, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel15)
                .addGap(248, 248, 248)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        try {
            MostrarRegistros(txt_busqueda.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Registro_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void tbl_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_registrosMouseClicked
        int column = tbl_registros.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_registros.getRowHeight();

        if (row < tbl_registros.getRowCount() && row >= 0 && column < tbl_registros.getColumnCount() && column >= 0) {
            Object value = tbl_registros.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("m")) {
                    try {
                        EnviarValores();

                        //this.dispose();
                        //System.out.println("Click en el boton modificar");
                        //EVENTOS MODIFICAR
                    } catch (SQLException ex) {
                        Logger.getLogger(Registro_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (boton.getName().equals("e")) {
                    //JOptionPane.showConfirmDialog(null, "Desea eliminar este registro", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    //System.out.println("Click en el boton eliminar");
                    Eliminar();
                    //EVENTOS ELIMINAR
                }
            }
            if (value instanceof JCheckBox) {
                //((JCheckBox)value).doClick();
                JCheckBox ch = (JCheckBox) value;
                if (ch.isSelected() == true) {
                    ch.setSelected(false);
                }
                if (ch.isSelected() == false) {
                    ch.setSelected(true);
                }

            }
        }
    }//GEN-LAST:event_tbl_registrosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarIdAlumno(Integer.parseInt(id_alumno.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcb_gruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_gruposItemStateChanged
        try {
            MostrarIDGrupos();
            ObtenerTurno();
            ObtenerSemestre();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcb_gruposItemStateChanged

    private void jcb_gruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_gruposMouseClicked

    }//GEN-LAST:event_jcb_gruposMouseClicked

    private void jcb_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_gruposActionPerformed

    }//GEN-LAST:event_jcb_gruposActionPerformed

    private void jcb_carreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_carreraItemStateChanged
        try {
            MostrarIDCarreras();
            jcb_grupos.removeAllItems();
            MostrarGrupoXCarrera();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jcb_carreraItemStateChanged

    private void jcb_carreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_carreraMouseClicked

    }//GEN-LAST:event_jcb_carreraMouseClicked

    private void jcb_carreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_carreraMousePressed

    }//GEN-LAST:event_jcb_carreraMousePressed

    private void jcb_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_carreraActionPerformed

    }//GEN-LAST:event_jcb_carreraActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if (id_alumno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el id de alumno ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_grupos.getSelectedIndex() == -1 || jcb_grupos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar el grupo ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_carrera.getSelectedIndex() == -1 || jcb_carrera.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar la carrera ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_idturno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se ha cargado el turno ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Registrar(Integer.parseInt(id_alumno.getText()), Integer.parseInt(lbl_idgrupo.getText()), lbl_idturno.getText(), lbl_idcarrera.getText());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void jcb_gruposKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcb_gruposKeyReleased
        ObtenerSemestre();
    }//GEN-LAST:event_jcb_gruposKeyReleased

    public void BuscarIdAlumno(int id) {

        String sql = "select a.paterno as paterno, a.materno as materno, a.nombre as nombre, a.telefono as telefono, t.descripcion as turno, g.grupo as grupo, c.descripcion as carrera from alumno a, inscripcion i, carrera c, turno t, grupos g"
                + " where i.id_alumno=a.id_alumno and c.id_carrera=g.carrera and i.grupo=g.id_grupo and i.turno=t.id_turno and i.id_alumno='" + id + "'";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Datos encontrados");
                lbl_paterno.setText(rs.getString("paterno"));
                lbl_materno.setText(rs.getString("materno"));
                lbl_nombre.setText(rs.getString("nombre"));
                lbl_telefono.setText(rs.getString("telefono"));
                lbl_carrera.setText(rs.getString("carrera"));
                lbl_grupo.setText(rs.getString("grupo"));
                lbl_dateturno.setText(rs.getString("turno"));
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no esta inscrito en ninguna carrera", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar registros " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarGrupoXCarrera() {
        String sql = "select g.grupo from grupos g, carrera c where g.carrera=c.id_carrera and g.grupo NOT like '1%' and g.carrera='" + lbl_idcarrera.getText() + "'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grupos.addItem(rs.getString("g.grupo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar registros " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDGrupos() {
        String sql = "SELECT id_grupo FROM grupos WHERE grupo ='" + jcb_grupos.getSelectedItem().toString() + "'";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_idgrupo.setText(rs.getString("id_grupo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarCarreras() {
        String sql = "SELECT descripcion FROM carrera";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_carrera.addItem(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar las carreras " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDCarreras() {
        String sql = "SELECT id_carrera FROM carrera WHERE descripcion ='" + jcb_carrera.getSelectedItem().toString() + "'";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_idcarrera.setText(rs.getString("id_carrera"));
                MostrarGrupoXCarrera();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Registrar(int alumno, int grupo, String turno, String carrera) {

        String id_inscripcion = "";

        String sql = "INSERT INTO reinscripcion (id_alumno, grupo, turno, carrera) VALUES (?,?,?,?)";

        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM reinscripcion WHERE id_alumno LIKE '" + alumno + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El alumno ya se encuentra reinscrito", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = conn.prepareStatement(sql);
                pst.setInt(1, alumno);
                pst.setInt(2, grupo);
                pst.setString(3, turno);
                pst.setString(4, carrera);
                pst.executeUpdate();
                pst = conn.prepareStatement("SELECT MAX(id_reinscripcion) as id from reinscripcion");
                rs = pst.executeQuery();
                if (rs.next()) {
                    id_inscripcion = rs.getString(String.valueOf("id"));
                }
                JOptionPane.showMessageDialog(null, "Registro completado, ID de reinscripcion asignado " + id_inscripcion);
                MostrarRegistros("");
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Surgio un error " + e.getMessage(), "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Limpiar() {
        id_alumno.setText("");
        lbl_materno.setText("");
        lbl_paterno.setText("");
        lbl_nombre.setText("");
        lbl_telefono.setText("");
        lbl_idcarrera.setText("");
        lbl_idgrupo.setText("");
        lbl_idturno.setText("");
        lbl_turno.setText("");
        lbl_carrera.setText("");
        lbl_dateturno.setText("");
        lbl_grupo.setText("");
        lbl_turno.setText("");
        jcb_carrera.setSelectedIndex(0);
        jcb_grupos.setSelectedIndex(-1);
    }

    public void MostrarRegistros(String busqueda) throws SQLException {
        tbl_registros.setDefaultRenderer(Object.class, new Render());
        JButton btnm = new JButton("Modificar");
        btnm.setName("m");
        JButton btne = new JButton("Eliminar");
        btne.setName("e");

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("#");
        modelo.addColumn("Alumno");
        modelo.addColumn("Grupo");
        modelo.addColumn("Turno");
        modelo.addColumn("Carrera");
        modelo.addColumn("Accion 1");
        modelo.addColumn("Accion 2");
        tbl_registros.setModel(modelo);
        String sql = "";
        if (busqueda.equals("")) {
            sql = "SELECT * FROM reinscripcion ORDER BY id_reinscripcion ASC";
        } else {
            sql = "SELECT * FROM reinscripcion WHERE id_reinscripcion LIKE '%" + busqueda + "%' OR grupo LIKE'%" + busqueda + "%'OR turno LIKE'%" + busqueda + "%'OR carrera LIKE'%" + busqueda + "%'";
        }
        Object puestos[] = new Object[7];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
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
        modificar.setVisible(true);
        int fila = tbl_registros.getSelectedRow();
        if (fila >= 0) {
            String id_inscripcion = (String) tbl_registros.getValueAt(fila, 0).toString();
            String id_alumno = (String) tbl_registros.getValueAt(fila, 1).toString();
            String id_grupo = (String) tbl_registros.getValueAt(fila, 2).toString();
            String id_turno = (String) tbl_registros.getValueAt(fila, 3).toString();
            String id_carrera = (String) tbl_registros.getValueAt(fila, 4).toString();
            modificar.recibir(id_inscripcion, id_alumno, id_grupo, id_turno, id_carrera);
            modificar.MostrarGrupoXID();
        } else {
            JOptionPane.showMessageDialog(null, "Debes selecionar una fila de la tabla", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Eliminar() {
        PreparedStatement pst = null;
        int fila = tbl_registros.getSelectedRow();
        String id = tbl_registros.getValueAt(fila, 0).toString();
        //Object id = btne;
        try {
            pst = conn.prepareStatement("DELETE FROM reinscripcion WHERE id_reinscripcion='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el registro?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarRegistros("");
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar este registro", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ObtenerTurno() {
        String grupo = jcb_grupos.getSelectedItem().toString();
        char x;
        if (jcb_carrera.getSelectedIndex() == 1) {
            x = grupo.charAt(6);
            if (x == '1') {
                lbl_turno.setText("MATUTINO");
                lbl_idturno.setText("M");
            } else if (x == '2') {
                lbl_turno.setText("VESPERTINO");
                lbl_idturno.setText("V");
            }
        } else if (jcb_carrera.getSelectedIndex() == 3) {
            x = grupo.charAt(4);
            if (x == '1') {
                lbl_turno.setText("MATUTINO");
                lbl_idturno.setText("M");
            } else if (x == '2') {
                lbl_turno.setText("VESPERTINO");
                lbl_idturno.setText("V");
            }
        } else if (jcb_carrera.getSelectedIndex() != 1 && jcb_carrera.getSelectedIndex() != 3) {
            x = grupo.charAt(3);
            if (x == '1') {
                lbl_turno.setText("MATUTINO");
                lbl_idturno.setText("M");
            } else if (x == '2') {
                lbl_turno.setText("VESPERTINO");
                lbl_idturno.setText("V");
            }
        }
    }

    public void ObtenerSemestre() {
        String grupo = jcb_grupos.getSelectedItem().toString();
        char x = grupo.charAt(0);

        if (x == '2') {
            lbl_semestre.setText("SEGUNDO");
        } else if (x == '3') {
            lbl_semestre.setText("TERCERO");
        } else if (x == '4') {
            lbl_semestre.setText("CUARTO");
        } else if (x == '5') {
            lbl_semestre.setText("QUINTO");
        } else if (x == '6') {
            lbl_semestre.setText("SEXTO");
        } else if (x == '7') {
            lbl_semestre.setText("SEPTIMO");
        } else if (x == '8') {
            lbl_semestre.setText("OCTAVO");
        } else if (x == '9') {
            lbl_semestre.setText("NOVENO");
        } else {
            lbl_semestre.setText("");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField id_alumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_carrera;
    private javax.swing.JComboBox<String> jcb_grupos;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_dateturno;
    private javax.swing.JLabel lbl_grupo;
    private javax.swing.JLabel lbl_idcarrera;
    private javax.swing.JLabel lbl_idgrupo;
    private javax.swing.JLabel lbl_idturno;
    private javax.swing.JLabel lbl_materno;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_paterno;
    private javax.swing.JLabel lbl_semestre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JTable tbl_registros;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
