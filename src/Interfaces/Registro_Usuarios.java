/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

import conexion.Conectar;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registro_Usuarios extends javax.swing.JInternalFrame {

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public Registro_Usuarios() throws SQLException {
        initComponents();
        MostrarRoles();
        lbl_idrol.setVisible(false);
        jPanel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcb_roles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_password2 = new javax.swing.JPasswordField();
        btn_cancelar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        lbl_idrol = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("GENERAR CREDENCIAL");

        jLabel2.setText("ROL:");

        jcb_roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONE ROL -- " }));
        jcb_roles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_rolesItemStateChanged(evt);
            }
        });

        jLabel3.setText("ID :");

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre de usuario:");

        jLabel5.setText("Contraseña:");

        jLabel6.setText("Confirmar contraseña:");

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_crear.setText("CREAR CREDENCIAL");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_crear))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_crear))
                .addContainerGap())
        );

        lbl_idrol.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_roles, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lbl_idrol)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(5, 5, 5)
                .addComponent(lbl_idrol)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void jcb_rolesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_rolesItemStateChanged
        try {
            MostrarIdRoles();
        } catch (SQLException ex) {
            Logger.getLogger(Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcb_rolesItemStateChanged

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            BuscarIdXRol();
        } catch (SQLException ex) {
            Logger.getLogger(Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        if (txt_password2.getText().equals(txt_password.getText())) {
            RegistrarUsuario();
        }else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden: ", "Error en campos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public void MostrarRoles() throws SQLException {
        st = conn.createStatement();
        try {
            String sql = "SELECT descripcion FROM rol";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_roles.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e.getMessage());
        }

    }

    public void MostrarIdRoles() throws SQLException {
        st = conn.createStatement();
        try {
            String sql = "SELECT id FROM rol WHERE descripcion ='" + jcb_roles.getSelectedItem().toString() + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_idrol.setText(rs.getString("id"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e.getMessage());
        }
    }

    public void BuscarIdXRol() throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs;
        try {
            String sql = "";
            switch (jcb_roles.getSelectedIndex()) {
                case 1 -> {
                    sql = "SELECT * FROM administrador WHERE id_administrador='" + txt_busqueda.getText() + "'";
                    rs = st.executeQuery(sql);
                    if (rs.next()) {
                        jPanel1.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "El alumno no se encuentra registrado en sistema", "Error de datos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                case 2 -> {
                    sql = "SELECT * FROM alumno WHERE id_alumno='" + txt_busqueda.getText() + "'";
                    rs = st.executeQuery(sql);
                    if (rs.next()) {
                        jPanel1.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "El alumno no se encuentra registrado en sistema", "Error de datos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                case 3 -> {
                    sql = "SELECT * FROM encargado WHERE id_encargado='" + txt_busqueda.getText() + "'";
                    rs = st.executeQuery(sql);
                    if (rs.next()) {
                        jPanel1.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "El alumno no se encuentra registrado en sistema", "Error de datos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                case 4 -> {
                    sql = "SELECT * FROM docente WHERE id_docente='" + txt_busqueda.getText() + "'";
                    rs = st.executeQuery(sql);
                    if (rs.next()) {
                        jPanel1.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "El alumno no se encuentra registrado en sistema", "Error de datos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion no valida", "Error de datos", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error en la BD", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void RegistrarUsuario() {

        String sql = "INSERT INTO usuarios (usuario, password, id_rol) VALUES (?,?,?)";
        try {            
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM usuarios WHERE  usuario LIKE '" + txt_usuario.getText() + "' AND password LIKE '" + txt_password2.getText() + "' AND id_rol LIKE '" + Integer.parseInt(lbl_idrol.getText()) + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Ya existe una credencial con estos datos", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txt_usuario.getText());
                    pst.setString(2, txt_password2.getText());
                    pst.setInt(3, Integer.parseInt(lbl_idrol.getText()));
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "La credencial para el id de alumno: " + txt_busqueda.getText() + " con id de rol: " + Integer.parseInt(lbl_idrol.getText()) + " se creo con exito");
                    Limpiar();
                }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar registro: " + e.getMessage(), "Error en la BD", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Limpiar(){
        txt_busqueda.setText("");
        txt_password.setText("");
        txt_password2.setText("");
        txt_usuario.setText("");
        lbl_idrol.setText("");
        jcb_roles.setSelectedIndex(0);
        jPanel1.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_roles;
    private javax.swing.JLabel lbl_idrol;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password2;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}