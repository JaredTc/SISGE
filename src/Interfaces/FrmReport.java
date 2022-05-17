/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.protocol.Resultset;
import conexion.Conectar;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sisge.Alumno;
import sisge.Curso;
import sisge.Docente;
import sisge.Grupo;
import sisge.Semestre;
import sisge.items;
import sisge.llenarCombos;

/**
 *
 * @author Jared
 */
public class FrmReport extends javax.swing.JInternalFrame {

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();
//    PreparedStatement pst;
//    Statement st;

    /**
     * Creates new form FrmReport
     */
    public FrmReport() {
        initComponents();
        llenarCombox();
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
        jComboBoxGrupo = new javax.swing.JComboBox<>();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_generar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("GENERAR REPORTE DE CALIFICACIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jComboBoxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGrupoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        jComboBoxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurnoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, 30));

        jPanel1.add(jComboBoxMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 180, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText(" Turno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        btn_generar.setBackground(new java.awt.Color(90, 166, 255));
        btn_generar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_generar.setForeground(new java.awt.Color(255, 255, 255));
        btn_generar.setText("Generar");
        btn_generar.setBorderPainted(false);
        btn_generar.setDefaultCapable(false);
        btn_generar.setFocusPainted(false);
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Grupo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Materia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGrupoActionPerformed

    private void jComboBoxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTurnoActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
        GenReport();
//        System.out.println(idCurso + " - " + idGrupo + " - " + turno);
    }//GEN-LAST:event_btn_generarActionPerformed


    private void GenReport() {

        String idCurso = (jComboBoxMateria.getItemAt(jComboBoxMateria.getSelectedIndex()).getId());
        String idGrupo = Integer.toString(jComboBoxGrupo.getItemAt(jComboBoxGrupo.getSelectedIndex()).getId());
                      String Grupo = (jComboBoxGrupo.getItemAt(jComboBoxGrupo.getSelectedIndex()).getGrupo());
        String turno = jComboBoxTurno.getItemAt(jComboBoxTurno.getSelectedIndex()).getId();
        Document documento = new Document(PageSize.A4.rotate());
        try {
            String ruta = System.getProperty("user.home");

            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/SISGE/SISGE/Reportes/Reportecalificacion/Reporte_Calificacion_"+ Grupo+".pdf")).setInitialLeading(20);
            documento.open();
            documento.add(new Chunk(""));

            PdfPTable table = new PdfPTable(5);
//            table.addCell("ID");
            table.addCell("Nombre");
            table.addCell("Paterno");
            table.addCell("Materno");
            table.addCell("Calificacion");
            table.addCell("Firma");

            try {
                String sql = "SELECT  \n"
                        + "	 al.nombre, al.paterno,  al.materno, tm.calificacion \n"
                        + "	FROM alumno al, toma tm, curso cs\n"
                        + "	WHERE tm.id_curso = '" + idCurso + "'\n"
                        + "	AND tm.id_turno = '" + turno + "'\n"
                        + "	AND tm.id_grupo = '" + idGrupo + "'\n"
                        + "	AND tm.id_alumno = al.id_alumno\n"
                        + "	GROUP BY al.nombre";

                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    do {
                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));
                        table.addCell("");

                    } while (rs.next());

                    Image foto = Image.getInstance(ruta + "/Desktop/SISGE/SISGE/src/assets/UTC.png");
                    foto.scaleToFit(50, 50);
                    foto.setAlignment(Chunk.ALIGN_LEFT);
                    documento.add(foto);

                    Font f = new Font();
                    f.setStyle(Font.BOLD);
                    f.setSize(15);
                    Paragraph p = new Paragraph();
                    p.setFont(f);
                    p.add("REPORTE CALIFICACIONES ");
                    p.setAlignment(Element.ALIGN_CENTER);
                    documento.add(p);
                    documento.add(Chunk.NEWLINE);

                    try {
                        String query = "SELECT cs.nombre FROM curso cs , toma tm\n"
                                + "	WHERE cs.id_curso ='" + idCurso + "'\n"
                                + "	GROUP BY nombre ";
                        st = conn.createStatement();
                        rs = st.executeQuery(query);

                        if (rs.next()) {
                            String cs = rs.getString("cs.nombre");
     
                            String curso = cs.toUpperCase();
                            Font f2 = new Font();
                            f2.setStyle(Font.BOLD);
                            f2.setSize(15);
                            Paragraph p2 = new Paragraph();
                            p2.setFont(f2);
                            p2.add(curso);
                            p2.setAlignment(Element.ALIGN_CENTER);
                            documento.add(p2);
                            documento.add(Chunk.NEWLINE);
                        }

                    } catch (Exception e) {
                    }

                    documento.add(table);

                }

            } catch (Exception e) {
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado con Exito en el escritorio");
        } catch (Exception e) {
        }
    }

    public void llenarCombox() {
        Conectar.conexion();
        llenarCombos CSO = new llenarCombos();
        ArrayList<Curso> cursos = CSO.Course();
        for (int i = 0; i < cursos.size(); i++) {
            jComboBoxMateria.addItem(
                    new Curso(cursos.get(i).getId(), cursos.get(i).getNombre()));
        }

        llenarCombos trn = new llenarCombos();
        ArrayList<items> turno = trn.Turno();
        for (int i = 0; i < turno.size(); i++) {
            jComboBoxTurno.addItem(
                    new items(turno.get(i).getId(), turno.get(i).getDescripcion()));
        }
        llenarCombos gpo = new llenarCombos();
        ArrayList<Grupo> grupo = gpo.Grupos();
        for (int i = 0; i < grupo.size(); i++) {
            jComboBoxGrupo.addItem(
                    new Grupo(grupo.get(i).getId(), grupo.get(i).getGrupo()));
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JComboBox<Grupo> jComboBoxGrupo;
    private javax.swing.JComboBox<Curso> jComboBoxMateria;
    private javax.swing.JComboBox<items> jComboBoxTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
