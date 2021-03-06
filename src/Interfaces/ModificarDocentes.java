package Interfaces;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import conexion.Conectar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModificarDocentes extends javax.swing.JFrame {

    Conectar con = new Conectar();
    Connection conn = con.conexion();
    PreparedStatement pst;
    public ModificarDocentes() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("MODIFICAR REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setText("Id Alumno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txt_id.setEditable(false);
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, -1));

        jLabel3.setText("Apellidp Paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        jPanel1.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 239, -1));

        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel1.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 238, -1));

        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 238, -1));

        jLabel6.setText("Numero telefonico:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 236, -1));

        btn_cancelar.setBackground(new java.awt.Color(255, 51, 51));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setDefaultCapable(false);
        btn_cancelar.setFocusPainted(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, 30));

        btn_modificar.setBackground(new java.awt.Color(90, 166, 255));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(null);
        btn_modificar.setBorderPainted(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, 30));

        jLabel7.setText("Correo electronico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 238, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
    this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try {
            Modificar();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarDocentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed
   
    public void recibir(String id, String paterno, String materno, String nombre, String telefono, String correo) {
        txt_id.setText(id);
        txt_paterno.setText(paterno);
        txt_materno.setText(materno);
        txt_nombre.setText(nombre);
        txt_telefono.setText(telefono);
        txt_correo.setText(correo);
    }

    public void Modificar() throws SQLException {        
//        Panel_Docentes pandoc = new Panel_Docentes();
        String id = txt_id.getText();
        String paterno = txt_paterno.getText();
        String materno = txt_materno.getText();
        String nombre = txt_nombre.getText();
        String telefono = txt_telefono.getText();
        String correo = txt_correo.getText();

         pst = null;
        try {
            pst = conn.prepareStatement("UPDATE docente SET paterno='" + paterno
                    + "',materno='" + materno + "',nombre='" + nombre + "',telefono='" + telefono + "',correo='" + correo + "' WHERE id_docente='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "??Est??s seguro de modificar el registro?", "CONFIRMACI??N", 0);
            if (s == 0) {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente");               
                this.dispose();
//                pandoc.setVisible(true);
//                pandoc.MostrarRegistros("");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_materno;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_paterno;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
