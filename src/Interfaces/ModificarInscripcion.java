package Interfaces;

/**
 *
 * @author gmgv_
 */
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

public class ModificarInscripcion extends javax.swing.JFrame {
    
    Conectar con = new Conectar();
    Connection conn = con.conexion();
    
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public ModificarInscripcion() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarCarreras();
        MostrarTurno();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_paterno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_materno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_idinscripcion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_alumno = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_carrera = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_grupo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_dateturno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_datesemestre = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del alumno"));

        jLabel2.setText("Apellido Paterno :");

        jLabel4.setText("Apellido Materno :");

        jLabel6.setText("Nombre completo:");

        jLabel10.setText("Número telefónico:");

        jLabel7.setText("Id Inscripcion:");

        jLabel9.setText("Id de alumno:");

        jLabel11.setText("Carrera:");

        jLabel12.setText("Grupo:");

        jLabel13.setText("Turno: ");

        jLabel15.setText("Semestre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_idinscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dateturno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_datesemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_idinscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_dateturno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(lbl_datesemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione los nuevos datos a guardar"));

        jLabel3.setText("GRUPO");

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

        jLabel5.setText("TURNO:");

        lbl_turno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_turnoKeyReleased(evt);
            }
        });

        jLabel8.setText("CARRERA:");

        jcb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--ELEGIR CARRERA--" }));
        jcb_carrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_carreraItemStateChanged(evt);
            }
        });
        jcb_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_carreraActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_registrar.setText("MODIFICAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        lbl_idgrupo.setText("jLabel7");

        lbl_idcarrera.setText("jLabel7");

        lbl_idturno.setText("jLabel7");
        lbl_idturno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_idturnoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_idcarrera))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_idturno))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_idgrupo))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_registrar)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idcarrera))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idgrupo))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idturno))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_registrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("MODIFICAR REGISTRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_gruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_gruposItemStateChanged
        try {
            MostrarIDGrupos();
           ObtenerTurno();
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

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void lbl_idturnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_idturnoKeyReleased
        MostrarTurno();
    }//GEN-LAST:event_lbl_idturnoKeyReleased

    private void lbl_turnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_turnoKeyReleased
        MostrarTurno();
    }//GEN-LAST:event_lbl_turnoKeyReleased

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        try {
            Modificar();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void jcb_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_carreraActionPerformed
    
    public void Limpiar() {
        
        lbl_materno.setText("");
        lbl_paterno.setText("");
        lbl_nombre.setText("");
        lbl_telefono.setText("");
        lbl_idcarrera.setText("");
        lbl_idgrupo.setText("");
        lbl_idturno.setText("");
        lbl_turno.setText("");
        jcb_carrera.setSelectedIndex(0);
        jcb_grupos.setSelectedIndex(-1);
    }    
    
    public void MostrarCarreras() {
        String sql = "SELECT descripcion FROM carrera";
        try (Statement st = conn.createStatement()){
            
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_carrera.addItem(rs.getString("descripcion"));
                MostrarGrupoXCarrera();                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar las carreras " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarCarreraXID() {
        String sql = "SELECT descripcion FROM carrera WHERE id_carrera='" + lbl_idcarrera.getText() + "'";
        try {
             st = conn.createStatement();
           rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_carrera.setSelectedItem(rs.getString("descripcion"));                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar las carreras " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarIDCarreras() {
        String sql = "SELECT id_carrera FROM carrera WHERE descripcion ='" + jcb_carrera.getSelectedItem().toString() + "'";
        try {
           st = conn.createStatement();
             rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_idcarrera.setText(rs.getString("id_carrera"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarGrupoXCarrera() {
        String sql = "select g.grupo from grupos g, carrera c where g.carrera=c.id_carrera and g.grupo like '1%' and g.carrera='" + lbl_idcarrera.getText() + "'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grupos.addItem(rs.getString("g.grupo"));
                MostrarGrupoXID();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar registros " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarGrupoXID() {
        String sql = "SELECT grupo FROM grupos WHERE id_grupo='" + Integer.parseInt(lbl_idgrupo.getText()) + "'";
        try {
             st = conn.createStatement();
             rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grupos.setSelectedItem(rs.getString("grupo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarIDGrupos() {
        String sql = "SELECT id_grupo FROM grupos WHERE grupo ='" + jcb_grupos.getSelectedItem().toString() + "'";
        try {
           st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_idgrupo.setText(rs.getString("id_grupo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los grupos " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void recibir(String id_inscripcion, String id_alumno, String id_grupo, String id_turno, String id_carrera) {
        lbl_idinscripcion.setText(id_inscripcion);
        lbl_alumno.setText(id_alumno);
        lbl_idgrupo.setText(id_grupo);
        lbl_idturno.setText(id_turno);
        lbl_idcarrera.setText(id_carrera);
        MostrarDatosAlumno();
        MostrarCarreraXID();
        MostrarGrupoXID();
        MostrarTurno();        
    }
    
    public void Modificar() throws SQLException {
        String id_inscripcion = lbl_idinscripcion.getText();
        String id_alumno = lbl_alumno.getText();
        String id_grupo = lbl_idgrupo.getText();
        String id_turno = lbl_idturno.getText();
        String id_carrera = lbl_idcarrera.getText();
        
         pst = null;
        try {
            pst = conn.prepareStatement("UPDATE inscripcion SET id_alumno='" + id_alumno
                    + "',grupo='" + id_grupo + "',turno='" + id_turno + "',carrera='" + id_carrera + "' WHERE id_inscripcion='" + id_inscripcion + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿Estás seguro de modificar el registro?", "CONFIRMACIÓN", 0);
            if (s == 0) {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa, para ver los cambios, recargue el formulario");
                this.dispose();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e, "Error inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarDatosAlumno() {
        int id= Integer.parseInt(lbl_idinscripcion.getText());
        try {
            String sql = "select a.id_alumno as id, a.paterno as paterno, a.materno as materno, a.nombre as nombre, a.telefono as telefono, t.descripcion as turno, g.grupo as grupo, c.descripcion as carrera, s.descripcion as semestre"
                    + " from alumno a, inscripcion i, carrera c, turno t, grupos g, semestre s"
                    + " where i.id_alumno=a.id_alumno and c.id_carrera=g.carrera and i.grupo=g.id_grupo and i.turno=t.id_turno and g.semestre=s.id_semestre and i.id_alumno=a.id_alumno and i.id_inscripcion='" + id + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_alumno.setText(rs.getString("id"));
                lbl_paterno.setText(rs.getString("paterno"));
                lbl_materno.setText(rs.getString("materno"));
                lbl_nombre.setText(rs.getString("nombre"));
                lbl_telefono.setText(rs.getString("telefono"));
                lbl_carrera.setText(rs.getString("carrera"));
                lbl_grupo.setText(rs.getString("grupo"));
                lbl_dateturno.setText(rs.getString("turno"));
                lbl_datesemestre.setText(rs.getString("semestre"));
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se cargaron los datos " + e.getMessage(), "Error inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void MostrarTurno() {
        if (lbl_idturno.getText().equals("M")) {
            lbl_turno.setText("MATUTINO");
        } else if (lbl_idturno.getText().equals("V")) {
            lbl_turno.setText("VESPERTINO");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcb_carrera;
    private javax.swing.JComboBox<String> jcb_grupos;
    private javax.swing.JLabel lbl_alumno;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_datesemestre;
    private javax.swing.JLabel lbl_dateturno;
    private javax.swing.JLabel lbl_grupo;
    private javax.swing.JLabel lbl_idcarrera;
    private javax.swing.JLabel lbl_idgrupo;
    private javax.swing.JLabel lbl_idinscripcion;
    private javax.swing.JLabel lbl_idturno;
    private javax.swing.JLabel lbl_materno;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_paterno;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_turno;
    // End of variables declaration//GEN-END:variables
}
