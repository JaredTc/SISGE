package Interfaces;


import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
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
import sisge.Curso;
import sisge.Grupo;
import sisge.items;
import sisge.llenarCombos;

/**
 *
 * @author Jared
 */
public class FrmListaReport extends javax.swing.JInternalFrame {

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    /**
     * Creates new form FrmListaReport
     */
    public FrmListaReport() {
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
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("LISTA GRUPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel1.add(jComboBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Materia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jPanel1.add(jComboBoxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        jPanel1.add(jComboBoxMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Grupo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Turno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(90, 166, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generar");
        jButton1.setBorderPainted(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GenLista();
    }//GEN-LAST:event_jButton1ActionPerformed
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

    public void GenLista() {

        String idCurso = (jComboBoxMateria.getItemAt(jComboBoxMateria.getSelectedIndex()).getId());
        String idGrupo = Integer.toString(jComboBoxGrupo.getItemAt(jComboBoxGrupo.getSelectedIndex()).getId());
              String Grupo = (jComboBoxGrupo.getItemAt(jComboBoxGrupo.getSelectedIndex()).getGrupo());
        String turno = jComboBoxTurno.getItemAt(jComboBoxTurno.getSelectedIndex()).getId();

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/SISGE/SISGE/Reportes/ListaGrupal/ListaGrupal_"+Grupo+".pdf")).setInitialLeading(20);
            documento.open();
            documento.add(new Chunk(""));
            PdfPTable tabla = new PdfPTable(4);

            tabla.addCell("Nombre");
            tabla.addCell("Paterno");
            tabla.addCell("Materno");
            tabla.addCell("Asistencia");

            try (Statement st = conn.createStatement()) {
                String sql = "SELECT  \n"
                        + "	 al.nombre, al.paterno,  al.materno \n"
                        + "	FROM alumno al, toma tm, curso cs\n"
                        + "	WHERE tm.id_curso = '" + idCurso + "'\n"
                        + "	AND tm.id_turno = '" + turno + "'\n"
                        + "	AND tm.id_grupo = '" + idGrupo + "'\n"
                        + "	AND tm.id_alumno = al.id_alumno\n"
                        + "	GROUP BY al.nombre";
                
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell("");

                    } while (rs.next());

                    Image foto = Image.getInstance(ruta + "/Desktop/SISGE/SISGE/src/assets/UTC.png");
                    foto.scaleToFit(50, 50);
                    foto.setAlignment(Chunk.ALIGN_RIGHT);
                    documento.add(foto);

                    Font f = new Font();
                    f.setStyle(Font.BOLD);
                    f.setSize(15);
                    Paragraph p = new Paragraph();
                    p.setFont(f);
                    p.add("LISTA GRUPAL ");
                    p.setAlignment(Element.ALIGN_CENTER);

                    //
                    documento.add(p);
                  
                    documento.add(Chunk.NEWLINE);
                   documento.add(tabla);
                }
            } catch (Exception e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado con éxito en el escritorio");
        } catch (Exception e) {
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
