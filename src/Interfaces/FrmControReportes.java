/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conectar;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sisge.Alumno;
import sisge.Carrera;
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
public class FrmControReportes extends javax.swing.JInternalFrame {

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    /**
     * Creates new form FrmControReportes
     */
    public FrmControReportes() {
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
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxGrupo = new javax.swing.JComboBox<>();
        jComboBoxTipoReport = new javax.swing.JComboBox<>();
        jComboBoxCarrera = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("REPORTES CONTROL ESCOLAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 23, -1, -1));

        jPanel1.add(jComboBoxAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Carrera");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel1.add(jComboBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, -1));

        jComboBoxTipoReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Constancia" }));
        jPanel1.add(jComboBoxTipoReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, -1));

        jPanel1.add(jComboBoxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Alumno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Grupo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Reporte");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(90, 166, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GenReport();
//        if (jComboBoxTipoReport.getSelectedIndex() == 0) {
//            GenReport();
//        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void llenarCombox() {

        Conectar.conexion();
        llenarCombos std = new llenarCombos();
        ArrayList<Alumno> alumnos = std.Alumnos();
        for (int i = 0; i < alumnos.size(); i++) {
            jComboBoxAlumno.addItem(
                    new Alumno(alumnos.get(i).getId(), alumnos.get(i).getNombre()));
        }

        llenarCombos gpo = new llenarCombos();
        ArrayList<Grupo> grupo = gpo.Grupos();
        for (int i = 0; i < grupo.size(); i++) {
            jComboBoxGrupo.addItem(
                    new Grupo(grupo.get(i).getId(), grupo.get(i).getGrupo()));
        }

        llenarCombos crr = new llenarCombos();
        ArrayList<Carrera> carrera = crr.Carrera();
        for (int i = 0; i < carrera.size(); i++) {
            jComboBoxCarrera.addItem(
                    new Carrera(carrera.get(i).getId(), carrera.get(i).getDescripcion()));
        }

    }
    public static final String LOGO = "C:\\Users\\Jared\\Desktop\\SISGE-\\SISGE\\src\\assets\\logo.png";
    public static final String UTC = "C:\\Users\\Jared\\Desktop\\SISGE-\\SISGE\\src\\assets\\UTC.png";

    private void GenReport() {
//
        String Alumno = jComboBoxAlumno.getItemAt(jComboBoxAlumno.getSelectedIndex()).getNombre();
        String idGrupo = jComboBoxGrupo.getItemAt(jComboBoxGrupo.getSelectedIndex()).getGrupo();
        String carrera = jComboBoxCarrera.getItemAt(jComboBoxCarrera.getSelectedIndex()).getDescripcion();

//        String name = Alumno.toUpperCase();
        Document documento = new Document();
//        PageSize.A4.rotate()
        try {
            String ruta = System.getProperty("user.home");

            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/SISGE-/SISGE/Reportes/Constancias/Constancia_"+ Alumno +".pdf"));
            
            documento.open();
            documento.add(new Chunk(""));

            try {
                String sql = "	SELECT al.nombre , al.paterno , al.materno \n"
                        + "	FROM alumno al, carrera cr\n"
                        + "	WHERE al.nombre ='" + Alumno + "' \n";
//                        + "	AND cr.id_carrera = '"+ carrera+"'";
//
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd");
                    String dia = dtf4.format(LocalDateTime.now());
                    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM");
                    String mes =  dtf3.format(LocalDateTime.now());
                    
                    String alumno = rs.getString("al.nombre");
                    String paterno = rs.getString("al.paterno");
                    String materno = rs.getString("al.materno");
                    String datos = alumno + " " + paterno + " " + materno;
                    String name = datos.toUpperCase();
                    Image foto = Image.getInstance(ruta + "/Desktop/SISGE-/SISGE/src/assets/UTC.png");
                    foto.scaleToFit(60, 60);
                    foto.setAlignment(Chunk.ALIGN_RIGHT);
                    documento.add(foto);

                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
//                
                    Font f = new Font();
                    f.setStyle(Font.BOLD);
                    f.setSize(15);
                    Paragraph p = new Paragraph();
                    p.setFont(f);
                    p.add("UNIVERSIDAD TECNOLOGICA DE CHIMALHUACAN");
                    p.setAlignment(Element.ALIGN_CENTER);
                    documento.add(p);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);

                    Paragraph paragraphLorem = new Paragraph();
                    paragraphLorem.add(" Por medio de la presente certifico que " + name + "  se encuentra cursando  la Carrera de " + carrera + " en la Universidad Tecnologica de Chimalhuacan,"
                            + "en este plantel estudantil en el grupo " + idGrupo + " Asi mismo se aclara que no adeuda materias de su anterior semestre."
                            + "Se extiende la presente constancia a los fines de ser presentadopor peticion del interesado. \nEn  Chimalhuacan EDOMEX a los " + dia + " dias del mes de "+ mes +" del año en curso, ");
                    paragraphLorem.setAlignment(Element.ALIGN_LEFT);
                    documento.add(paragraphLorem);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    documento.add(Chunk.NEWLINE);
                    Paragraph att = new Paragraph();
                    att.add("Atentamente!");
                    att.setAlignment(Element.ALIGN_CENTER);
                    documento.add(att);
                    documento.add(Chunk.NEWLINE);
                    Paragraph paragrapname = new Paragraph();
                    paragrapname.add("Profa. Ma. Concepción Velazco R.");
                    paragrapname.setAlignment(Element.ALIGN_CENTER);
                    documento.add(paragrapname);
                    documento.add(Chunk.NEWLINE);
                    Paragraph dr = new Paragraph();
                    dr.add("Directora académica");
                    dr.setAlignment(Element.ALIGN_CENTER);
                    documento.add(dr);

//                    Font f2 = new Font();
//                    f2.setStyle(Font.BOLD);
//                    f2.setSize(15);
//                    Paragraph p2 = new Paragraph();
//                    p2.setFont(f2);
//                    p2.add(curso);
//                    p2.setAlignment(Element.ALIGN_CENTER);
//                    documento.add(p2);
//                    documento.add(Chunk.NEWLINE);
//                if (rs.next()) {
////                    String alumno = rs.getString("al.nombre");
////                     String paterno = rs.getString("al.paterno");
////                      String materno = rs.getString("al.materno");
//                 
                }
            } catch (Exception e) {
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado con Exito en el escritorio");
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumno;
    private javax.swing.JComboBox<Carrera> jComboBoxCarrera;
    private javax.swing.JComboBox<Grupo> jComboBoxGrupo;
    private javax.swing.JComboBox<String> jComboBoxTipoReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
